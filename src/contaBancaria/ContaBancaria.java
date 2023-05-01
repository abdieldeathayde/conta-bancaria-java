package contaBancaria;
import java.util.Scanner;

public class ContaBancaria {
	int saldo = 1000;
	
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public int depositar(int valor) {
		saldo = saldo + valor;
		return saldo;
	}
	public int sacar(int valor) {
		saldo = saldo - valor;
		return saldo;
	}
	public void exibeSaldo(int saldo) {
		System.out.println("O saldo eh: " + getSaldo());
	}
 }	

