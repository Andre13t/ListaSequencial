package exercicios;

import java.util.Scanner;

public class Exer11 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float Altura;

		System.out.println("Informe a sua altura: ");
		Altura = entrada.nextFloat();
		System.out.println("O seu peso ideal e : " + ((72.7 * Altura) - 58));

		entrada.close();
	}

}
