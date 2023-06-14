package ReceberPagar;

import CadastroFinancia.Financia;
import DadosCadastrais.Fornecedor;
import Interface.Interface1;

public class Pagar extends Financia implements Interface1  {
	
	Fornecedor pagar = new Fornecedor();
	
	private Fornecedor fornecedor;
	private String boleto;
	
	public Pagar() {
		super();
	}

	
	public Pagar(Fornecedor pagar, Fornecedor fornecedor, String boleto) {
		super();
		this.pagar = pagar;
		this.fornecedor = fornecedor;
		this.boleto = boleto;
	}
	
	

	public Fornecedor getPagar() {
		return pagar;
	}


	public void setPagar(Fornecedor pagar) {
		this.pagar = pagar;
	}


	public Fornecedor getFornecedor() {
		return fornecedor;
	}


	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}


	public String getBoleto() {
		return boleto;
	}


	public void setBoleto(String boleto) {
		this.boleto = boleto;
	}

	@Override
	public void entrar() {
		
		super.entrar();
		
		System.out.print("Digíte o número do Boleto: ");
		boleto = leia.next();
		
	}
	
	public void imprimir() {
		
		super.imprimir();
		System.out.println("Número do boleto: " + getBoleto());
		
	}

}
