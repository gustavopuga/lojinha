package br.com.airu.produto;

import static br.com.airu.produto.Produto.FRETE_PADRAO;
import static br.com.airu.produto.Produto.PRAZO_PADRAO;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ProdutoComumTest {

	private Produto produto;

	@Before
	public void criaProdutoComum() {
		produto = new ProdutoComum("produto comum de teste", 1000);
	}

	@Test
	public void devePossuirPrecoTotalIgualAoPreco() {

		int precoTotal = produto.getPrecoTotal();
		int preco = produto.getPreco();

		assertEquals(preco, precoTotal);
	}
	
	@Test
	public void devePossuirPrazoIgualAoPrazoPadrao() {
		assertEquals(PRAZO_PADRAO, produto.getPrazo());
	}

	@Test
	public void devePossuirFreteIgualAoFretePadrao() {
		assertEquals(FRETE_PADRAO, produto.getFrete());
	}
}
