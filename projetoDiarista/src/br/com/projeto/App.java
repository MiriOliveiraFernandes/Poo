package br.com.projeto;

import br.com.classes.Atendimento;
import br.com.classes.Clientes;
import br.com.classes.Diarista;

public class App {

	public static void main(String[] args) {

		Diarista  diarista = new Diarista();
		diarista.setNome("João da Silva");
		diarista.setTelefone("(11)99523-8879");
		diarista.setEndereco("Av Cajamar, N 111");
		diarista.setChavePix("123");
		diarista.setSaldo(0);
		
		
		System.out.println("Nome Diarista: "+ diarista.getNome());
		System.out.println("Telefone Diarista: "+ diarista.getTelefone());
		System.out.println("Endereço Diarista: "+ diarista.getEndereco());
		System.out.println("Chave Pix Diarista: "+ diarista.getChavePix());
		System.out.println("Saldo Cliente: "+ diarista.getSaldo());
		diarista.depositar(50);
		System.out.println("Novo Saldo: "+ diarista.getSaldo());
		diarista.sacar(20);
		System.out.println("Novo Saldo: "+diarista.getSaldo());
		diarista.atender("Daniel");
		
		System.out.println("====================================================================================================");
		
		Clientes cliente = new Clientes();
		cliente.setNome( "Daniel");
		cliente.setTelefone( "(11)995238879");
		cliente.setEndereco("Av Osasco, N 41");
		cliente.setSaldo(0);
	
				
		System.out.println("Nome Cliente: "+ cliente.getNome());
		System.out.println("Telefone Cliente: "+ cliente.getTelefone());
		System.out.println("Endereço Cliente: "+ cliente.getEndereco());
		System.out.println("Saldo Cliente: "+ cliente.getSaldo());
		cliente.depositar(50);
		System.out.println("Novo Saldo: "+ cliente.getSaldo());
		cliente.sacar(20);
		System.out.println("Novo Saldo: "+ cliente.getSaldo());
		
		
		System.out.println("========================================================================");
		
		Atendimento atendimento = new Atendimento();
		
		atendimento.setHoras(0);
		
		System.out.println(atendimento.getHoras());
				
				
		
	}

}
