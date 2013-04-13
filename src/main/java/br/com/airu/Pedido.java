package br.com.airu;

import br.com.airu.produto.Produto;

public class Pedido {

	private final Produto produto;
	private final int quantidade;

	public Pedido(final Produto produto, final int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	public int getValor() {
		return produto.getPrecoTotal() * quantidade;
	}
	
	public int calculaPrazo(int prazo){
		return produto.calculaPrazo(prazo);
	}

	public int getFrete() {
		return produto.getFrete();
	}
}
