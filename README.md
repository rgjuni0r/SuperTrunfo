# Resumo do Projeto: SuperTrunfo
- O projeto "SuperTrunfo" é um trabalho final para a disciplina de Programação Orientada a Objetos. O objetivo é implementar uma versão digital do famoso jogo de cartas SuperTrunfo, em que os jogadores competem com base em características das cartas, sendo que cada carta representa um tema, como carros, dinossauros, países, etc.

- Cada carta contém um nome, um código único, 1 a 3 curiosidades, 4 atributos com valores numéricos e unidades de medida. Há também uma carta especial chamada "SuperTrunfo", que é uma espécie de coringa com maior poder de competição. A dinâmica do jogo ocorre através de turnos onde os jogadores elegem um dos atributos das cartas para competir. O jogo continua até que um jogador obtenha todas as cartas.

- O projeto deve ser capaz de gerar um baralho SuperTrunfo, com pelo menos 4 temáticas disponíveis. O baralho será embaralhado e distribuído entre o jogador e um adversário simulado pelo programa. O sistema deverá ser construído com as seguintes classes:
  1 - Baralho: Implementação da LinkedList de Cartas com operações como Embaralhar e Distribuir entre os jogadores.
  2 - Carta: Representa as características das cartas do jogo.
  3 - Atributo: Usada para representar cada um dos atributos relevantes da carta.
  4 - JogadorAbstrato: Classe abstrata que representa um jogador, podendo ser uma instância de JogadorReal (usuário) ou JogadorRandômico (simulado pelo programa).
  5 - Jogo: Representa uma instância do jogo, contendo um baralho e dois jogadores.
  6 - O sistema também precisa ser capaz de mostrar o vencedor, o status do jogo, e ter um menu interativo para escolha do tema do jogo. Por fim, o projeto deve implementar boas práticas de programação e conter tratamento de erros.
