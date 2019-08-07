package exercicios;

import java.util.Scanner;

public class Exer10 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int Num1, Num2;
		float NumReal = 0f;

		System.out.println("Dois numeros inteiros: ");
		Num1 = entrada.nextInt();
		Num2 = entrada.nextInt();
		System.out.println("Um numero real: ");
		NumReal = entrada.nextFloat();
		System.out.println("O produto do dobro do primeiro numero com metade do segundo e : " + ((2 * Num1) * (Num2 / 2)));
		System.out.println("A soma do triplo do primeiro numero com o terceiro e: " + ((3 * Num1) + NumReal));
		System.out.println("O terceiro numero elevado ao cubo e : " + (NumReal * NumReal * NumReal));

		entrada.close();
	}
}
