package exercicios;

import java.util.Scanner;

public class Exe8 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float SalarioHora = 0f;
		int HorasTrabalhadas = 0;

		System.out.println("Informe quanto voce ganha por hora : ");
		SalarioHora = entrada.nextFloat();
		System.out.println("Informe o numero de horas trabalhadas no mes: ");
		HorasTrabalhadas = entrada.nextInt();
		System.out.println("O salario e R$ " + (SalarioHora * HorasTrabalhadas) + " por mes ");

		entrada.close();
	}

}
