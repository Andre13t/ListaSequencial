package exercicios;

import java.util.Scanner;

public class Exer13 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float Excesso, Peso, Multa;

		System.out.println("Informe o peso dos peixes: ");
		Peso = entrada.nextInt();

		if (Peso > 50) {
			Excesso = (Peso - 50);
			Multa = (4 * Excesso);
			System.out.println("O peso ultrapassou " + Excesso + "Kg a mais, portanto a multa e: R$" + Multa);
		} else {
			Excesso = 0;
			Multa = 0;
			System.out.println("O excesso e " + Excesso + ", a multa e R$" + Multa);
		}
		entrada.close();
	}
}