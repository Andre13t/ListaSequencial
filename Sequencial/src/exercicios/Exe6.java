package exercicios;

import java.util.Scanner;

public class Exe6 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float Raio = 0f;

		System.out.println("Informe o valor do raio: ");
		Raio = entrada.nextFloat();
		System.out.println("A a area do circulo e : " + (3.14 * (Raio * Raio)));
		
		entrada.close();
	}
}
