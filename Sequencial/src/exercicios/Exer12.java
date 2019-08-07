package exercicios;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int Sexo;
		float Altura = 0f;

		System.out.println("Informe a sua altura: ");
		Altura = entrada.nextFloat();
		System.out.println("1-Mulher 2-Homem");
		Sexo = entrada.nextInt();

		if (Sexo == 1) {
			System.out.println("O seu peso ideal e : " + ((62.1 * Altura) - 44.7));
		} else {
			System.out.println("O seu peso ideal e : " + ((72.7 * Altura) - 58));
		}

		entrada.close();
	}
}