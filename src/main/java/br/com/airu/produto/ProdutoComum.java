package br.com.airu.produto;

public class ProdutoComum extends Produto{

	private static final int FRETE = 10;

	public ProdutoComum(String titulo, int preco) {
		super(titulo, preco);
	}

	public int getPrecoTotal() {
		return preco;
	}
	
	public int calculaPrazo(int prazo) {
		return prazo < 3 ? 3 : prazo;
	}

	public int getFrete() {
		return FRETE;
	}

}
