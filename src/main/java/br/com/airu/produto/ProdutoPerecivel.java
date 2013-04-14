package br.com.airu.produto;

public class ProdutoPerecivel extends Produto{

	private static final int FRETE = 10 * FRETE_PADRAO;
	private static final int PRAZO = 3;

	public ProdutoPerecivel(String titulo, int preco) {
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
