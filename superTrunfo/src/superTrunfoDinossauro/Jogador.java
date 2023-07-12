package superTrunfoDinossauro;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

abstract class Jogador {
	protected String nome;
	protected LinkedList<Carta> monte;

	public Jogador(String nome, LinkedList<Carta> monte) {
		this.nome = nome;
		this.monte = monte;
	}

	public String getNome() {
		return nome;
	}

	public LinkedList<Carta> getMonte() {
		return monte;
	}

	public int getQuantidadeCartas() {
		return monte.size();
	}

	public abstract Atributo escolherAtributo(Carta carta);

	public Carta jogarCarta() {
		return monte.poll();
	}

	public void receberCartas(List<Carta> list) {
		monte.addAll(list);
	}

	public boolean possuiCartas() {
		return !monte.isEmpty();
	}
}

class JogadorReal extends Jogador {
	public JogadorReal(String nome, LinkedList<Carta> monte) {
		super(nome, monte);
	}

	public Atributo escolherAtributo(Carta carta) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("\n" + nome + ", escolha um atributo para comparar:");
		ArrayList<Atributo> atributos = carta.getAtributos();
		for (int i = 0; i < atributos.size(); i++) {
			System.out.println((i + 1) + ". " + atributos.get(i));
		}

		int opcao = 0;
		boolean opcaoValida = false;
		while (!opcaoValida) {
			try {
				System.out.print("Opção: ");
				opcao = leitor.nextInt();
				leitor.nextLine(); // LIMPANDO O BUFFER DO SCANNER

				if (opcao < 1 || opcao > atributos.size()) {
					System.out.println("Opção inválida! Digite novamente.");
				} else {
					opcaoValida = true;
				}
			} catch (InputMismatchException e) {
				System.out.println("Opção inválida! Digite novamente.");
				leitor.nextLine(); // LIMPANDO O BUFFER DO SCANNER
			}
		}
		System.out.println("");
		return atributos.get(opcao - 1);
	}
}

class JogadorRandomico extends Jogador {
	public JogadorRandomico(String nome, LinkedList<Carta> monte) {
		super(nome, monte);
	}

	public Atributo escolherAtributo(Carta carta) {
		ArrayList<Atributo> atributos = carta.getAtributos();
		int indice = (int) (Math.random() * atributos.size());
		return atributos.get(indice);
	}
}

class JogadorIA extends Jogador {

	public JogadorIA(String nome, LinkedList<Carta> monte) {
		super(nome, monte);
	}

	public Atributo escolherAtributo(Carta carta) {
		ArrayList<Atributo> atributos = carta.getAtributos();

		// MANIPULANDO O userInput DE ACORDO COM O TEMA
		String userInput = null;
		//System.out.println("TEMA DO JOGO: " + carta.getTema()); // IMPRIMINDO O TEMA DO JOGO

		switch (carta.getTema()) {
		case "Dinossauros":
			userInput = "No jogo Super Trunfo Dinossauros, a vitória em cada rodada é determinada pelo jogador cuja carta "
					+ "apresenta o maior valor em um atributo escolhido, em comparação aos demais participantes. "
					+ "Os atributos em questão refletem características de diferentes espécies de dinossauros que "
					+ "viveram milhões de anos atrás, como altura, comprimento, peso e a época em que o dinossauro viveu. "
					+ "Na presente rodada, você deve fazer uma comparação entre os atributos do dinossauro indicado na sua "
					+ "carta e aqueles das espécies de dinossauros que existiram no passado distante. Após essa análise, "
					+ "identifique e selecione o atributo que, segundo seu julgamento, oferece a maior vantagem para vencer a rodada: ";
			break;

		case "Carros de Luxo":
			userInput = "No jogo Super Trunfo Carros de Luxo, a vitória em cada rodada é determinada pelo jogador cuja carta "
					+ "apresenta o maior valor em um atributo escolhido, em comparação aos demais participantes. "
					+ "Os atributos em questão refletem características de diferentes modelos de carros de luxo, "
					+ "como cilindradas, potência, velocidade, peso e comprimento. "
					+ "Na presente rodada, você deve fazer uma comparação entre os atributos do carro indicado na sua "
					+ "carta e aqueles dos modelos de carros de luxo existentes no mundo. Após essa análise, "
					+ "identifique e selecione o atributo que, segundo seu julgamento, oferece a maior vantagem para vencer a rodada: ";
			break;

		case "Carros Envenenados":
			userInput = "No jogo Super Trunfo Carros Envenenados, a vitória em cada rodada é determinada pelo jogador cuja carta "
					+ "apresenta o maior valor em um atributo escolhido, em comparação aos demais participantes. "
					+ "Os atributos em questão refletem características de diferentes modelos de carros envenenados, "
					+ "como cilindradas, potência, velocidade, período de tempo necessário para que um veículo acelere de 0 a 100 quilômetros por hora e Peso. "
					+ "Na presente rodada, você deve fazer uma comparação entre os atributos do carro indicado na sua "
					+ "carta e aqueles dos modelos de carros envenenados existentes no mundo. Após essa análise, "
					+ "identifique e selecione o atributo que, segundo seu julgamento, oferece a maior vantagem para vencer a rodada: ";
			break;

		case "Aviões a Jato":
			userInput = "No jogo Super Trunfo Aviões a Jato, a vitória em cada rodada é determinada pelo jogador cuja carta "
					+ "apresenta o maior valor em um atributo escolhido, em comparação aos demais participantes. "
					+ "Os atributos em questão refletem características de diferentes modelos Aviões a Jato, "
					+ "como peso máximo, velocidade, altitude de vôo, comprimento e altura. "
					+ "Na presente rodada, você deve fazer uma comparação entre os atributos do Avião a Jato indicado na sua "
					+ "carta e aqueles dos modelos de Aviões a Jato existentes no mundo. Após essa análise, "
					+ "identifique e selecione o atributo que, segundo seu julgamento, oferece a maior vantagem para vencer a rodada: ";
			break;
		}
		// INSERINDO A INFORMATIVA DA CARTA
		// Super TRUNFO DINOSSAUROS
		if (carta.getTema().equals("Dinossauros")) {
			userInput += "Nome: " + carta.getNome() + ", Categoria: " + carta.getCategoria() + ", Atributos: ";
			for (int i = 0; i < atributos.size(); i++) {
				userInput += (i + 1) + "- " + atributos.get(i).getNome() + ": " + atributos.get(i).getValor() + " "
						+ atributos.get(i).getUnidadeMedida();
				if (i < 3) {
					userInput += "; ";
				}
			}
			userInput += ". [Escreva apenas a opção correta, com máximo 8 letras, em uma frase: 'Opção x.', em que x é o número da opção].";
			//System.out.println(userInput);
		} else {
			userInput += "Nome: " + carta.getNome() + ", Categoria: " + carta.getCategoria() + ", Atributos: ";
			for (int i = 0; i < atributos.size(); i++) {
				userInput += (i + 1) + "- " + atributos.get(i).getNome() + ": " + atributos.get(i).getValor() + " "
						+ atributos.get(i).getUnidadeMedida();
				if (i < 4) {
					userInput += "; ";
				}
			}
			userInput += ". [Escreva apenas a opção correta, com máximo 8 letras, em uma frase: 'Opção x.', em que x é o número da opção].";
			//System.out.println(userInput);
		}
		// CONECTANDO COM MODELO GPT P/ OBTER A RESPOSTA
		try {
			String respostaGPT = connectGPT.getGPTResponse(userInput);
			String extractedResponse = connectGPT.getExtractedResponse(respostaGPT);

			String respostaExtracted = extractedResponse;
			System.out.println("Resposta GPT: " + extractedResponse); // IMPRIME A OPÇÃO CORRETA
			System.out.println("");

			// ===== MANIPULANDO A RESPOSTA
			// System.out.println(respostaGPT); // IMPRIME JSON
			// CONVERTENDO RESPOSTA P/ UM NÚMERO INTEIRO
			int indiceAtributoEscolhido = Integer.parseInt(respostaExtracted.replaceAll("[^0-9]", "")); // REMOVENDO TODOS
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// CARACTERES NÃO NUMÉRICOS DA STRING
			//System.out.println("Índice escolhido: " + indiceAtributoEscolhido);

			// VERIFICANDO SE O ÍNDICE É VÁLIDO
			if (indiceAtributoEscolhido >= 1 && indiceAtributoEscolhido <= atributos.size()) {
				return atributos.get(indiceAtributoEscolhido - 1);
			} else {
				// SE ÍNDICE INVÁLIDO, ESCOLHER UM ATRIBUTO ALEATORIAMENTE
				System.out.println("Índice escolhido é inválido, um atributo aleatório será escolhido.");
				Atributo atributoAleatorio = atributos.get((int) (Math.random() * atributos.size()));
				return atributoAleatorio;
			}
		} catch (Exception e) {
			// TRATANDO QUALQUER EXCEÇÃO QUE POSSA OCORRER AO OBTER A RESOSTA DO MODELO GPT
			// ESCOLHENDO UM ATRIBUTO ALEATÓRIO (NESSE CASO)
			System.out.println("Houve um problema ao obter a resposta do GPT, um atributo aleatório será escolhido.");
			Atributo atributoAleatorio = atributos.get((int) (Math.random() * atributos.size()));
			return atributoAleatorio;
		}
	}
}
