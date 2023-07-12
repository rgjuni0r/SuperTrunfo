package superTrunfoDinossauro;

// CLASSE RESPONSÁVEL POR REPRESENTAR OS ATRIBUTOS DAS CARTAS DO JOGO
class Atributo {
	private String nome;
	private String unidadeMedida;
	private double valor;

	public Atributo(String nome, String unidadeMedida, double valor) {
		this.nome = nome;
		this.unidadeMedida = unidadeMedida;
		this.valor = valor;
	}

	// GETTERS
	public String getNome() {
		return nome;
	}

	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public double getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return nome + ": " + valor + " " + unidadeMedida; // RETORNANDO UMA APRESENTAÇÃO, EM STRING, DOS ATRIBUTOS
	}
}