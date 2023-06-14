package DadosCadastrais;

import CadastroPessoa.PessoaFisica;
import Interface.Interface1;

public class Funcionario extends PessoaFisica implements Interface1 {
	
	private String dataAdmissao;
	private String dataDemissao;
	private String cpts;
	private double salario;
	
	public Funcionario() {
		super();
	}

	

	public Funcionario(String dataAdmissao, String dataDemissao, String cpts, double salario) {
		super();
		this.dataAdmissao = dataAdmissao;
		this.dataDemissao = dataDemissao;
		this.cpts = cpts;
		this.salario = salario;
	}

	

	public String getDataAdmissao() {
		return dataAdmissao;
	}



	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}



	public String getDataDemissao() {
		return dataDemissao;
	}



	public void setDataDemissao(String dataDemissao) {
		this.dataDemissao = dataDemissao;
	}



	public String getCpts() {
		return cpts;
	}



	public void setCpts(String cpts) {
		this.cpts = cpts;
	}



	public double getSalario() {
		return salario;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}


	@Override
	public void entrar () {
		
		super.entrar();
		System.out.print("Digíte a data de admissão: ");
		dataAdmissao = leia.nextLine();
		System.out.print("Digíte a data de demissão: " );
		dataDemissao = leia.nextLine();
		System.out.print("Digíte o CPTS: ");
		cpts = leia.nextLine();
		System.out.print("Digíte o salário");
		salario = leia.nextDouble();
		
	}
	
	public void imprimir() {
		
		super.imprimir();
		System.out.println("Data de admissão: " + getDataAdmissao());
		System.out.println("Data de demissão: " + getDataDemissao());
		System.out.println("CPTS: " + getCpts());
		System.out.println("Salário:" + String.format("%.2f", getSalario()));
		
	}

}
