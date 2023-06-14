package Variavel2;

import Interface.Interface1;

public class Telefone implements Interface1 {
	
	private int ddd;
	private long numero;
	
	
	public Telefone() {
		super();
	}
	

		
	public Telefone(int ddd, long numero) {
		super();
		this.ddd = ddd;
		this.numero = numero;
	}
	

	public int getDdd() {
		return ddd;
	}



	public void setDdd(int ddd) {
		this.ddd = ddd;
	}



	public long getNumero() {
		return numero;
	}



	public void setNumero(long numero) {
		this.numero = numero;
	}



	@Override
	public void entrar() {
		
		System.out.print("Digíte o DDD: ");
		ddd = leia.nextInt();;
		System.out.print("Digíte o número do telefone: ");
		numero = leia.nextLong();
	}
	
	@Override
	
	public void imprimir() {
		
		System.out.println("Telefone: (" + getDdd()+")" + getNumero());
		
	}



	
}
