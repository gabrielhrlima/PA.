package Prograssao;

public class Pa {
	private int n;
	private int r;
	private int soma;
	private Termo[] termos; 

	private Pa() {}
	public Pa(int a0, int n, int r) {
		termos= new Termo[n];
		termos[0]= new Termo(1,a0);
		this.n=n;
		this.r=r;
	}
	
	public Termo[] computaPa() {
		for(int i=2;i<=n;i++) {
			int valor=termos[0].getValor()+(i-1)*r;
			Termo t=new Termo(i,valor);
			termos[i-1]=t;
		}
		return termos;
	}
	
	
	
	public int somarTermos() {
		int soma =0;
		for(int i=0; i<n;i++) {
			soma += termos[i].getValor() ;
		}
		this.soma=soma;
		return soma;
	}
	
	public String imprimir() {
		String str="[";
		for(int i=0;i<n;i++) {
			str+=" "+termos[i].getValor()+ ", ";
		}
		str+="]";
		return str;
	}
}
