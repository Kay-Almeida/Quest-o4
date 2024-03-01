package view;

import controller.FatorialController;

public class Principal {
	public static void main(String[] args) {
		
		FatorialController ft = new FatorialController();
		int n = 5; 
		
		if(n%2!=0 & n>0) {
			System.out.println("O fatorial duplo de "+ n + " é: "+ft.fatorial(n));
		}else {
			System.out.println("Insira um número ímpar!");
		}
		
	}

}
