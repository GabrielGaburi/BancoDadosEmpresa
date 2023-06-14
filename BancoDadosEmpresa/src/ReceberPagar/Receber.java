package ReceberPagar;

import CadastroFinancia.Financia;
import DadosCadastrais.Cliente;
import Interface.Interface1;

public class Receber extends Financia implements Interface1  {
	
	
	Cliente receber =  new Cliente();
	
	private Cliente cliente;
	private String notaFiscal;
	
	public Receber() {
		super();
	}

	

	public Receber(Cliente receber, Cliente cliente, String notaFiscal) {
		super();
		this.receber = receber;
		this.cliente = cliente;
		this.notaFiscal = notaFiscal;
	}

	public Cliente getReceber() {
		return receber;
	}



	public void setReceber(Cliente receber) {
		this.receber = receber;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public String getNotaFiscal() {
		return notaFiscal;
	}



	public void setNotaFiscal(String notaFiscal) {
		this.notaFiscal = notaFiscal;
	}


	@Override
	public void entrar() {
		
		super.entrar();
		leia.next();
		System.out.print("Digíte o número da nota fiscal: ");
		notaFiscal = leia.nextLine();
		
	}
	
	public void imprimir() {
		
		super.imprimir();
		System.out.println("Número da nota fiscal: " + getNotaFiscal());
		
	}

}
