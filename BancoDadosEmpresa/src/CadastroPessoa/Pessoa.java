package CadastroPessoa;

import Interface.Interface1;
import Variavel.Endereco;
import Variavel2.Telefone;

public abstract class Pessoa implements Interface1 {

	private int id;
	private String nome;
	private Endereco endereco = new Endereco();
	private Telefone telefone = new Telefone();

	private String email;

	public Pessoa() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public void entrar() {

		System.out.print("Digíte o ID: ");
		id = leia.nextInt();
		leia.next();
		System.out.print("Digíte o nome: ");
		nome = leia.next();
		endereco.entrar();
		telefone.entrar();
		leia.nextLine();
		System.out.print("Digíte o email: ");
		email = leia.next();
	}

	@Override
	public void imprimir() {

		System.out.println("ID: " + getId());
		System.out.println("Nome: " + getNome());
		System.out.println("Email: " + getEmail());
		endereco.imprimir();
		telefone.imprimir();
	}

}
