package br.com.airu;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.airu.produto.Produto;
import br.com.airu.produto.ProdutoComum;
import br.com.airu.produto.ProdutoImportado;
import br.com.airu.produto.ProdutoManufaturado;
import br.com.airu.produto.ProdutoPerecivel;

public class ClienteTest {

	@Test
	public void testCheckoutSemCupom() {
		
		Cliente zacarias = new Cliente("Zacarias");
		
		Produto caixa = new ProdutoComum("caixa de milho", 1000);
		Produto boneca = new ProdutoManufaturado("boneca", 3000);
		Produto relogio = new ProdutoImportado("relógio", 6000);
		
		Pedido pedido1 = new Pedido(caixa, 2);
		Pedido pedido2 = new Pedido(boneca, 1);
		Pedido pedido3 = new Pedido(relogio, 1);
		
		zacarias.addPedido(pedido1);
		zacarias.addPedido(pedido2);
		zacarias.addPedido(pedido3);
		
		System.out.println(zacarias.checkout());
		
		assertEquals("Pedido para Zacarias\n" +
					 "Valor total: 14000\n" +
					 "Valor frete: 40\n" +
					 "Prazo de entrega: 15 dias\n", zacarias.checkout());
	}

	@Test
	public void testCheckoutSemCupomEComProdutoPerecivel() {
		
		Cliente zacarias = new Cliente("Zacarias");
		
		Produto caixa = new ProdutoComum("caixa de milho", 1000);
		Produto boneca = new ProdutoManufaturado("boneca", 3000);
		Produto relogio = new ProdutoImportado("relógio", 6000);
		Produto alface = new ProdutoPerecivel("alface", 10);
		
		Pedido pedido1 = new Pedido(caixa, 2);
		Pedido pedido2 = new Pedido(boneca, 1);
		Pedido pedido3 = new Pedido(relogio, 1);
		Pedido pedido4 = new Pedido(alface, 1);
		
		zacarias.addPedido(pedido1);
		zacarias.addPedido(pedido2);
		zacarias.addPedido(pedido3);
		zacarias.addPedido(pedido4);
		
		String checkout = zacarias.checkout();
		
		assertEquals("Pedido para Zacarias\n" +
					 "Valor total: 14010\n" +
					 "Valor frete: 140\n" +
					 "Prazo de entrega: 15 dias\n", checkout);
	}
	
	@Test
	public void testCheckoutComCupomEProdutoPerecivel() {
		
		Cliente zacarias = new Cliente("Zacarias");
		
		Produto caixa = new ProdutoComum("caixa de milho", 1000);
		Produto boneca = new ProdutoManufaturado("boneca", 3000);
		Produto relogio = new ProdutoImportado("relógio", 6000);
		Produto alface = new ProdutoPerecivel("alface", 10);
		
		Pedido pedido1 = new Pedido(caixa, 2);
		Pedido pedido2 = new Pedido(boneca, 1);
		Pedido pedido3 = new Pedido(relogio, 1);
		Pedido pedido4 = new Pedido(alface, 1);
		
		zacarias.addPedido(pedido1);
		zacarias.addPedido(pedido2);
		zacarias.addPedido(pedido3);
		zacarias.addPedido(pedido4);
		
		Cupom cupom = new Cupom("Codigo de verificação", 10, 1);
		zacarias.addCupom(cupom);
		String checkout = zacarias.checkout();
		
		assertEquals("Pedido para Zacarias\n" +
					 "Valor total: 14000\n" +
					 "Valor frete: 140\n" +
					 "Desconto: 10\n" +
					 "Prazo de entrega: 15 dias\n", checkout);
	}
}
