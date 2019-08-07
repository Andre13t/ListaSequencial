package exercicios;

import java.util.Scanner;

public class Exe2 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero;
		
		System.out.println("informe um numero ");
		numero= entrada.nextInt();
		System.out.println("o numero informado foi : " + numero );
		
		entrada.close();
	}
}
