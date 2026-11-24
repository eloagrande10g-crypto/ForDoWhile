package prjForDoWhile;

import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int i, soma=0;
		
		for (i=2; i<=100; i+=2) {
			soma= soma+i;
			
		}System.out.println("A soma é: "+soma);
	}
}