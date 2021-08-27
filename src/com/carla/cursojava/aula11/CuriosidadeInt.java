package com.carla.cursojava.aula11;

public class CuriosidadeInt {

	public static void main(String[] args) {
		
		int var1 = 2147483647; //limite do int
		int var2 = 1;
		
		System.out.println(var1+var2);//o que acontece quando soma algo com o número já no limite.
		
//-2147483648 (resposta: os números no java funcionam como uma roleta. Quando soma um número com o limite, ele volta para os números negativos.)

	}

}
