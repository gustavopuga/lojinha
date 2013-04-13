package br.com.airu.produto;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ProdutoImportadoTest {

	private ProdutoImportado produto;

	@Before
	public void criaProdutoImportado() {
		produto = new ProdutoImportado("produto importado de teste", 1000);
	}

	@Test
	public void devePossuirPrecoTotalIgualAoPrecoVezesATaxaDeImportacao() {

		int preco = produto.getPreco();
		int precoTotal = produto.getPrecoTotal();
		int calculoManualPreco = (int) (preco * ProdutoImportado.TAXA_DE_IMPORTACAO);
		
		assertEquals(calculoManualPreco, precoTotal);
	}
}
