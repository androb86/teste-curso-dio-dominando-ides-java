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
		int subtrašao = subtrašao(a,b);
		int multiplicašao = multiplicašao(a,b);
		double divisao = divisao(a,b);
		
		System.out.println("soma " + soma);
		System.out.println("sub " + subtrašao );
		System.out.println("mult " + multiplicašao );
		System.out.println("div " + divisao );
	
	
	
	}

	public static int soma (int a, int b) {
		return a + b;
	}

	public static int subtrašao (int a, int b) {
		return a - b;
	}
	
	public static int multiplicašao (int a, int b) {
		return a * b;
	}
	public static double divisao (double a, double b) {
		return a / b;
	}
	

}
