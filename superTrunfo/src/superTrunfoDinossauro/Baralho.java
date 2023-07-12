package superTrunfoDinossauro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

class Baralho extends LinkedList<Carta> {
	private String tema;

	public Baralho(String tema) {
		this.setTema(tema);
	}

	public void carregar() {
		// ===== CARREGANDO AS CARTAS DO JOGO (Super TRUNFO: 04 TEMÁTICAS DIFERENTE)
		ArrayList<Atributo> atributos;

		switch (tema) {
		case "Dinossauros":
			// CARTA 1A
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Altura", "m", 1.5));
			atributos.add(new Atributo("Comprimento", "m", 4.5));
			atributos.add(new Atributo("Peso", "kg", 300));
			atributos.add(new Atributo("Viveu há", "milhões de anos", 231));
			this.add(new Carta("1A", "Herrerassauro", "Carnívoro Triássico", atributos, tema, false));

			// CARTA 1B
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Altura", "m", 0.3));
			atributos.add(new Atributo("Comprimento", "m", 1.2));
			atributos.add(new Atributo("Peso", "kg", 1));
			atributos.add(new Atributo("Viveu há", "milhões de anos", 222));
			this.add(new Carta("1B", "Procompsognato", "Carnívoro Triássico", atributos, tema, false));

			// CARTA 1C
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Altura", "m", 8.0));
			atributos.add(new Atributo("Comprimento", "m", 18.0));
			atributos.add(new Atributo("Peso", "kg", 16000));
			atributos.add(new Atributo("Viveu há", "milhões de anos", 169));
			this.add(new Carta("1C", "Patagossauro", "Herbívoro Jurássico", atributos, tema, false));

			// CARTA 1D
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Altura", "m", 2.0));
			atributos.add(new Atributo("Comprimento", "m", 6.0));
			atributos.add(new Atributo("Peso", "kg", 1000));
			atributos.add(new Atributo("Viveu há", "milhões de anos", 156));
			this.add(new Carta("1D", "Ceratossauro", "Carnívoro Jurássico", atributos, tema, false));

			//
			// CARTA 2A
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Altura", "m", 0.5));
			atributos.add(new Atributo("Comprimento", "m", 1.0));
			atributos.add(new Atributo("Peso", "kg", 1));
			atributos.add(new Atributo("Viveu há", "milhões de anos", 150));
			this.add(new Carta("2A", "Pterodáctilo", "Carnívoro Jurássico", atributos, tema, false));

			// CARTA 2B
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Altura", "m", 1.0));
			atributos.add(new Atributo("Comprimento", "m", 1.7));
			atributos.add(new Atributo("Peso", "kg", 15));
			atributos.add(new Atributo("Viveu há", "milhões de anos", 80));
			this.add(new Carta("2B", "Velociraptor", "Carnívoro Cretáceo", atributos, tema, false));

			// CARTA 2C
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Altura", "m", 6.0));
			atributos.add(new Atributo("Comprimento", "m", 9.0));
			atributos.add(new Atributo("Peso", "kg", 6000));
			atributos.add(new Atributo("Viveu há", "milhões de anos", 68));
			this.add(new Carta("2C", "Triceratopo", "Herbívoro Cretáceo", atributos, tema, false));

			// CARTA 2D
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Altura", "m", 0.8));
			atributos.add(new Atributo("Comprimento", "m", 1.0));
			atributos.add(new Atributo("Peso", "kg", 7));
			atributos.add(new Atributo("Viveu há", "milhões de anos", 83));
			this.add(new Carta("2D", "Baptornis", "Carnívoro Cretáceo", atributos, tema, false));

			atributos.clear(); // Limpe a lista de atributos antes de usá-la para outra carta
			//
			// CARTA 3A
			atributos.add(new Atributo("Altura", "m", 2.0));
			atributos.add(new Atributo("Comprimento", "m", 9.0));
			atributos.add(new Atributo("Peso", "kg", 4000));
			atributos.add(new Atributo("Viveu há", "milhões de anos", 221));
			this.add(new Carta("3A", "Plateossauro", "Herbívoro Triássico", atributos, tema, false));

			// CARTA 3B
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Altura", "m", 0.3));
			atributos.add(new Atributo("Comprimento", "m", 0.6));
			atributos.add(new Atributo("Peso", "kg", 0.2));
			atributos.add(new Atributo("Viveu há", "milhões de anos", 210));
			this.add(new Carta("3B", "Peteinossauro", "Herbívoro Triássico", atributos, tema, false));

			// CARTA 3C
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Altura", "m", 4.0));
			atributos.add(new Atributo("Comprimento", "m", 9.0));
			atributos.add(new Atributo("Peso", "kg", 2000));
			atributos.add(new Atributo("Viveu há", "milhões de anos", 156));
			this.add(new Carta("3C", "Estegossauro", "Herbívoro Jurássico", atributos, tema, false));

			// CARTA 3D
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Altura", "m", 5.2));
			atributos.add(new Atributo("Comprimento", "m", 14.0));
			atributos.add(new Atributo("Peso", "kg", 3600));
			atributos.add(new Atributo("Viveu há", "milhões de anos", 156));
			this.add(new Carta("3D", "Alossauro", "Carnívoro Jurássico", atributos, tema, false));

			//
			// CARTA 4A
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Altura", "m", 22.0));
			atributos.add(new Atributo("Comprimento", "m", 38.0));
			atributos.add(new Atributo("Peso", "kg", 90000));
			atributos.add(new Atributo("Viveu há", "milhões de anos", 154));
			this.add(new Carta("4A", "Ultrassauro", "Herbívoro Jurássico", atributos, tema, false));

			// CARTA 4B
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Altura", "m", 5.6));
			atributos.add(new Atributo("Comprimento", "m", 14.0));
			atributos.add(new Atributo("Peso", "kg", 7000));
			atributos.add(new Atributo("Viveu há", "milhões de anos", 68));
			atributos.add(new Atributo("Super Trunfo", "TRUNFD", 2018211464));
			this.add(new Carta("4B", "Tiranosauro Rex", "Carnívoro Cretáceo", atributos, tema, true));

			// CARTA 4C
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Altura", "m", 3.0));
			atributos.add(new Atributo("Comprimento", "m", 7.5));
			atributos.add(new Atributo("Peso", "kg", 1000));
			atributos.add(new Atributo("Viveu há", "milhões de anos", 113));
			this.add(new Carta("4C", "Carnotauro", "Carnívoro Cretáceo", atributos, tema, false));

			// CARTA 4D
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Altura", "m", 0.2));
			atributos.add(new Atributo("Comprimento", "m", 0.1));
			atributos.add(new Atributo("Peso", "kg", 0.03));
			atributos.add(new Atributo("Viveu há", "milhões de anos", 125));
			this.add(new Carta("4D", "Iberomesornis", "Onívoro Cretáceo", atributos, tema, false));

			//
			// CARTA 5A
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Altura", "m", 1.8));
			atributos.add(new Atributo("Comprimento", "m", 3.0));
			atributos.add(new Atributo("Peso", "kg", 30));
			atributos.add(new Atributo("Viveu há", "milhões de anos", 227));
			this.add(new Carta("5A", "Coelophisis", "Carnívoro Triássico", atributos, tema, false));

			// CARTA 5B
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Altura", "m", 12.0));
			atributos.add(new Atributo("Comprimento", "m", 15.0));
			atributos.add(new Atributo("Peso", "kg", 8000));
			atributos.add(new Atributo("Viveu há", "milhões de anos", 228));
			this.add(new Carta("5B", "Melanorossauro", "Herbívoro Triássico", atributos, tema, false));

			// CARTA 5C
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Altura", "m", 15.0));
			atributos.add(new Atributo("Comprimento", "m", 28.0));
			atributos.add(new Atributo("Peso", "kg", 50000));
			atributos.add(new Atributo("Viveu há", "milhões de anos", 156));
			this.add(new Carta("5C", "Brachiossauro", "Herbívoro Jurássico", atributos, tema, false));

			// CARTA 5D
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Altura", "m", 2.5));
			atributos.add(new Atributo("Comprimento", "m", 7.0));
			atributos.add(new Atributo("Peso", "kg", 450));
			atributos.add(new Atributo("Viveu há", "milhões de anos", 206));
			this.add(new Carta("5D", "Dilofosauro", "Carnívoro Jurássico", atributos, tema, false));

			//
			// CARTA 6A
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Altura", "m", 1.1));
			atributos.add(new Atributo("Comprimento", "m", 1.5));
			atributos.add(new Atributo("Peso", "kg", 40));
			atributos.add(new Atributo("Viveu há", "milhões de anos", 146));
			this.add(new Carta("6A", "Othnielia", "Herbívoro Jurássico", atributos, tema, false));

			// CARTA 6B
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Altura", "m", 5.8));
			atributos.add(new Atributo("Comprimento", "m", 14.0));
			atributos.add(new Atributo("Peso", "kg", 8000));
			atributos.add(new Atributo("Viveu há", "milhões de anos", 113));
			this.add(new Carta("6B", "Carcharodontossauro", "Carnívoro Cretáceo", atributos, tema, false));

			// CARTA 6C
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Altura", "m", 8.0));
			atributos.add(new Atributo("Comprimento", "m", 12.0));
			atributos.add(new Atributo("Peso", "kg", 2000));
			atributos.add(new Atributo("Viveu há", "milhões de anos", 125));
			this.add(new Carta("6C", "Barionix", "Carnívoro Cretáceo", atributos, tema, false));

			// CARTA 6D
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Altura", "m", 1.8));
			atributos.add(new Atributo("Comprimento", "m", 5.0));
			atributos.add(new Atributo("Peso", "kg", 1500));
			atributos.add(new Atributo("Viveu há", "milhões de anos", 130));
			this.add(new Carta("6D", "Hylaeossauro", "Herbívoro Cretáceo", atributos, tema, false));

			//
			// CARTA 7A
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Altura", "m", 0.8));
			atributos.add(new Atributo("Comprimento", "m", 1.0));
			atributos.add(new Atributo("Peso", "kg", 10));
			atributos.add(new Atributo("Viveu há", "milhões de anos", 231));
			this.add(new Carta("7A", "Eoraptor", "Carnívoro Jurássico", atributos, tema, false));

			// CARTA 7B
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Altura", "m", 8.0));
			atributos.add(new Atributo("Comprimento", "m", 9.0));
			atributos.add(new Atributo("Peso", "kg", 400));
			atributos.add(new Atributo("Viveu há", "milhões de anos", 220));
			this.add(new Carta("7B", "Nothossauro", "Carnívoro Triássico", atributos, tema, false));

			// CARTA 7C
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Altura", "m", 5.0));
			atributos.add(new Atributo("Comprimento", "m", 27.0));
			atributos.add(new Atributo("Peso", "kg", 20000));
			atributos.add(new Atributo("Viveu há", "milhões de anos", 156));
			this.add(new Carta("7C", "Diplodoco", "Herbívoro Jurássico", atributos, tema, false));

			// CARTA 7D
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Altura", "m", 0.7));
			atributos.add(new Atributo("Comprimento", "m", 1.0));
			atributos.add(new Atributo("Peso", "kg", 2));
			atributos.add(new Atributo("Viveu há", "milhões de anos", 156));
			this.add(new Carta("7D", "Compsognato", "Carnívoro Jurássico", atributos, tema, false));

			//
			// CARTA 8A
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Altura", "m", 1.3));
			atributos.add(new Atributo("Comprimento", "m", 5.0));
			atributos.add(new Atributo("Peso", "kg", 3000));
			atributos.add(new Atributo("Viveu há", "milhões de anos", 165));
			this.add(new Carta("8A", "Oftalmossauro", "Carnívoro Jurássico", atributos, tema, false));

			// CARTA 8B
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Altura", "m", 0.7));
			atributos.add(new Atributo("Comprimento", "m", 2.0));
			atributos.add(new Atributo("Peso", "kg", 25));
			atributos.add(new Atributo("Viveu há", "milhões de anos", 125));
			this.add(new Carta("8B", "Psitacossauro", "Herbívoro Cretáceo", atributos, tema, false));

			// CARTA 8C
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Altura", "m", 1.3));
			atributos.add(new Atributo("Comprimento", "m", 2.5));
			atributos.add(new Atributo("Peso", "kg", 35));
			atributos.add(new Atributo("Viveu há", "milhões de anos", 80));
			this.add(new Carta("8C", "Oviraptor", "Carnívoro Cretáceo", atributos, tema, false));

			// CARTA 8D
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Altura", "m", 1.1));
			atributos.add(new Atributo("Comprimento", "m", 6.0));
			atributos.add(new Atributo("Peso", "kg", 400));
			atributos.add(new Atributo("Viveu há", "milhões de anos", 150));
			this.add(new Carta("8D", "Globibens", "Carnívoro Cretáceo", atributos, tema, false));

			break;

		case "Carros de Luxo":
			// CARTA 1A
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 3217));
			atributos.add(new Atributo("Potência", "cv", 369));
			atributos.add(new Atributo("Velocidade", "km/h", 280));
			atributos.add(new Atributo("Peso", "kg", 1590));
			atributos.add(new Atributo("Comprimento", "m", 4.51));
			this.add(new Carta("1A", "Maserati 'Assetto Corsa'", "Carros Esportivos", atributos, tema, false));

			// CARTA 1B
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 3996));
			atributos.add(new Atributo("Potência", "cv", 363));
			atributos.add(new Atributo("Velocidade", "km/h", 250));
			atributos.add(new Atributo("Peso", "kg", 1715));
			atributos.add(new Atributo("Comprimento", "m", 4.76));
			this.add(new Carta("1B", "Jaguar XKR", "Carros Esportivos", atributos, tema, false));

			// CARTA 1C
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 3600));
			atributos.add(new Atributo("Potência", "cv", 462));
			atributos.add(new Atributo("Velocidade", "km/h", 315));
			atributos.add(new Atributo("Peso", "kg", 1451));
			atributos.add(new Atributo("Comprimento", "m", 4.45));
			this.add(new Carta("1C", "Porsche 911 GT2", "Carros Esportivos", atributos, tema, false));

			// CARTA 1D
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 3935));
			atributos.add(new Atributo("Potência", "cv", 460));
			atributos.add(new Atributo("Velocidade", "km/h", 306));
			atributos.add(new Atributo("Peso", "kg", 1863));
			atributos.add(new Atributo("Comprimento", "m", 4.67));
			this.add(new Carta("1D", "Aston Martin Vanquish", "Carros Esportivos", atributos, tema, true));

			//
			// CARTA 2A
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 5379));
			atributos.add(new Atributo("Potência", "cv", 326));
			atributos.add(new Atributo("Velocidade", "km/h", 225));
			atributos.add(new Atributo("Peso", "kg", 2480));
			atributos.add(new Atributo("Comprimento", "m", 5.65));
			this.add(new Carta("2A", "Rolls-Royce Park Ward", "Carros Clássicos", atributos, tema, false));

			// CARTA 2B
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 6258));
			atributos.add(new Atributo("Potência", "cv", 444));
			atributos.add(new Atributo("Velocidade", "km/h", 250));
			atributos.add(new Atributo("Peso", "kg", 2035));
			atributos.add(new Atributo("Comprimento", "m", 5.16));
			this.add(new Carta("2B", "Mercedes S 63 AMG", "Carros Clássicos", atributos, tema, false));

			// CARTA 2C
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 3996));
			atributos.add(new Atributo("Potência", "cv", 363));
			atributos.add(new Atributo("Velocidade", "km/h", 250));
			atributos.add(new Atributo("Peso", "kg", 1820));
			atributos.add(new Atributo("Comprimento", "m", 5.15));
			this.add(new Carta("2C", "Daimler Super V8", "Carros Clássicos", atributos, tema, false));

			// CARTA 2D
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 6750));
			atributos.add(new Atributo("Potência", "cv", 426));
			atributos.add(new Atributo("Velocidade", "km/h", 270));
			atributos.add(new Atributo("Peso", "kg", 2450));
			atributos.add(new Atributo("Comprimento", "m", 5.22));
			this.add(new Carta("2D", "Bentley Continental T", "Carros Clássicos", atributos, tema, false));

			//
			// CARTA 3A
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 2995));
			atributos.add(new Atributo("Potência", "cv", 201));
			atributos.add(new Atributo("Velocidade", "km/h", 180));
			atributos.add(new Atributo("Peso", "kg", 1865));
			atributos.add(new Atributo("Comprimento", "m", 4.58));
			this.add(new Carta("3A", "Lexus RX 300", "Utilitários Esportivos", atributos, tema, false));

			// CARTA 3B
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 5439));
			atributos.add(new Atributo("Potência", "cv", 347));
			atributos.add(new Atributo("Velocidade", "km/h", 235));
			atributos.add(new Atributo("Peso", "kg", 2300));
			atributos.add(new Atributo("Comprimento", "m", 4.64));
			this.add(new Carta("3B", "Mercedes ML 55 AMG", "Utilitários Esportivos", atributos, tema, false));

			// CARTA 3C
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 4553));
			atributos.add(new Atributo("Potência", "cv", 218));
			atributos.add(new Atributo("Velocidade", "km/h", 196));
			atributos.add(new Atributo("Peso", "kg", 2120));
			atributos.add(new Atributo("Comprimento", "m", 4.71));
			this.add(new Carta("3C", "Range Rover", "Utilitários Esportivos", atributos, tema, false));

			// CARTA 3D
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 4398));
			atributos.add(new Atributo("Potência", "cv", 286));
			atributos.add(new Atributo("Velocidade", "km/h", 207));
			atributos.add(new Atributo("Peso", "kg", 2170));
			atributos.add(new Atributo("Comprimento", "m", 4.67));
			this.add(new Carta("3D", "BMW X5", "Utilitários Esportivos", atributos, tema, false));

			//
			// CARTA 4A
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 7993));
			atributos.add(new Atributo("Potência", "cv", 1001));
			atributos.add(new Atributo("Velocidade", "km/h", 404));
			atributos.add(new Atributo("Peso", "kg", 1380));
			atributos.add(new Atributo("Comprimento", "m", 4.38));
			this.add(new Carta("4A", "Lexus RX 300", "Carros dos Sonhos", atributos, tema, false));

			// CARTA 4B
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 5474));
			atributos.add(new Atributo("Potência", "cv", 485));
			atributos.add(new Atributo("Velocidade", "km/h", 320));
			atributos.add(new Atributo("Peso", "kg", 1690));
			atributos.add(new Atributo("Comprimento", "m", 4.55));
			this.add(new Carta("4B", "Mercedes ML 55 AMG", "Carros dos Sonhos", atributos, tema, false));

			// CARTA 4C
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 3760));
			atributos.add(new Atributo("Potência", "cv", 680));
			atributos.add(new Atributo("Velocidade", "km/h", 365));
			atributos.add(new Atributo("Peso", "kg", 1300));
			atributos.add(new Atributo("Comprimento", "m", 4.35));
			this.add(new Carta("4C", "Range Rover", "Carros dos Sonhos", atributos, tema, false));

			// CARTA 4D
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 5992));
			atributos.add(new Atributo("Potência", "cv", 550));
			atributos.add(new Atributo("Velocidade", "km/h", 330));
			atributos.add(new Atributo("Peso", "kg", 1625));
			atributos.add(new Atributo("Comprimento", "m", 4.47));
			this.add(new Carta("4D", "BMW X5", "Carros dos Sonhos", atributos, tema, false));

			//
			// CARTA 5A
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 6000));
			atributos.add(new Atributo("Potência", "cv", 450));
			atributos.add(new Atributo("Velocidade", "km/h", 250));
			atributos.add(new Atributo("Peso", "kg", 1750));
			atributos.add(new Atributo("Comprimento", "m", 4.95));
			this.add(new Carta("5A", "VW D1", "Protótipo", atributos, tema, false));

			// CARTA 5B
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 3000));
			atributos.add(new Atributo("Potência", "cv", 400));
			atributos.add(new Atributo("Velocidade", "km/h", 310));
			atributos.add(new Atributo("Peso", "kg", 1450));
			atributos.add(new Atributo("Comprimento", "m", 4.32));
			this.add(new Carta("5B", "ItalDesign Scighera", "Protótipo", atributos, tema, false));

			// CARTA 5C
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 4200));
			atributos.add(new Atributo("Potência", "cv", 431));
			atributos.add(new Atributo("Velocidade", "km/h", 300));
			atributos.add(new Atributo("Peso", "kg", 1850));
			atributos.add(new Atributo("Comprimento", "m", 5.10));
			this.add(new Carta("5C", "Cadillac Imaj", "Protótipo", atributos, tema, false));

			// CARTA 5D
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 5980));
			atributos.add(new Atributo("Potência", "cv", 350));
			atributos.add(new Atributo("Velocidade", "km/h", 280));
			atributos.add(new Atributo("Peso", "kg", 1950));
			atributos.add(new Atributo("Comprimento", "m", 5.22));
			this.add(new Carta("5D", "Chrysler Chronos", "Protótipo", atributos, tema, false));

			//
			// CARTA 6A
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 4266));
			atributos.add(new Atributo("Potência", "cv", 279));
			atributos.add(new Atributo("Velocidade", "km/h", 230));
			atributos.add(new Atributo("Peso", "kg", 2180));
			atributos.add(new Atributo("Comprimento", "m", 5.79));
			this.add(new Carta("6A", "Binz XL", "Limusine", atributos, tema, false));

			// CARTA 6B
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 6748));
			atributos.add(new Atributo("Potência", "cv", 325));
			atributos.add(new Atributo("Velocidade", "km/h", 215));
			atributos.add(new Atributo("Peso", "kg", 2440));
			atributos.add(new Atributo("Comprimento", "m", 5.82));
			this.add(new Carta("6B", "Hooper Rools - Royce Emperor", "Limusine", atributos, tema, false));

			// CARTA 6C
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 5409));
			atributos.add(new Atributo("Potência", "cv", 380));
			atributos.add(new Atributo("Velocidade", "km/h", 200));
			atributos.add(new Atributo("Peso", "kg", 2870));
			atributos.add(new Atributo("Comprimento", "m", 6.40));
			this.add(new Carta("6C", "American Custom Lincoln", "Limusine", atributos, tema, false));

			// CARTA 6D
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 5600));
			atributos.add(new Atributo("Potência", "cv", 470));
			atributos.add(new Atributo("Velocidade", "km/h", 250));
			atributos.add(new Atributo("Peso", "kg", 2450));
			atributos.add(new Atributo("Comprimento", "m", 6.10));
			this.add(new Carta("6D", "Maybach Langversion", "Limusine", atributos, tema, false));

			//
			// CARTA 7A
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 4266));
			atributos.add(new Atributo("Potência", "cv", 279));
			atributos.add(new Atributo("Velocidade", "km/h", 230));
			atributos.add(new Atributo("Peso", "kg", 2180));
			atributos.add(new Atributo("Comprimento", "m", 5.79));
			this.add(new Carta("7A", "Pagani Zonda C12 S", "Carros Exóticos", atributos, tema, false));

			// CARTA 7B
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 6748));
			atributos.add(new Atributo("Potência", "cv", 325));
			atributos.add(new Atributo("Velocidade", "km/h", 215));
			atributos.add(new Atributo("Peso", "kg", 2440));
			atributos.add(new Atributo("Comprimento", "m", 5.82));
			this.add(new Carta("6B", "Morgan Aero 8", "Carros Exóticos", atributos, tema, false));

			// CARTA 7C
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 5409));
			atributos.add(new Atributo("Potência", "cv", 380));
			atributos.add(new Atributo("Velocidade", "km/h", 200));
			atributos.add(new Atributo("Peso", "kg", 2870));
			atributos.add(new Atributo("Comprimento", "m", 6.40));
			this.add(new Carta("7C", "Mega Mont Carlo", "Carros Exóticos", atributos, tema, false));

			// CARTA 7D
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 5600));
			atributos.add(new Atributo("Potência", "cv", 470));
			atributos.add(new Atributo("Velocidade", "km/h", 250));
			atributos.add(new Atributo("Peso", "kg", 2450));
			atributos.add(new Atributo("Comprimento", "m", 6.10));
			this.add(new Carta("7D", "Lotec Sirius", "Carros Exóticos", atributos, tema, false));

			//
			// CARTA 8A
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 4293));
			atributos.add(new Atributo("Potência", "cv", 282));
			atributos.add(new Atributo("Velocidade", "km/h", 250));
			atributos.add(new Atributo("Peso", "kg", 1995));
			atributos.add(new Atributo("Comprimento", "m", 5.0));
			this.add(new Carta("8A", "Lexus LS 430", "Carros de Série", atributos, tema, false));

			// CARTA 8B
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 4398));
			atributos.add(new Atributo("Potência", "cv", 333));
			atributos.add(new Atributo("Velocidade", "km/h", 250));
			atributos.add(new Atributo("Peso", "kg", 19945));
			atributos.add(new Atributo("Comprimento", "m", 5.0));
			this.add(new Carta("8B", "BMW 745i", "Carros de Série", atributos, tema, false));

			// CARTA 8C
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 4565));
			atributos.add(new Atributo("Potência", "cv", 305));
			atributos.add(new Atributo("Velocidade", "km/h", 240));
			atributos.add(new Atributo("Peso", "kg", 1843));
			atributos.add(new Atributo("Comprimento", "m", 5.26));
			this.add(new Carta("8C", "Cadillac Deville DTS", "Carros de Série", atributos, tema, false));

			// CARTA 8D
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 4172));
			atributos.add(new Atributo("Potência", "cv", 360));
			atributos.add(new Atributo("Velocidade", "km/h", 250));
			atributos.add(new Atributo("Peso", "kg", 1730));
			atributos.add(new Atributo("Comprimento", "m", 5.03));
			this.add(new Carta("8D", "Audi S8", "Carros de Série", atributos, tema, false));

			break;

		case "Carros Envenenados":
			// CARTA 1A
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 1984));
			atributos.add(new Atributo("Potência", "cv", 145));
			atributos.add(new Atributo("Velocidade", "km/h", 205));
			atributos.add(new Atributo("0-100 km/h", "s", 8.5));
			atributos.add(new Atributo("Peso", "kg", 1145));
			this.add(new Carta("1A", "Abt-Beetle 2,0 i", "Linha Esportiva ABT/VW", atributos, tema, false));

			// CARTA 1B
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 1998));
			atributos.add(new Atributo("Potência", "cv", 310));
			atributos.add(new Atributo("Velocidade", "km/h", 277));
			atributos.add(new Atributo("0-100 km/h", "s", 5.4));
			atributos.add(new Atributo("Peso", "kg", 1375));
			this.add(new Carta("1B", "Abt-As 4", "Linha Esportiva ABT/AUDI", atributos, tema, false));

			// CARTA 1C
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 1780));
			atributos.add(new Atributo("Potência", "cv", 235));
			atributos.add(new Atributo("Velocidade", "km/h", 246));
			atributos.add(new Atributo("0-100 km/h", "s", 6.5));
			atributos.add(new Atributo("Peso", "kg", 1270));
			this.add(new Carta("1C", "Abt-Golf GTI 1,8 T", "Linha Esportiva ABT/VW", atributos, tema, false));

			// CARTA 1D
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 1781));
			atributos.add(new Atributo("Potência", "cv", 310));
			atributos.add(new Atributo("Velocidade", "km/h", 265));
			atributos.add(new Atributo("0-100 km/h", "s", 5.6));
			atributos.add(new Atributo("Peso", "kg", 1280));
			this.add(new Carta("1D", "Abt-TT limited", "Linha Esportiva ABT/AUDI", atributos, tema, false));

			//
			// CARTA 2A
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 7255));
			atributos.add(new Atributo("Potência", "cv", 582));
			atributos.add(new Atributo("Velocidade", "km/h", 260));
			atributos.add(new Atributo("0-100 km/h", "s", 5.4));
			atributos.add(new Atributo("Peso", "kg", 2200));
			this.add(new Carta("2A", "Brabus M V12", "Brabus/Mercedes", atributos, tema, false));

			// CARTA 2B
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 6406));
			atributos.add(new Atributo("Potência", "cv", 450));
			atributos.add(new Atributo("Velocidade", "km/h", 304));
			atributos.add(new Atributo("0-100 km/h", "s", 4.5));
			atributos.add(new Atributo("Peso", "kg", 1450));
			this.add(new Carta("2B", "Brabus SLK-V8", "Brabus/Mercedes", atributos, tema, false));

			// CARTA 2C
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 5729));
			atributos.add(new Atributo("Potência", "cv", 400));
			atributos.add(new Atributo("Velocidade", "km/h", 293));
			atributos.add(new Atributo("0-100 km/h", "s", 5.9));
			atributos.add(new Atributo("Peso", "kg", 1875));
			this.add(new Carta("2C", "Brabus S 5,8", "Brabus/Mercedes", atributos, tema, false));

			// CARTA 2D
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 7255));
			atributos.add(new Atributo("Potência", "cv", 582));
			atributos.add(new Atributo("Velocidade", "km/h", 330));
			atributos.add(new Atributo("0-100 km/h", "s", 4.5));
			atributos.add(new Atributo("Peso", "kg", 1790));
			this.add(new Carta("2D", "Brabus E V12", "Brabus/Mercedes", atributos, tema, false));

			//
			// CARTA 3A
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 3217));
			atributos.add(new Atributo("Potência", "cv", 369));
			atributos.add(new Atributo("Velocidade", "km/h", 280));
			atributos.add(new Atributo("0-100 km/h", "s", 1590));
			atributos.add(new Atributo("Peso", "kg", 4.51));
			this.add(new Carta("3A", "Elia Venturini Atlantique", "Elia/Venturi", atributos, tema, false));

			// CARTA 3B
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 3217));
			atributos.add(new Atributo("Potência", "cv", 369));
			atributos.add(new Atributo("Velocidade", "km/h", 280));
			atributos.add(new Atributo("0-100 km/h", "s", 1590));
			atributos.add(new Atributo("Peso", "kg", 4.51));
			this.add(new Carta("3B", "Elia Clio 2,0 16V RS", "Elia/Renault", atributos, tema, false));

			// CARTA 3C
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 3217));
			atributos.add(new Atributo("Potência", "cv", 369));
			atributos.add(new Atributo("Velocidade", "km/h", 280));
			atributos.add(new Atributo("0-100 km/h", "s", 1590));
			atributos.add(new Atributo("Peso", "kg", 4.51));
			this.add(new Carta("3C", "Elia Spider Turbo", "Elia/Renault", atributos, tema, false));

			// CARTA 3D
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 3217));
			atributos.add(new Atributo("Potência", "cv", 369));
			atributos.add(new Atributo("Velocidade", "km/h", 280));
			atributos.add(new Atributo("0-100 km/h", "s", 1590));
			atributos.add(new Atributo("Peso", "kg", 4.51));
			this.add(new Carta("3D", "Elia Mégane Coach", "Elia/Renault", atributos, tema, false));

			//
			// CARTA 4A
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 1996));
			atributos.add(new Atributo("Potência", "cv", 161));
			atributos.add(new Atributo("Velocidade", "km/h", 210));
			atributos.add(new Atributo("0-100 km/h", "s", 8.4));
			atributos.add(new Atributo("Peso", "kg", 1410));
			this.add(new Carta("4A", "Startech PT-Cruiser", "Startech/Chrysler", atributos, tema, false));

			// CARTA 4B
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 4701));
			atributos.add(new Atributo("Potência", "cv", 220));
			atributos.add(new Atributo("Velocidade", "km/h", 200));
			atributos.add(new Atributo("0-100 km/h", "s", 8.3));
			atributos.add(new Atributo("Peso", "kg", 1928));
			this.add(new Carta("4B", "Startech Grand Cherokee", "Startech/Chrysler", atributos, tema, false));

			// CARTA 4C
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 3518));
			atributos.add(new Atributo("Potência", "cv", 252));
			atributos.add(new Atributo("Velocidade", "km/h", 230));
			atributos.add(new Atributo("0-100 km/h", "s", 8.8));
			atributos.add(new Atributo("Peso", "kg", 1660));
			this.add(new Carta("4C", "Startech 300M", "Startech/Chrysler", atributos, tema, false));

			// CARTA 4D
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 7990));
			atributos.add(new Atributo("Potência", "cv", 500));
			atributos.add(new Atributo("Velocidade", "km/h", 310));
			atributos.add(new Atributo("0-100 km/h", "s", 3.9));
			atributos.add(new Atributo("Peso", "kg", 1620));
			this.add(new Carta("4D", "Startech Viper SV1", "Startech/Chrysler", atributos, tema, false));

			//
			// CARTA 5A
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 2498));
			atributos.add(new Atributo("Potência", "cv", 170));
			atributos.add(new Atributo("Velocidade", "km/h", 230));
			atributos.add(new Atributo("0-100 km/h", "s", 8));
			atributos.add(new Atributo("Peso", "kg", 1469));
			this.add(new Carta("5A", "Steinmetz Vectra B", "Steinmetz/Opel", atributos, tema, false));

			// CARTA 5B
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 1998));
			atributos.add(new Atributo("Potência", "cv", 200));
			atributos.add(new Atributo("Velocidade", "km/h", 238));
			atributos.add(new Atributo("0-100 km/h", "s", 6.5));
			atributos.add(new Atributo("Peso", "kg", 1075));
			this.add(new Carta("5B", "Steinmetz Tigra GT/R", "Steinmetz/Opel", atributos, tema, false));

			// CARTA 5C
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 1998));
			atributos.add(new Atributo("Potência", "cv", 228));
			atributos.add(new Atributo("Velocidade", "km/h", 238));
			atributos.add(new Atributo("0-100 km/h", "s", 6.8));
			atributos.add(new Atributo("Peso", "kg", 1170));
			this.add(new Carta("5C", "Steinmetz Astra GT/C", "Steinmetz/Opel", atributos, tema, false));

			// CARTA 5D
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 1998));
			atributos.add(new Atributo("Potência", "cv", 241));
			atributos.add(new Atributo("Velocidade", "km/h", 230));
			atributos.add(new Atributo("0-100 km/h", "s", 6.9));
			atributos.add(new Atributo("Peso", "kg", 1295));
			this.add(new Carta("5D", "Steinmetz Za4a", "Steinmetz/Opel", atributos, tema, false));

			//
			// CARTA 6A
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 3600));
			atributos.add(new Atributo("Potência", "cv", 462));
			atributos.add(new Atributo("Velocidade", "km/h", 306));
			atributos.add(new Atributo("0-100 km/h", "s", 4));
			atributos.add(new Atributo("Peso", "kg", 1420));
			this.add(new Carta("6A", "TA-CT3", "Techart/Porsche", atributos, tema, false));

			// CARTA 6B
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 3600));
			atributos.add(new Atributo("Potência", "cv", 385));
			atributos.add(new Atributo("Velocidade", "km/h", 310));
			atributos.add(new Atributo("0-100 km/h", "s", 4.2));
			atributos.add(new Atributo("Peso", "kg", 1285));
			this.add(new Carta("6B", "TA-GT", "Techart/Porsche", atributos, tema, false));

			// CARTA 6C
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 3400));
			atributos.add(new Atributo("Potência", "cv", 300));
			atributos.add(new Atributo("Velocidade", "km/h", 280));
			atributos.add(new Atributo("0-100 km/h", "s", 5.2));
			atributos.add(new Atributo("Peso", "kg", 1395));
			this.add(new Carta("6C", "TA-Coupé", "Techart/Porsche", atributos, tema, false));

			// CARTA 6D
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 2500));
			atributos.add(new Atributo("Potência", "cv", 230));
			atributos.add(new Atributo("Velocidade", "km/h", 247));
			atributos.add(new Atributo("0-100 km/h", "s", 6.3));
			atributos.add(new Atributo("Peso", "kg", 1325));
			this.add(new Carta("6D", "TA-Boxter", "Techart/Porsche", atributos, tema, false));

			//
			// CARTA 7A
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 4398));
			atributos.add(new Atributo("Potência", "cv", 460));
			atributos.add(new Atributo("Velocidade", "km/h", 304));
			atributos.add(new Atributo("0-100 km/h", "s", 4.7));
			atributos.add(new Atributo("Peso", "kg", 1650));
			this.add(new Carta("7A", "Arden A-Type", "Arden/Jaguar", atributos, tema, true));

			// CARTA 7B
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 3996));
			atributos.add(new Atributo("Potência", "cv", 301));
			atributos.add(new Atributo("Velocidade", "km/h", 245));
			atributos.add(new Atributo("0-100 km/h", "s", 6.9));
			atributos.add(new Atributo("Peso", "kg", 1750));
			this.add(new Carta("6B", "Arden XJ Limousine", "Arden/Jaguar", atributos, tema, false));

			// CARTA 7C
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 4398));
			atributos.add(new Atributo("Potência", "cv", 460));
			atributos.add(new Atributo("Velocidade", "km/h", 289));
			atributos.add(new Atributo("0-100 km/h", "s", 4.8));
			atributos.add(new Atributo("Peso", "kg", 1680));
			this.add(new Carta("7C", "Arden XKA Lighwight", "Arden/Jaguar", atributos, tema, false));

			// CARTA 7D
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 2967));
			atributos.add(new Atributo("Potência", "cv", 258));
			atributos.add(new Atributo("Velocidade", "km/h", 240));
			atributos.add(new Atributo("0-100 km/h", "s", 7.4));
			atributos.add(new Atributo("Peso", "kg", 1710));
			this.add(new Carta("7D", "Arden S-Type", "Arden/Jaguar", atributos, tema, false));

			//
			// CARTA 8A
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 4943));
			atributos.add(new Atributo("Potência", "cv", 480));
			atributos.add(new Atributo("Velocidade", "km/h", 321));
			atributos.add(new Atributo("0-100 km/h", "s", 4.3));
			atributos.add(new Atributo("Peso", "kg", 1630));
			this.add(new Carta("8A", "Hm F512M", "Hamann/BMW", atributos, tema, false));

			// CARTA 8B
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 6120));
			atributos.add(new Atributo("Potência", "cv", 450));
			atributos.add(new Atributo("Velocidade", "km/h", 311));
			atributos.add(new Atributo("0-100 km/h", "s", 4.7));
			atributos.add(new Atributo("Peso", "kg", 1680));
			this.add(new Carta("8B", "HM 5/450", "Hamann/BMW", atributos, tema, false));

			// CARTA 8C
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 4941));
			atributos.add(new Atributo("Potência", "cv", 450));
			atributos.add(new Atributo("Velocidade", "km/h", 302));
			atributos.add(new Atributo("0-100 km/h", "s", 4.4));
			atributos.add(new Atributo("Peso", "kg", 1680));
			this.add(new Carta("8C", "HM Z8/450", "Hamann/BMW", atributos, tema, false));

			// CARTA 8D
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Cilindradas", "ccm", 3201));
			atributos.add(new Atributo("Potência", "cv", 350));
			atributos.add(new Atributo("Velocidade", "km/h", 287));
			atributos.add(new Atributo("0-100 km/h", "s", 5.1));
			atributos.add(new Atributo("Peso", "kg", 1445));
			this.add(new Carta("8D", "HM M-Coupé", "Hamann/BMW", atributos, tema, false));

			break;

		case "Aviões a Jato":
			// CARTA 1A
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Peso Máximo", "kg", 16193));
			atributos.add(new Atributo("Velocidade", "km/h", 945));
			atributos.add(new Atributo("Altitude Vôo", "m", 13636));
			atributos.add(new Atributo("Comprimento", "m", 22.01));
			atributos.add(new Atributo("Altura", "m", 5.76));
			this.add(new Carta("1A", "Cessna Citation X", "Jatos Leves", atributos, tema, false));

			// CARTA 1B
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Peso Máximo", "kg", 5580));
			atributos.add(new Atributo("Velocidade", "km/h", 825));
			atributos.add(new Atributo("Altitude Vôo", "m", 13100));
			atributos.add(new Atributo("Comprimento", "m", 12.09));
			atributos.add(new Atributo("Altura", "m", 3.94));
			this.add(new Carta("1B", "Swearingen SJ 30", "Jatos Leves", atributos, tema, false));

			// CARTA 1C
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Peso Máximo", "kg", 10375));
			atributos.add(new Atributo("Velocidade", "km/h", 858));
			atributos.add(new Atributo("Altitude Vôo", "m", 12500));
			atributos.add(new Atributo("Comprimento", "m", 15.93));
			atributos.add(new Atributo("Altura", "m", 4.81));
			this.add(new Carta("1C", "IAI 1124 'Westtwind'", "Jatos Leves", atributos, tema, false));

			// CARTA 1D
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Peso Máximo", "kg", 7309));
			atributos.add(new Atributo("Velocidade", "km/h", 850));
			atributos.add(new Atributo("Altitude Vôo", "m", 11800));
			atributos.add(new Atributo("Comprimento", "m", 14.80));
			atributos.add(new Atributo("Altura", "m", 4.50));
			this.add(new Carta("1D", "Beech Beechjet 400", "Jatos Leves", atributos, tema, false));

			//
			// CARTA 2A
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Peso Máximo", "kg", 41275));
			atributos.add(new Atributo("Velocidade", "km/h", 880));
			atributos.add(new Atributo("Altitude Vôo", "m", 15500));
			atributos.add(new Atributo("Comprimento", "m", 30.20));
			atributos.add(new Atributo("Altura", "m", 7.50));
			this.add(new Carta("2A", "Canadair 'Global Express'", "Jato de Luxo", atributos, tema, false));

			// CARTA 2B
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Peso Máximo", "kg", 40370));
			atributos.add(new Atributo("Velocidade", "km/h", 830));
			atributos.add(new Atributo("Altitude Vôo", "m", 15500));
			atributos.add(new Atributo("Comprimento", "m", 29.40));
			atributos.add(new Atributo("Altura", "m", 7.70));
			this.add(new Carta("2B", "Gulfstream G 1159-V", "Jato de Luxo", atributos, tema, false));

			// CARTA 2C
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Peso Máximo", "kg", 16250));
			atributos.add(new Atributo("Velocidade", "km/h", 878));
			atributos.add(new Atributo("Altitude Vôo", "m", 15500));
			atributos.add(new Atributo("Comprimento", "m", 20.23));
			atributos.add(new Atributo("Altura", "m", 6.98));
			this.add(new Carta("2C", "Dassault Falcon 2000", "Jato de Luxo", atributos, tema, false));

			// CARTA 2D
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Peso Máximo", "kg", 16000));
			atributos.add(new Atributo("Velocidade", "km/h", 550));
			atributos.add(new Atributo("Altitude Vôo", "m", 10000));
			atributos.add(new Atributo("Comprimento", "m", 20.36));
			atributos.add(new Atributo("Altura", "m", 6.50));
			this.add(new Carta("2D", "Yakoklev YAK-40", "Jato de Luxo", atributos, tema, false));

			//
			// CARTA 3A
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Peso Máximo", "kg", 32885));
			atributos.add(new Atributo("Velocidade", "km/h", 785));
			atributos.add(new Atributo("Altitude Vôo", "m", 10600));
			atributos.add(new Atributo("Comprimento", "m", 32.41));
			atributos.add(new Atributo("Altura", "m", 7.32));
			this.add(new Carta("3A", "Bombardier CRJ 700", "Linha Regional", atributos, tema, false));

			// CARTA 3B
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Peso Máximo", "kg", 42185));
			atributos.add(new Atributo("Velocidade", "km/h", 730));
			atributos.add(new Atributo("Altitude Vôo", "m", 9600));
			atributos.add(new Atributo("Comprimento", "m", 28.55));
			atributos.add(new Atributo("Altura", "m", 8.61));
			this.add(new Carta("3B", "British Aerospace 146-200", "Linha Regional", atributos, tema, false));

			// CARTA 3C
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Peso Máximo", "kg", 36000));
			atributos.add(new Atributo("Velocidade", "km/h", 790));
			atributos.add(new Atributo("Altitude Vôo", "m", 10600));
			atributos.add(new Atributo("Comprimento", "m", 36.27));
			atributos.add(new Atributo("Altura", "m", 7.29));
			this.add(new Carta("3C", "Bombardier CRJ 900", "Linha Regional", atributos, tema, false));

			// CARTA 3D
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Peso Máximo", "kg", 15200));
			atributos.add(new Atributo("Velocidade", "km/h", 720));
			atributos.add(new Atributo("Altitude Vôo", "m", 7000));
			atributos.add(new Atributo("Comprimento", "m", 21.28));
			atributos.add(new Atributo("Altura", "m", 7.20));
			this.add(new Carta("3D", "Fairchild 329 Jet", "Linha Regional", atributos, tema, false));

			//
			// CARTA 4A
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Peso Máximo", "kg", 122472));
			atributos.add(new Atributo("Velocidade", "km/h", 800));
			atributos.add(new Atributo("Altitude Vôo", "m", 11200));
			atributos.add(new Atributo("Comprimento", "m", 54.50));
			atributos.add(new Atributo("Altura", "m", 13.60));
			this.add(new Carta("4A", "Boeing 757-300", "Média Distância", atributos, tema, false));

			// CARTA 4B
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Peso Máximo", "kg", 64000));
			atributos.add(new Atributo("Velocidade", "km/h", 803));
			atributos.add(new Atributo("Altitude Vôo", "m", 11820));
			atributos.add(new Atributo("Comprimento", "m", 33.84));
			atributos.add(new Atributo("Altura", "m", 11.76));
			this.add(new Carta("4B", "Airbus A319-100", "Média Distância", atributos, tema, false));

			// CARTA 4C
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Peso Máximo", "kg", 56500));
			atributos.add(new Atributo("Velocidade", "km/h", 750));
			atributos.add(new Atributo("Altitude Vôo", "m", 9050));
			atributos.add(new Atributo("Comprimento", "m", 36.38));
			atributos.add(new Atributo("Altura", "m", 9.83));
			this.add(new Carta("4C", "Yakoklev YAK-42", "Média Distância", atributos, tema, false));

			// CARTA 4D
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Peso Máximo", "kg", 230000));
			atributos.add(new Atributo("Velocidade", "km/h", 846));
			atributos.add(new Atributo("Altitude Vôo", "m", 11820));
			atributos.add(new Atributo("Comprimento", "m", 63.70));
			atributos.add(new Atributo("Altura", "m", 16.84));
			this.add(new Carta("4D", "Airbus A330-300", "Média Distância", atributos, tema, false));

			//
			// CARTA 5A
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Peso Máximo", "kg", 365000));
			atributos.add(new Atributo("Velocidade", "km/h", 857));
			atributos.add(new Atributo("Altitude Vôo", "m", 11820));
			atributos.add(new Atributo("Comprimento", "m", 63.45));
			atributos.add(new Atributo("Altura", "m", 17.80));
			this.add(new Carta("5A", "Airbus A340-600", "Longa Distância", atributos, tema, false));

			// CARTA 5B
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Peso Máximo", "kg", 396900));
			atributos.add(new Atributo("Velocidade", "km/h", 920));
			atributos.add(new Atributo("Altitude Vôo", "m", 10600));
			atributos.add(new Atributo("Comprimento", "m", 70.70));
			atributos.add(new Atributo("Altura", "m", 19.30));
			this.add(new Carta("5B", "Boeing 747-400", "Longa Distância", atributos, tema, false));

			// CARTA 5C
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Peso Máximo", "kg", 185065));
			atributos.add(new Atributo("Velocidade", "km/h", 2170));
			atributos.add(new Atributo("Altitude Vôo", "m", 15550));
			atributos.add(new Atributo("Comprimento", "m", 62.17));
			atributos.add(new Atributo("Altura", "m", 12.19));
			this.add(new Carta("5C", "Concorde", "Longa Distância", atributos, tema, true));

			// CARTA 5D
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Peso Máximo", "kg", 583000));
			atributos.add(new Atributo("Velocidade", "km/h", 850));
			atributos.add(new Atributo("Altitude Vôo", "m", 11820));
			atributos.add(new Atributo("Comprimento", "m", 78.90));
			atributos.add(new Atributo("Altura", "m", 24.10));
			this.add(new Carta("5D", "Airbus A3XX-200", "Longa Distância", atributos, tema, false));

			//
			// CARTA 6A
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Peso Máximo", "kg", 161000));
			atributos.add(new Atributo("Velocidade", "km/h", 880));
			atributos.add(new Atributo("Altitude Vôo", "m", 11600));
			atributos.add(new Atributo("Comprimento", "m", 57.10));
			atributos.add(new Atributo("Altura", "m", 13.10));
			this.add(new Carta("6A", "DC-8-73F", "Cargueiro", atributos, tema, false));

			// CARTA 6B
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Peso Máximo", "kg", 142000));
			atributos.add(new Atributo("Velocidade", "km/h", 840));
			atributos.add(new Atributo("Altitude Vôo", "m", 11200));
			atributos.add(new Atributo("Comprimento", "m", 46.66));
			atributos.add(new Atributo("Altura", "m", 15.81));
			this.add(new Carta("6B", "Airbus A310 200F", "Airbus A310 200F", atributos, tema, false));

			// CARTA 6C
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Peso Máximo", "kg", 115650));
			atributos.add(new Atributo("Velocidade", "km/h", 860));
			atributos.add(new Atributo("Altitude Vôo", "m", 11600));
			atributos.add(new Atributo("Comprimento", "m", 47.30));
			atributos.add(new Atributo("Altura", "m", 13.60));
			this.add(new Carta("6C", "Boeing 757-200PF", "Cargueiro", atributos, tema, false));

			// CARTA 6D
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Peso Máximo", "kg", 186850));
			atributos.add(new Atributo("Velocidade", "km/h", 860));
			atributos.add(new Atributo("Altitude Vôo", "m", 10600));
			atributos.add(new Atributo("Comprimento", "m", 55.00));
			atributos.add(new Atributo("Altura", "m", 15.90));
			this.add(new Carta("6D", "Boeing 767-300F (ER)", "Cargueiro", atributos, tema, false));

			//
			// CARTA 7A
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Peso Máximo", "kg", 150000));
			atributos.add(new Atributo("Velocidade", "km/h", 780));
			atributos.add(new Atributo("Altitude Vôo", "m", 10000));
			atributos.add(new Atributo("Comprimento", "m", 56.16));
			atributos.add(new Atributo("Altura", "m", 17.25));
			this.add(new Carta("7A", "Airbus A300-600AT", "Super Cargueiro", atributos, tema, false));

			// CARTA 7B
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Peso Máximo", "kg", 210000));
			atributos.add(new Atributo("Velocidade", "km/h", 780));
			atributos.add(new Atributo("Altitude Vôo", "m", 13100));
			atributos.add(new Atributo("Comprimento", "m", 53.19));
			atributos.add(new Atributo("Altura", "m", 14.45));
			this.add(new Carta("6B", "Ilyushin IL-76MF", "Super Cargueiro", atributos, tema, false));

			// CARTA 7C
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Peso Máximo", "kg", 340200));
			atributos.add(new Atributo("Velocidade", "km/h", 920));
			atributos.add(new Atributo("Altitude Vôo", "m", 10600));
			atributos.add(new Atributo("Comprimento", "m", 70.70));
			atributos.add(new Atributo("Altura", "m", 19.30));
			this.add(new Carta("7C", "Boeing 747-100", "Super Cargueiro", atributos, tema, false));

			// CARTA 7D
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Peso Máximo", "kg", 600000));
			atributos.add(new Atributo("Velocidade", "km/h", 820));
			atributos.add(new Atributo("Altitude Vôo", "m", 10000));
			atributos.add(new Atributo("Comprimento", "m", 84.00));
			atributos.add(new Atributo("Altura", "m", 18.10));
			this.add(new Carta("7D", "Antonov An-225", "Super Cargueiro", atributos, tema, false));

			//
			// CARTA 8A
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Peso Máximo", "kg", 22500));
			atributos.add(new Atributo("Velocidade", "km/h", 2350));
			atributos.add(new Atributo("Altitude Vôo", "m", 16775));
			atributos.add(new Atributo("Comprimento", "m", 15.27));
			atributos.add(new Atributo("Altura", "m", 5.34));
			this.add(new Carta("8A", "Dassault 'Rafale'", "Defesa", atributos, tema, false));

			// CARTA 8B
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Peso Máximo", "kg", 17700));
			atributos.add(new Atributo("Velocidade", "km/h", 2350));
			atributos.add(new Atributo("Altitude Vôo", "m", 17900));
			atributos.add(new Atributo("Comprimento", "m", 21.90));
			atributos.add(new Atributo("Altura", "m", 6.40));
			this.add(new Carta("8B", "Sukhoi S-37", "Defesa", atributos, tema, false));

			// CARTA 8C
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Peso Máximo", "kg", 13000));
			atributos.add(new Atributo("Velocidade", "km/h", 849));
			atributos.add(new Atributo("Altitude Vôo", "m", 12900));
			atributos.add(new Atributo("Comprimento", "m", 13.23));
			atributos.add(new Atributo("Altura", "m", 3.75));
			this.add(new Carta("8C", "AMX International", "Defesa", atributos, tema, false));

			// CARTA 8D
			atributos = new ArrayList<>();
			atributos.add(new Atributo("Peso Máximo", "kg", 13000));
			atributos.add(new Atributo("Velocidade", "km/h", 1700));
			atributos.add(new Atributo("Altitude Vôo", "m", 18000));
			atributos.add(new Atributo("Comprimento", "m", 14.10));
			atributos.add(new Atributo("Altura", "m", 4.70));
			this.add(new Carta("8D", "Saab JA39 'Gripen'", "Defesa", atributos, tema, false));

			break;
		}
	}

	public void embaralhar() {
		Collections.shuffle(this); // EMBARALHA AS CARTAS
	}

	public Carta distribuir() {
		return this.poll(); // DISTRIBUI AS CARTAS DO TOPO
	}

	public String getTema() {
		return tema; // OBTÉM O TEMA ESCOLHIDO
	}

	public void setTema(String tema) {
		this.tema = tema; // MODIFICA O TEMA ESCOLHIDO
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Baralho (Tema: ").append(tema).append("):\n");
		for (Carta carta : this) {
			builder.append(carta).append("\n");
		}
		return builder.toString();
	}
}