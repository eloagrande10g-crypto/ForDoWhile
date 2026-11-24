package prjForDoWhile;

import java.util.Scanner;

public class Atividade14 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n, i, pares=0;
		
	
		for (i=1; i<=10; i++) {
			System.out.println("Digite o "+(i)+"o número");
			n = in.nextInt();
			if (n % 2 == 0) {
				pares++;
				
			}
		}   System.out.println(pares);
		
	}
}
