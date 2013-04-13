package br.com.airu;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.airu.produto.Produto;
import br.com.airu.produto.ProdutoComum;

public class PedidoTest {

	private Pedido pedido;
	private Produto produto;

	@Before
	public void criarPedido(){
		produto = new ProdutoComum ("produto de teste", 1000);
		pedido = new Pedido(produto, 2);
	}
	
	@Test
	public void deveRetornarComoMaiorPrazoOPrazoDoProduto() {
		assertEquals(produto.getPrazo(), pedido.calculaPrazo(MIN_VALUE));
	}
	
	@Test
	public void deveRetornarComoMaiorPrazoOPrazoQueFoiPassado() {
		assertEquals(MAX_VALUE, pedido.calculaPrazo(MAX_VALUE));
	}
}
