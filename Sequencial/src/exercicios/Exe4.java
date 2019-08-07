package exercicios;

import java.util.Scanner;

public class Exe4 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float N1,N2,N3,N4;  
		
		System.out.println("Informe a nota 1 : ");
		N1 = entrada.nextFloat();
		System.out.println("Informe a nota 2 : ");
		N2 = entrada.nextFloat();
		System.out.println("Informe a nota 3 : ");
		N3 = entrada.nextFloat();
		System.out.println("Informe a nota 4 : ");
		N4 = entrada.nextFloat(); 
		System.out.println("A media das notas é : " + ((N1+N2+N3+N4)/4));
		
		entrada.close(); 
	}

}
