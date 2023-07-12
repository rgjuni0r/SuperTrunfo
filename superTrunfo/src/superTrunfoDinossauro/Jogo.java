package superTrunfoDinossauro;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

class Jogo {
	private String tema;
	private Baralho baralho;
	private Jogador jogador1;
	private Jogador jogador2;
	private int round;
	private Jogador ultimoVencedor;
	private String nomeJogador1;
	private boolean primeiroRound;
	private boolean jogador2IA; // INDICADOR DO TIPO DE JOGADOR 2 (IA OU RANDÔMICO)

	public Jogo(String tema, String nomeJogador1, boolean jogador2IA) {
		this.tema = tema;
		this.baralho = new Baralho(tema);
		this.round = 1;
		this.ultimoVencedor = null;
		this.nomeJogador1 = nomeJogador1;
		this.primeiroRound = true;
		this.jogador2IA = jogador2IA; // DEFINE O TIPO DE JOGADOR 2 (IA OU RANDÔMICO - MÁQUINA/COMPUTADOR
	}

	// GETTER
	public String getTema() {
		return this.tema;
	}

	// MÉTODO DE INICIALIZAÇÃO DO JOGO
	public void iniciar() {
		System.out.println("========== ========== ==========");
		System.out.println("  Super Trunfo: " + getTema());
		System.out.println("========== ========== ==========\n");
		baralho.carregar();
		baralho.embaralhar();
		distribuirCartas();

		jogador1 = new JogadorReal(nomeJogador1, jogador1.getMonte()); // USA O NOME DO JOGADOR 1 DEFINIDO PELO USUÁRIO
		if (jogador2IA) {
			jogador2 = new JogadorIA("Jogador IA", jogador2.getMonte());
		} else {
			jogador2 = new JogadorRandomico("Jogador Computador", jogador2.getMonte());
		}
	}

	// MÉTODO RESPONSÁVEL POR DISTRIBUIR AS CARTAS
	public void distribuirCartas() {
		int metade = baralho.size() / 2;
		LinkedList<Carta> monteJogador1 = new LinkedList<>(baralho.subList(0, metade));
		LinkedList<Carta> monteJogador2 = new LinkedList<>(baralho.subList(metade, baralho.size()));

		this.jogador1 = new JogadorReal(nomeJogador1, monteJogador1);
		if (jogador2IA) {
			this.jogador2 = new JogadorIA("Jogador IA", monteJogador2);
		} else {
			this.jogador2 = new JogadorRandomico("Jogador Computador", monteJogador2);
		}
	}

	// MÉTODO RESPONSÁVEL POR MOSTRAR O STATUS DO JOGO
	public void mostrarStatus() {
		JOptionPane.showMessageDialog(null,
				"Status do jogo:\n" + jogador1.getNome() + ": " + jogador1.getQuantidadeCartas() + " cartas\n"
						+ jogador2.getNome() + ": " + jogador2.getQuantidadeCartas() + " cartas\n" + "== == == == ==");
		//
		System.out.println("Status do jogo:");
		System.out.println(jogador1.getNome() + ": " + jogador1.getQuantidadeCartas() + " cartas");
		System.out.println(jogador2.getNome() + ": " + jogador2.getQuantidadeCartas() + " cartas");
		System.out.println("===== ===== =====");
	}

	// MÉTODO RESPONSÁVEL PELA DINÂMICA DO JOGO
	public void jogar() {
		iniciar();
		Random rand = new Random();

		while (jogador1.possuiCartas() && jogador2.possuiCartas()) {
			System.out.println("==========");
			System.out.println(".........");
			System.out.println("ROUND " + round);
			System.out.println(".........");
			System.out.println("==========");

			Jogador jogadorDaVez;
			Jogador oponente;

			if (primeiroRound) {
				if (rand.nextInt(2) == 0) {
					jogadorDaVez = jogador1;
					oponente = jogador2;
				} else {
					jogadorDaVez = jogador2;
					oponente = jogador1;
				}
				primeiroRound = false;
			} else {
				jogadorDaVez = (ultimoVencedor == null || ultimoVencedor == jogador1) ? jogador1 : jogador2;
				oponente = (jogadorDaVez == jogador1) ? jogador2 : jogador1;
			}

			Carta cartaJogadorDaVez = jogadorDaVez.jogarCarta();
			Carta cartaOponente = oponente.jogarCarta();

			// CARTA JOGADOR USUPARIO (jogador1)
			System.out.println("Jogador da Vez: " + jogadorDaVez.getNome());
			System.out.println();
			if (jogadorDaVez.getNome() == jogador1.getNome()) {
				System.out.println(jogadorDaVez.getNome() + " jogou a carta: " + cartaJogadorDaVez);
			} else {
				System.out.println(oponente.getNome() + " jogou a carta: " + cartaOponente);
			}

			// PRINTA TODAS AS CARTAS DO JOGADORES
			// System.out.println(jogadorDaVez.getNome() + " jogou a carta: " +
			// cartaJogadorDaVez);
			// System.out.println(oponente.getNome() + " jogou a carta: " + cartaOponente);
			// System.out.println("-----");
			//
			if (cartaJogadorDaVez.isSuperTrunfo() && !cartaOponente.isGrupoA()) {
				JOptionPane.showMessageDialog(null, jogadorDaVez.getNome() + " venceu o round com Super Trunfo!"); // msgBox
				System.out.println(jogadorDaVez.getNome() + " venceu o round com Super Trunfo!");
				jogadorDaVez.receberCartas(List.of(cartaJogadorDaVez, cartaOponente));
				ultimoVencedor = jogadorDaVez;

			} else if (cartaOponente.isSuperTrunfo() && !cartaJogadorDaVez.isGrupoA()) {
				JOptionPane.showMessageDialog(null, oponente.getNome() + " venceu o round com Super Trunfo!"); // msgBox
				System.out.println(oponente.getNome() + " venceu o round com Super Trunfo!");
				oponente.receberCartas(List.of(cartaJogadorDaVez, cartaOponente));
				ultimoVencedor = oponente;

			} else {
				Atributo atributoEscolhido = jogadorDaVez.escolherAtributo(cartaJogadorDaVez);
				JOptionPane.showMessageDialog(null, jogadorDaVez.getNome() + " escolheu o atributo: " + atributoEscolhido.getNome());
				System.out.println(jogadorDaVez.getNome() + " escolheu o atributo: " + atributoEscolhido.getNome());
				
				double valorJogadorDaVez = cartaJogadorDaVez.getAtributoPorNome(atributoEscolhido.getNome()).getValor();
				double valorOponente = cartaOponente.getAtributoPorNome(atributoEscolhido.getNome()).getValor();

				System.out.println(jogadorDaVez.getNome() + " escolheu " + atributoEscolhido.getNome() + ": " + valorJogadorDaVez + " " + atributoEscolhido.getUnidadeMedida());
				System.out.println(oponente.getNome() + " escolheu " + atributoEscolhido.getNome() + ": " + valorOponente + " " + atributoEscolhido.getUnidadeMedida());
				System.out.println("===== ===== =====");

				if (valorJogadorDaVez > valorOponente) {
					JOptionPane.showMessageDialog(null, jogadorDaVez.getNome() + " venceu o round!");
					System.out.println(jogadorDaVez.getNome() + " venceu o round!");
					jogadorDaVez.receberCartas(List.of(cartaJogadorDaVez, cartaOponente));
					ultimoVencedor = jogadorDaVez;

				} else if (valorJogadorDaVez < valorOponente) {
					JOptionPane.showMessageDialog(null, oponente.getNome() + " venceu o round!");
					System.out.println(oponente.getNome() + " venceu o round!");
					oponente.receberCartas(List.of(cartaJogadorDaVez, cartaOponente));
					ultimoVencedor = oponente;

				} else {
					JOptionPane.showMessageDialog(null, "Empate no round!");
					System.out.println("Empate no round!");
					oponente.receberCartas(List.of(cartaJogadorDaVez));
					jogadorDaVez.receberCartas(List.of(cartaOponente));
				}
			}
			System.out.println("-----");
			mostrarStatus();
			System.out.println("-----");

			round++;
			Scanner leitor = new Scanner(System.in);
			System.out.println("Pressione uma tecla para avançar...\n");
			leitor.nextLine();
		}

		// VERIFICA O VENCEDOR DO JOGO
		if (jogador1.getQuantidadeCartas() > jogador2.getQuantidadeCartas()) {
			System.out.println(jogador1.getNome() + " venceu o jogo!");
		} else if (jogador1.getQuantidadeCartas() < jogador2.getQuantidadeCartas()) {
			System.out.println(jogador2.getNome() + " venceu o jogo!");
		} else {
			System.out.println("Empate no jogo!");
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jogo (Tema: ").append(tema).append(")\n");
		builder.append("Jogador 1: ").append(jogador1.getNome()).append("\n");
		builder.append("Jogador 2: ").append(jogador2.getNome()).append("\n");
		builder.append("Round: ").append(round).append("\n");
		return builder.toString();
	}
}
