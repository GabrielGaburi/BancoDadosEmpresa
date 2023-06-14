package Variavel;

import Interface.Interface1;
import Variavel.Endereco;

public class Endereco implements Interface1 {
	
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	
	public Endereco() {

	}
	
	public Endereco(String logradouro, String numero, String complemento, String bairro, String cidade, String estado,
			String cep) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}
	
	
		public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	@Override
	public void entrar() {
	
		System.out.print("Digíte a rua: ");
		logradouro = leia.next();
		System.out.print("Digíte o número: ");
		numero = leia.next();
		leia.nextLine();
		System.out.print("Digíte o complemento: ");
		complemento = leia.next();
		System.out.print("Digíte o bairro: ");
		bairro = leia.next();
		System.out.print("Digíte a cidade: ");
		cidade = leia.next();
		System.out.print("Digíte o estado: ");
		estado = leia.next();
		System.out.print("Digíte o cep: ");
		cep = leia.next();
		
	}

	@Override
	public void imprimir() {
		
		System.out.println("Rua: " + getLogradouro()  + ", Nº: " + getNumero() + ", complemento: " + getComplemento() + ", bairro: " + getBairro() + ", cidade: " + getCidade() + ", estado: " + getEstado() + ", CEP: " + getCep());
		
	}
	
}
