package exercicios;

import java.util.Scanner;

public class Exer14 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		float ImpostoRenda = 0f; 
		float GanhoHora = 0f; 
		float SalarioBruto = 0f; 
		float Inss = 0f; 
		float Sindicato = 0f; 
		float SalrioLiquido = 0f; 
		float DescontosTotal = 0f; 
		int HorasMes;
		
		System.out.println("Informe quanto voce ganha por hora : ");
		GanhoHora = entrada.nextFloat();
		System.out.println("Informe o numero de horas trabalhadas no mes: ");
		HorasMes = entrada.nextInt();
		SalarioBruto = (GanhoHora * HorasMes);
		Inss = (SalarioBruto * (8 / 100f));
		Sindicato = (SalarioBruto * (5 / 100f));
		ImpostoRenda = (SalarioBruto * (11 / 100f));
		DescontosTotal = (Inss + Sindicato + ImpostoRenda);
		SalrioLiquido = (SalarioBruto - DescontosTotal);
		
		System.out.println("Salario bruto : R$" + SalarioBruto);
		System.out.println("Salario liquido: R$" + SalrioLiquido);
		System.out.println("Foi pago ao INSS: R$" + Inss);
		System.out.println("Foi pago ao sindicato: R$" + Sindicato);
		
		entrada.close();
	}
}