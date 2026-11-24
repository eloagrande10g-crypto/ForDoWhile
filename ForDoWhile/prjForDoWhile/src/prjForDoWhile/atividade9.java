package prjForDoWhile;

import java.util.Scanner;

public class atividade9 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int i, soma=0;
		
		for (i=1; i<=100; i++) {
			soma= soma+i;
						
		}System.out.println("A soma é: "+soma);
	}
}