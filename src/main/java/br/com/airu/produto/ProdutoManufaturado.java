package br.com.airu.produto;

public class ProdutoManufaturado extends Produto{

	private static final int FRETE = 10;
	private static final int PRAZO = 5;

	public ProdutoManufaturado(String titulo, int preco) {
		super(titulo, preco);
	}

	public int getPrecoTotal() {
		return preco;
	}
	
	public int getPrazo() {
		return PRAZO;
	}

	public int getFrete() {
		return FRETE;
	}

}
