package br.com.main;

import br.com.classes.veiculos;

public class main {

	public static void main(String[] args) {
		
		veiculos carro = new veiculos();   //iniciando um objeto//
		carro.nome = "Corsa";
		carro.cor = "Amarelo";
		carro.motor = "16cv";
		carro.velocidade = 100;
		
		System.out.println("Nome: "+ carro.nome);
		System.out.println("Cor: "+ carro.cor);
		System.out.println("Motor: "+ carro.motor);
		System.out.println("Velocidade: "+ carro.velocidade);
		
		carro.ligar();
		
		
		carro.nome = "Uno";
		carro.cor = "Prata";
		carro.motor ="32cv";
		carro.velocidade = 85;
		
		System.out.println("Nome: "+ carro.nome);
		System.out.println("Cor: "+ carro.cor);
		System.out.println("Motor: "+ carro.motor);
		System.out.println("Velocidade: "+ carro.velocidade);
		carro.desligar();
		
		
		
		
	}

}
