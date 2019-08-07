package exercicios;

import java.util.Scanner;

public class Exe7 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float Quadradao = 0f;

		System.out.println("Informe a medida de um lado do quadrado : ");
		Quadradao = entrada.nextFloat();
		System.out.println("A area do quadrado e : " + (Quadradao * Quadradao));
		
		entrada.close();
	}

}
