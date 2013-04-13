package br.com.airu.produto;

public class ProdutoManufaturado extends Produto{

	private static final int FRETE = 10;

	public ProdutoManufaturado(String titulo, int preco) {
		super(titulo, preco);
	}

	public int getPrecoTotal() {
		return preco;
	}
	
	public int calculaPrazo(int prazo) {
		return prazo < 5 ? 5 : prazo;
	}

	public int getFrete() {
		return FRETE;
	}

}