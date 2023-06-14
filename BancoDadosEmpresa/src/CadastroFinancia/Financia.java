package CadastroFinancia;

import Interface.Interface1;

public abstract class Financia implements Interface1 {
	
	private	int id;
	private int numero;
	private String emissao;
	private String vencimento;
	private String pagamento;
	private double valor;
	private double juros;
	private double multa;
	private double desconto;
	public double total;
	public double total1;
	
	

	public Financia() {
		super();
	}

	public Financia(int id, int numero, String emissao, String vencimento, String pagamento, double valor, double juros,
			double multa, double desconto, double total, double total1) {
		super();
		this.id = id;
		this.numero = numero;
		this.emissao = emissao;
		this.vencimento = vencimento;
		this.pagamento = pagamento;
		this.valor = valor;
		this.juros = juros;
		this.multa = multa;
		this.desconto = desconto;
		this.total = total;
		this.total1 = total1;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getEmissao() {
		return emissao;
	}

	public void setEmissao(String emissao) {
		this.emissao = emissao;
	}

	public String getVencimento() {
		return vencimento;
	}

	public void setVencimento(String vencimento) {
		this.vencimento = vencimento;
	}

	public String getPagamento() {
		return pagamento;
	}

	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}

	public double getMulta() {
		return multa;
	}

	public void setMulta(double multa) {
		this.multa = multa;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public void setTotal1(double total1) {
		this.total1 = total1;
	}


	public void entrar() {
		
		System.out.print("Digíte o ID: ");
		id = leia.nextInt();
		System.out.print("Digíte o número: ");
		numero = leia.nextInt();
		leia.next();
		System.out.print("Digíte a data de emissão: ");
		emissao = leia.next();
		System.out.print("Digíte a data de vencimento: ");
		vencimento = leia.next();
		System.out.print("Digíte a data de pagamento: ");
		pagamento = leia.next();
		System.out.print("Digíte o valor: ");
		valor = leia.nextDouble();
		System.out.print("Digíte o juro: ");
		juros = leia.nextDouble();
		System.out.print("Digíte a multa: ");
		multa = leia.nextDouble();
		System.out.print("Digíte o desconto: ");
		desconto = leia.nextDouble();
			
		
		
	}
	
	
	public void imprimir() {
		
		System.out.println("ID: " + getId());
		System.out.println("Número: " + getNumero());
		System.out.println("Data de emissão: " + getEmissao());
		System.out.println("Data de vencimento: " + getVencimento());
		System.out.println("Data de pagamento: " + getPagamento());
		System.out.println("Valor: " + String.format("%.2f", getValor()));
		System.out.println("Juros: " + String.format("%.2f", getJuros()));
		System.out.println("Multa: " + String.format("%.2f", getMulta()));
		System.out.println("Desconto: " + String.format("%.2f", getDesconto()));
		
	}
	
	
}
