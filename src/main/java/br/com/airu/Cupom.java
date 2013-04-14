package br.com.airu;

public class Cupom {

	private int valorDesconto;
	private int valorMinimoDeCompra;
	private String codigoVerificacao;
	
	public Cupom(String codigoVerificacao, int valorDesconto, int valorMinimoDeCompra) {
		this.valorDesconto = valorDesconto;
		this.codigoVerificacao = codigoVerificacao;
		this.valorMinimoDeCompra = valorMinimoDeCompra;
	}

	public int getValorDesconto() {
		return valorDesconto;
	}

	public String getCodigoVerificacao() {
		return codigoVerificacao;
	}

	public boolean isValido (int valorCompra){
		return valorCompra > valorMinimoDeCompra; 
	}
	
}
