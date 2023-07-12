package superTrunfoDinossauro;

//IMPORTANDO AS BIBLIOTECAS NECESSÁRIAS
import java.io.BufferedReader; // BIBLIOTECA P/ LEITURA DE DADOS DE ENTRADA
import java.io.InputStreamReader; // BIBLIOTECA P/ LEITURA DE DADOS DE ENTRADA
import java.io.OutputStream; // BIBLIOTECA P/ SAÍDA DE DADOS
import java.net.HttpURLConnection; // BIBLIOTECA P/ CONEXÃO HTTP
import java.net.URL; // BIBLIOTECA P/ TRABALHAR COM URLs

public class connectGPT {
	// DEFININDO AS CONSTANTES DE URL E API KEY
	private static final String apiUrl = "https://api.openai.com/v1/chat/completions";
	private static final String apiKey = "MY-API-KEY-HERE"; // CHAVE API AQUI: https://platform.openai.com/account/api-keys

	public static String getGPTResponse(String userInput) throws Exception { // userInput: ARMAZENA A ENTRADA DO USUÁRIO
		// CRIANDO CONSTRUTOR: CRIANDO URL COM O ENDEREÇO DA API
		URL url = new URL(apiUrl);

		// ## ABRINDO CONEXÃO HTTP COM A URL
		HttpURLConnection request = (HttpURLConnection) url.openConnection();

		// CONFIGURAÇÃO DA SOLICITAÇÃO
		request.setRequestMethod("POST");
		request.setRequestProperty("Content-Type", "application/json; utf-8");
		request.setRequestProperty("Authorization", "Bearer " + apiKey);
		request.setDoOutput(true);

		// ARMAZENANDO OS PARÂMETROS EM VARIÁVEIS
		String model = "gpt-3.5-turbo"; // MODELO DO GPT
		int maxTokens = 3500; // DEFININDO O N° MÁX DE TOKENS

		// MONTANDO O CORPO DA SOLICITAÇÃO NO FORMATO JSON
		String requestData = String.format(
				"{\"model\": \"%s\", \"messages\": [{\"role\": \"user\", \"content\": \"%s\"}], \"max_tokens\": %d}",
				model, userInput, maxTokens);

		// ENVIANDO A SOLICITAÇÃO PARA O SERVIDOR
		try (OutputStream os = request.getOutputStream()) {
			byte[] input = requestData.getBytes("utf-8");
			os.write(input, 0, input.length);
		}

		// OBTENDO O CÓDIGO DE RESPOSTA HTTP DA CONEXÃO
		int responseCode = request.getResponseCode();
		System.out.println("Response Code: " + responseCode); // IMPRIMINDO O CÓDIGO DE RESPOSTA HTTP

		// System.out.println(requestData);
		// VERIFICANDO SE O CÓDIGO DE RESPOSTA É DIFERENTE DE 200
		if (responseCode != 200) {
			if (responseCode == 400) {
				System.out.println("Erro de conexão: 400 Bad Request");
				System.out.println(
						"Indica que minha solicitação possui uma sintaxe inválida ou não pode ser processada pelo servidor.");

			} else if (responseCode == 401) {
				System.out.println("Erro de conexão: 401 Unauthorized");
				System.out.println(
						" Indica que eu não tenho permissão para acessar o recurso solicitado. Preciso fornecer autenticação válida.");

			} else if (responseCode == 403) {
				System.out.println("Erro de conexão: 403 Forbidden");
				System.out.println(
						"Indica que não tenho permissão para acessar o recurso solicitado, mesmo que eu esteja autenticado. Isso ocorre devido a restrições de acesso impostas pelo servidor.");

			} else if (responseCode == 404) {
				System.out.println("Erro de conexão: 404 Not Found");
				System.out.println(
						"Indica que o recurso solicitado não foi encontrado no servidor. Pode ser devido a um URL incorreto, recurso movido ou excluído.");
			} else if (responseCode == 429) {
				System.out.println("Erro de conexão: 429 Too Many Requests");
				System.out
						.println("Indica que o usuário enviou muitas solicitações em um determinado período de tempo.");
			} else if (responseCode == 500) {
				System.out.println("Erro de conexão: 500 Internal Server Error");
				System.out.println(
						"Indica que ocorreu um erro interno no servidor durante o processamento da minha solicitação. É um problema no código do servidor.");
			} else if (responseCode == 503) {
				System.out.println("Erro de conexão: 503 o servidor está temporariamente indisponível.");
			} else {
				System.out.println("Erro de conexão: " + responseCode);
			}

			return null; // SE A RESPOSTA FOR DIFERENTE DE 200, ENCERRA A OPERAÇÃO
		}

		// ===== JSON
		// LENDO A RESPOSTA DO SERVIDOR (MANIPULANDO EXTRAÇÃO TEXTO JSON)
		StringBuilder response = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream(), "utf-8"))) {
			String responseLine = null;
			while ((responseLine = br.readLine()) != null) {
				response.append(responseLine.trim());
			}
		}

		// RETORNANDO A RESPOSTA JSON COMPLETA
		String jsonResponse = response.toString();

		return jsonResponse;

	}

	// ===== EXTRAINDO A RESPOSTA DESEJADA DO JSON DE RESPOSTA
	// (MANIPULANDO RESPOSTA JSON - EXTRAINDO O CORPO DE TEXTO RECEBIDO)
	public static String getExtractedResponse(String jsonResponse) {
		int startIndex = jsonResponse.indexOf("\"content\": \"");
		if (startIndex != -1) {
			startIndex += "\"content\": \"".length();
			int endIndex = jsonResponse.indexOf("\"", startIndex);
			String extractedResponse = jsonResponse.substring(startIndex, endIndex);
			return extractedResponse;
		} else {
			return null;
		}
	}
}
