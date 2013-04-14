package br.com.airu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cliente {

	private final String nome;
	private final List<Pedido> pedidos = new ArrayList<Pedido>();
	private final List<Cupom> cupons = new ArrayList<Cupom>();

	public Cliente(final String nome) {
		this.nome = nome;
	}

	public void addPedido(final Pedido pedido) {
		pedidos.add(pedido);
	}

	public List<Pedido> listaPedidos() {
		return Collections.unmodifiableList(pedidos);
	}
	
	public void addCupom(final Cupom cupom) {
		cupons.add(cupom);
	}
	
	public List<Cupom> listaCupons() {
		return Collections.unmodifiableList(cupons);
	}
	
	public String getNome() {
		return nome;
	}

	public String checkout() {
		return LojinhaUtil.processaCheckout(this);
	}
	
}
