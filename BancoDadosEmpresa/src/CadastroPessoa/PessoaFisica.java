package CadastroPessoa;

import Interface.Interface1;

public abstract class PessoaFisica extends Pessoa implements Interface1 {

	private String cpf;
	private String rg;
	private String emissor;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEmissor() {
		return emissor;
	}

	public void setEmissor(String emissor) {
		this.emissor = emissor;
	}

	@Override

	public void entrar() {

		super.entrar();
		System.out.print("Digíte o CPF: ");
		cpf = leia.next();
		System.out.print("Digíte o RG: ");
		rg = leia.next();
		System.out.print("Digíte o orgão emissor: ");
		emissor = leia.next();
	}

	@Override

	public void imprimir() {
		super.imprimir();
		System.out.println("CPF: " + getCpf());
		System.out.println("RG: " + getRg());
		System.out.println("Orgão Emissor:" + getEmissor());
	}
}
