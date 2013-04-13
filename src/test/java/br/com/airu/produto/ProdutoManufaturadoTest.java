package br.com.airu.produto;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ProdutoManufaturadoTest {

	private ProdutoManufaturado produto;

	@Before
	public void criaProdutoManufaturado() {
		produto = new ProdutoManufaturado("produto importado de teste", 1000);
	}

	@Test
	public void devePossuirPrecoTotalIgualAoPreco() {

		int preco = produto.getPreco();
		int precoTotal = produto.getPrecoTotal();
		
		assertEquals(preco, precoTotal);
	}
	
	@Test
	public void devePossuirFreteIgualACinco() {
		assertEquals(5, produto.getPrazo());
	}
}
