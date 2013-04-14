package br.com.airu;

import static java.lang.String.format;

import java.util.List;

public class LojinhaUtil {

	public static String processaCheckout(Cliente cliente) {
		
		int total = 0;
		int prazo = 0;
		int frete = 0;
		int desconto = 0;
		
		String nome = cliente.getNome();
		List<Cupom> cupons = cliente.listaCupons();
		List<Pedido> pedidos = cliente.listaPedidos();
		
		for (final Pedido pedido : pedidos) {
			total += pedido.getValor();
			prazo = pedido.calculaPrazo(prazo);
			frete += pedido.getFrete();
		}
		
		if (!pedidos.isEmpty()){
			for (final Cupom cupom : cupons) {
				desconto += cupom.getValorDesconto();
			}
		}
		
		total -= desconto;
		String mensagem = geraMensagemCheckout(nome, total, prazo, frete, desconto);
		
		return mensagem;
	}

	private static String geraMensagemCheckout(String nome, int total, int prazo, int frete, int desconto) {
		
		StringBuilder mensagem = new StringBuilder();
		mensagem.append(format("Pedido para %s\n", nome));
		mensagem.append(format("Valor total: %d\n", total));
		mensagem.append(format("Valor frete: %d\n", frete));
		
		if (desconto > 0){
			mensagem.append(format("Desconto: %d\n", desconto));
		}
		
		mensagem.append(format("Prazo de entrega: %d dias\n", prazo));
		
		return mensagem.toString();
	}
}
