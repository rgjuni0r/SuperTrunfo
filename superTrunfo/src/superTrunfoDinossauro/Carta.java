package superTrunfoDinossauro;

import java.util.ArrayList;

class Carta {
	private String id;
	private String nome;
	private String categoria;
	private ArrayList<Atributo> atributos;
	private String tema;
	private boolean superTrunfo;

	public Carta(String id, String nome, String categoria, ArrayList<Atributo> atributos, String tema,
			boolean superTrunfo) {
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.atributos = atributos;
		this.tema = tema;
		this.superTrunfo = superTrunfo;
	}

	public String getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public ArrayList<Atributo> getAtributos() {
		return new ArrayList<>(atributos);
	}

	public String getTema() {
		return tema;
	}

	public boolean getSuperTrunfo() {
		return superTrunfo;
	}

	public boolean isSuperTrunfo() {
		return superTrunfo;
	}

	public boolean isGrupoA() {
		return id.charAt(0) == 'A';
	}

	@Override
	public String toString() {
		return "\n  - ID: " + id + "\n  - Nome: " + nome + "\n  - Categoria: " + categoria + "\n  - Atributos: " + atributos + "\n  - SuperTrunfo: " + superTrunfo;
		//return "ID: " + id + ", Nome: " + nome + ", Categoria: " + categoria + ", Atributos: " + atributos + ", SuperTrunfo: " + superTrunfo;
	}

	public Atributo getAtributoPorNome(String nome) {
		for (Atributo atributo : atributos) {
			if (atributo.getNome().equalsIgnoreCase(nome)) {
				return atributo;
			}
		}
		return null;
	}
}