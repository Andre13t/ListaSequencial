package exercicios;

import java.util.Scanner;

public class Exer15 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float MetrosQuadrados = 0f;
		int QuantidaDeLatas = 0;

		System.out.println("Insera a area em metros quadrados que deveram ser pintado:");
		MetrosQuadrados = entrada.nextFloat();
		MetrosQuadrados /= 3;
		QuantidaDeLatas = (int) Math.ceil(MetrosQuadrados / 18);
		System.out.println("Quantidade de latas sera: " + QuantidaDeLatas + ", Pre�o Total: " + (QuantidaDeLatas * 80) + "R$");

		entrada.close();
	}
}
