package br.com.airu.produto;

public abstract class Produto {

	public static final int FRETE_PADRAO = 10;
	public static final int PRAZO_PADRAO = 3;
	
	protected final String titulo;
	protected final int preco;
	
	public Produto(final String titulo, final int preco) {
		this.titulo = titulo;
		this.preco = preco;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public int getPreco() {
		return preco;
	}

	public abstract int getPrecoTotal();
	
	public abstract int getPrazo();
	
	public abstract int getFrete();
	
}
