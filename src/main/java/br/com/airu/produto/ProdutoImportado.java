package br.com.airu.produto;

public class ProdutoImportado extends Produto {

	private static final double TAXA_DE_IMPORTACAO = 1.5;
	private static final int FRETE = 20;

	public ProdutoImportado(String titulo, int preco) {
		super(titulo, preco);
	}

	public int getPrecoTotal() {
		return (int) (preco * TAXA_DE_IMPORTACAO);
	}
	
	public int calculaPrazo(int prazo) {
		return prazo < 15 ? 15 : prazo;
	}

	public int getFrete() {
		return FRETE;
	}

}
