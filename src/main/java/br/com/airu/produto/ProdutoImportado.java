package br.com.airu.produto;

public class ProdutoImportado extends Produto {

	public static final double TAXA_DE_IMPORTACAO = 1.5;
	private static final int FRETE = 20;
	private static final int PRAZO = 15;

	public ProdutoImportado(String titulo, int preco) {
		super(titulo, preco);
	}

	public int getPrecoTotal() {
		return (int) (preco * TAXA_DE_IMPORTACAO);
	}
	
	public int getPrazo() {
		return PRAZO;
	}
	
	public int getFrete() {
		return FRETE;
	}

}
