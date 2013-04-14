package br.com.airu.produto;

public class ProdutoManufaturado extends Produto{

	private static final int FRETE = FRETE_PADRAO;
	private static final int PRAZO = PRAZO_PADRAO + 2;

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
