package contaBancaria;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		ContaBancaria contaBancaria1 = new ContaBancaria();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escolha uma opcao: \n0- Sair \n1- depositar \n2- sacar ");
		int opcao = sc.nextInt();
		
		System.out.print("Digite o valor do Saldo: ");
		int saldo = sc.nextInt();
		
		
		switch(opcao) {
			case 0:
				System.out.println("Fim do programa!");
				break;
			case 1:
				System.out.print("Digite o valor para depositar: ");
				int deposito = sc.nextInt();
				contaBancaria1.depositar(deposito);
				System.out.println("Saldo: R$ " + contaBancaria1.getSaldo());
				break;
			case 2:
				System.out.print("Digite o valor para sacar: ");
				int saque = sc.nextInt();
				contaBancaria1.sacar(saque);
				System.out.println("Saldo: R$ " + contaBancaria1.getSaldo());
				break;
		} 
		sc.close();
	}
}
