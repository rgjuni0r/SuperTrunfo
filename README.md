# Resumo do Projeto: SuperTrunfo
- O projeto "SuperTrunfo" é um trabalho final para a disciplina de Programação Orientada a Objetos. O objetivo é implementar uma versão digital do famoso jogo de cartas SuperTrunfo, em que os jogadores competem com base em características das cartas, sendo que cada carta representa um tema, como carros, dinossauros, países, etc.

- Cada carta contém um nome, um código único, 1 a 3 curiosidades, 4 atributos com valores numéricos e unidades de medida. Há também uma carta especial chamada "SuperTrunfo", que é uma espécie de coringa com maior poder de competição. A dinâmica do jogo ocorre através de turnos onde os jogadores elegem um dos atributos das cartas para competir. O jogo continua até que um jogador obtenha todas as cartas.

- O projeto deve ser capaz de gerar um baralho SuperTrunfo, com pelo menos 4 temáticas disponíveis. O baralho será embaralhado e distribuído entre o jogador e um adversário simulado pelo programa. O sistema deverá ser construído com as seguintes classes:
  - Baralho: Implementação da LinkedList de Cartas com operações como Embaralhar e Distribuir entre os jogadores.
  - Carta: Representa as características das cartas do jogo.
  - Atributo: Usada para representar cada um dos atributos relevantes da carta.
  - JogadorAbstrato: Classe abstrata que representa um jogador, podendo ser uma instância de JogadorReal (usuário) ou JogadorRandômico (simulado pelo programa).
  - Jogo: Representa uma instância do jogo, contendo um baralho e dois jogadores.
  - O sistema também precisa ser capaz de mostrar o vencedor, o status do jogo, e ter um menu interativo para escolha do tema do jogo. Por fim, o projeto deve implementar boas práticas de programação e conter tratamento de erros.

# Inteligência Artificial: Homem vs IA
- Em nosso projeto, introduzimos a opção de competir diretamente contra a inteligência artificial da OpenAI. Esta funcionalidade emprega algoritmos de aprendizado de máquina para determinar estratégias de jogo, elevando o nível de desafio e tornando a experiência mais estimulante para os jogadores. O objetivo é permitir que os jogadores aprimorem suas habilidades e estratégias ao enfrentar uma IA sofisticada e desafiadora.

- Essa inovação não apenas eleva o patamar competitivo, mas também oferece aos jogadores uma visão prática do poder e do potencial da inteligência artificial. Enquanto se divertem com um jogo clássico, os jogadores ganham um entendimento mais aprofundado das aplicações práticas da IA.

- Ao integrar a OpenAI, transformamos completamente a experiência de jogar SuperTrunfo. Com isso, adicionamos um componente de alta tecnologia à tradicional mecânica de jogo, proporcionando uma experiência única de competir contra uma IA em um ambiente familiar e amado.

# AUTOR
- Nome: Rogério Moreira Alves Júnior;
- Projeto para a disciplina de Programação Orientada a Objetos, Universidade Federal de Goiás (UFG-GO);
