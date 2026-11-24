package prjForDoWhile;

import java.util.Scanner;

public class Atividade16 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n1, prox = 0, i, valor=0;
		
		for (i=0; i<=10; i++) {
			System.out.println("Digite o número");
			n1 = in.nextInt();
			
			if (i==1 || n1>prox) {
				prox = n1;
				n1++;
			}
			
		}	System.out.println(prox);
	}
}
