package br.com.dio.calculadora;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		int a, b;
		
		System.out.println("Digite o primeiro valor:  ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor:  ");
		b = scan.nextInt();	
		
		int soma = soma(a,b);
		int subtra�ao = subtra�ao(a,b);
		int multiplica�ao = multiplica�ao(a,b);
		double divisao = divisao(a,b);
		
		System.out.println("soma = " + soma);
		System.out.println("sub  = " + subtra�ao );
		System.out.println("mult = " + multiplica�ao );
		System.out.println("div  = " + divisao );
	
	
	
	}

	public static int soma (int a, int b) {
		return a + b;
	}

	public static int subtra�ao (int a, int b) {
		return a - b;
	}
	
	public static int multiplica�ao (int a, int b) {
		return a * b;
	}
	public static double divisao (double a, double b) {
		return a / b;
	}
	

}
