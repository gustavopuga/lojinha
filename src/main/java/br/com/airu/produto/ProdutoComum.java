package br.com.airu.produto;

public class ProdutoComum extends Produto{

	private static final int FRETE = FRETE_PADRAO;
	private static final int PRAZO = PRAZO_PADRAO;

	public ProdutoComum(String titulo, int preco) {
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
