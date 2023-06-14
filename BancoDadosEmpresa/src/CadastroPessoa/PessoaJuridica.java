package CadastroPessoa;

import Interface.Interface1;

public  abstract class PessoaJuridica extends Pessoa implements Interface1{
	
	private String cnpj;
	private String inscricaoEstadual;
	private String contato;
	
	
	public PessoaJuridica() {
		super();
	}
	
	

	public PessoaJuridica(String cnpj, String inscricaoEstadual, String contato) {
		super();
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
		this.contato = contato;
	}



	public String getCnpj() {
		return cnpj;
	}



	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}



	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}



	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}



	public String getContato() {
		return contato;
	}



	public void setContato(String contato) {
		this.contato = contato;
	}



	@Override
	
	public void entrar() {
		
		super.entrar();
		System.out.print("Digíte o CNPJ: ");
		cnpj = leia.nextLine();
		System.out.print("Digite a inscrição estadual da empresa: ");
		inscricaoEstadual = leia.nextLine();
		System.out.print("Digíte o contato:");
		contato = leia.nextLine();
		
	}
	
	@Override
	
	public void imprimir() {
		
		super.imprimir();
		System.out.println("CNPJ: " + getCnpj());
		System.out.println("Inscrição estadual: " + getInscricaoEstadual());
		System.out.println("Contato : " + getContato());
		
	}
}

