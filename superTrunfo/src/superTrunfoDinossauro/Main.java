/**
 * @author ROGÉRIO MOREIRA ALVES JÚNIOR - MATRÍCULA: 2022 06 987
 * @title TRABALHO AVALIATIVO DE POO: SUPER TRUNFO (04 TEMÁTICAS DISPONÍVEIS)
 * @date 01.07.2023
 * @email rogerio.junior@discente.udf.br
 */

package superTrunfoDinossauro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {
	public static void main(String[] args) {
		// ==== CONFIGURAÇÃO DO FRAME DE INICIALIZAÇÃO
		JFrame frame = new JFrame("Super Trunfo");

		// DESATIVANDO A MAXIMIZAÇÃO DA TELA
		frame.setResizable(false);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);

		// CONFIGURANDO A JANELA P/ APARECER NO CENTRO DA TELA
		frame.setLocationRelativeTo(null);

		// ===== PAINEL
		JPanel panel = new JPanel();
		frame.add(panel);

		//
		JLabel labelNome = new JLabel("Digite o nome do jogador:");
		JTextField fieldNome = new JTextField(20);
		panel.add(labelNome);
		panel.add(fieldNome);

		//
		JLabel labelTema = new JLabel("Escolha o tema do jogo:");
		String[] temas = { "Dinossauros", "Aviões a Jato", "Carros de Luxo", "Carros Envenenados" };
		JComboBox<String> comboTema = new JComboBox<>(temas);
		panel.add(labelTema);
		panel.add(comboTema);

		//
		JLabel labelJogador2 = new JLabel("Escolha o tipo do Jogador 2:");
		String[] tiposJogador2 = { "IA", "Computador" };
		JComboBox<String> comboJogador2 = new JComboBox<>(tiposJogador2);
		panel.add(labelJogador2);
		panel.add(comboJogador2);

		//
		JButton button = new JButton("Iniciar Jogo");
		panel.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomeJogador = fieldNome.getText();
				String tema = (String) comboTema.getSelectedItem();
				boolean jogador2IA = ((String) comboJogador2.getSelectedItem()).equals("IA") ? true : false;
				Jogo jogo = new Jogo(tema, nomeJogador, jogador2IA);

				// FECHANDO A INTERFACE GRÁFICA AO INICIAR O JOGO
				frame.dispose();

				// INICIANDO O JOGO
				jogo.jogar();
			}
		});
		JButton buttonRegras = new JButton("Regras do Jogo");
		panel.add(buttonRegras);
		buttonRegras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensagem = "O Super Trunfo é um jogo emocionante que começa com a distribuição das 32 cartas do baralho entre os jogadores.\n "
						+ "Cada jogador recebe um monte de cartas e, em cada turno, retira uma carta do topo de seu baralho.\n "
						+ "O primeiro jogador é escolhido aleatoriamente para iniciar o turno. Durante um turno, o jogador da vez\n "
						+ "escolhe um dos atributos relevantes das cartas, como peso, velocidade, altura ou potência, para ser o critério \n"
						+ "de competição da rodada. Em seguida, todos os jogadores apresentam suas cartas, anunciando o valor do atributo \n"
						+ "escolhido. O jogador cuja carta tiver o maior valor nesse atributo ganha o turno e recebe todas as cartas em jogo,\n"
						+ "colocando-as no final de seu monte.\n"
						+ "Além disso, o jogador vencedor tem o direito de iniciar o próximo turno. O jogo continua dessa forma até que todas\n "
						+ "as cartas estejam na mão de um jogador, que será declarado o vencedor.\n\n"
						+ "No entanto, uma carta especial chamada \"SuperTrunfo\" possui um poder de competição maior. Se um jogador apresentar \n"
						+ "essa carta em um turno, ele automaticamente ganha o turno, a menos que algum jogador tenha uma carta do grupo A (1A, \n"
						+ "2A, etc.). Nesse caso, a competição ocorre normalmente, podendo a carta SuperTrunfo ganhar ou perder.\n\n"
						+ "Embora existam regras para um turno de desempate em situações em que as cartas possuam valores iguais dos atributos, \n"
						+ "para este trabalho, as desconsideraremos. A vitória será automaticamente concedida ao último jogador na sequência \n"
						+ "do turno entre os empatados.\n\n"
						+ "O Super Trunfo é um jogo divertido e estratégico, que combina sorte e conhecimento sobre as características das cartas.\n "
						+ "Seja qual for a temática do baralho escolhido, o objetivo é se tornar o jogador com todas as cartas em mãos e se \n"
						+ "consagrar como o grande vencedor.";

				JOptionPane.showMessageDialog(frame, mensagem, "Regras do Jogo", JOptionPane.INFORMATION_MESSAGE);
			}
		});

		frame.setVisible(true);
	}
}
