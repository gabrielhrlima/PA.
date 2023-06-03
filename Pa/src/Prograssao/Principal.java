package Prograssao;
import javax.swing.*;
public class Principal {

	public static void main(String[] args) {
		Pa pa1, //locação de cada objeto do tipo PA
		   pa2,
		   pa3;
		//leitura de dados
		String str1 = JOptionPane.showInputDialog("Infome o termo a0 da PA");
		String str2 = JOptionPane.showInputDialog("Infome a quantidade de termos da PA");
		String str3 = JOptionPane.showInputDialog("Infome a razão da PA");
		//mudando os tipos das variaveis 
		int a=Integer.parseInt(str1);
		int b=Integer.parseInt(str2);
		int c=Integer.parseInt(str3);
		pa1=new Pa(a,b,c);//instanciando o objeto pa1
		pa1.computaPa();//metodo para calcular pa
		JOptionPane.showMessageDialog(null,pa1.imprimir());//mostrando o resultado

	}

}
