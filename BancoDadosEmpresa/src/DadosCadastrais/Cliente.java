package DadosCadastrais;

import CadastroPessoa.PessoaFisica;
import Interface.Interface1;
import Variavel.Endereco;

public class Cliente extends PessoaFisica implements Interface1 {

	private double limiteCredito;
	private Endereco endereco;

	public Cliente() {

	}

	public Cliente(double limiteCredito, Endereco endereco) {
		this.limiteCredito = limiteCredito;
		this.endereco = endereco;
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public Endereco getEnderecoCobranca() {
		return endereco;
	}

	public void setEnderecoCobranca(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public void entrar() {

		super.entrar();
		System.out.print("Digíte o limite de crédito: ");
		limiteCredito = leia.nextDouble();
		leia.next();
		endereco.entrar();
	}

	public void imprimir() {

		super.imprimir();
		System.out.println("Limite de crédito: " + String.format("%.2f", getLimiteCredito()));
		endereco.imprimir();
	}

	public void setEndereco(String string) {
		// TODO Auto-generated method stub

	}

	public void setTelefone(String string) {
		// TODO Auto-generated method stub

	}

	public void getEmail(String string) {
		// TODO Auto-generated method stub

	}

	public void setCpf(String string) {
		// TODO Auto-generated method stub

	}

}
