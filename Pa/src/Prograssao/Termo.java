package Prograssao;

public class Termo {
	private int valor;
	private int posicao;
	
	private Termo(){}
	public Termo(int posicao, int valor){
		this.valor=valor;
		this.posicao=posicao;
	}
	
	public int getValor() {
		return valor;
	}
	public int getPosicao() {
		return posicao;
	}
}
