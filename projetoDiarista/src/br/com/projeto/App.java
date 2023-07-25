package br.com.projeto;

import br.com.classes.Clientes;
import br.com.classes.Diarista;

public class App {

	public static void main(String[] args) {

		Diarista  diarista = new Diarista();
		diarista.nome = "João da Silva";
		diarista.telefone ="(11)99523-8879";
		diarista.endereco = "Av Cajamar, N 111";
		diarista.chavePix = "123";
		
		
		System.out.println("Nome Diarista: "+ diarista.nome);
		System.out.println("Telefone Diarista: "+ diarista.telefone);
		System.out.println("Endereço Diarista: "+ diarista.endereco);
		System.out.println("Chave Pix Diarista "+ diarista.chavePix);
		diarista.atender("Daniel");
		
		System.out.println("====================================================================================================");
		
		Clientes cliente = new Clientes();
		cliente.nome = "Daniel";
		cliente.telefone = "(11)995238879";
		cliente.endereco = "Av Osasco, N 41";
		cliente.saldo =100;
				
		System.out.println("Nome Cliente: "+ cliente.nome);
		System.out.println("Telefone Cliente: "+ cliente.telefone);
		System.out.println("Endereço Cliente: "+ cliente.endereco);
		System.out.println("Saldo Cliente: "+ cliente.saldo);
		
				
				
		
	}

}
