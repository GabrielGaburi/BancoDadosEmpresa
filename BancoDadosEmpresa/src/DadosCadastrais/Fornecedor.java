package DadosCadastrais;

import CadastroPessoa.PessoaJuridica;
import Interface.Interface1;

public class Fornecedor extends PessoaJuridica implements Interface1 {
	
	private double limiteCompra;
	private String dataCadastro;
	private String site;
	
	
	
	

	public Fornecedor() {
		super();
	}
	
	

	public Fornecedor(double limiteCompra, String dataCadastro, String site) {
		super();
		this.limiteCompra = limiteCompra;
		this.dataCadastro = dataCadastro;
		this.site = site;
	}

	

	public double getLimiteCompra() {
		return limiteCompra;
	}



	public void setLimiteCompra(double limiteCompra) {
		this.limiteCompra = limiteCompra;
	}



	public String getDataCadastro() {
		return dataCadastro;
	}



	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}



	public String getSite() {
		return site;
	}



	public void setSite(String site) {
		this.site = site;
	}


	@Override
	public void entrar() {
		
		super.entrar();
		System.out.print("Digíte o limite de compra: ");
		limiteCompra = leia.nextDouble();
		leia.next();
		System.out.println("Digíte a data de cadastro: ");
		dataCadastro = leia.nextLine();
		site = leia.next();
		
	}
	
	public void imprimir() {
		
		super.imprimir();
		System.out.println("Limite de compra: " + String.format("%.2f", getLimiteCompra()));
		System.out.println("Data de cadastro: " + getDataCadastro());
		System.out.println("Site: " + getSite());
		
	}



	public void remove() {
		// TODO Auto-generated method stub
		
	}

}

	

