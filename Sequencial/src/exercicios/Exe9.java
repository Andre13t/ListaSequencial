package exercicios;

import java.util.Scanner;

public class Exe9 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int temp;

		System.out.println("Informe a temperatura em  farenheit: ");
		temp = entrada.nextInt();
		System.out.println("A temperatura em graus celsius e: " + (5 * (temp - 32) / 9));
		
		entrada.close();	
	}

}
