package exercicios;

import java.util.Scanner;

public class Exe5 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float metro = 0;

		System.out.println("Informe um numero em metros: ");
		metro = entrada.nextFloat();
		System.out.println("o numero " + metro + " em e : " + (metro * 100));

		entrada.close();
	}

}
