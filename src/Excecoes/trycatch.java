package Excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class trycatch {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		try {
			int n = ler.nextInt();
			System.out.println(30/n);
		} catch(InputMismatchException erro) {
			System.out.println("Você só pode informar numeros inteiros! "+erro);
		} catch(ArithmeticException erro) {
			System.out.println("Nenhum pode ser dividido por 0"+erro);
		} finally {
			System.out.println("FIM");
		}
	}

}
