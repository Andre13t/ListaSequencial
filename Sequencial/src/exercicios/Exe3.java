package exercicios;

import java.util.Scanner;

public class Exe3 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int Num1 = 0;
		int Num2 = 0;

		System.out.println("Informe o primeiro numero : ");
		Num1 = entrada.nextInt();
		System.out.println("Informe o segundo numero : ");
		Num2 = entrada.nextInt();
		System.out.println("A soma dos números e : " + (Num1 + Num2));

		entrada.close();
	}

}
