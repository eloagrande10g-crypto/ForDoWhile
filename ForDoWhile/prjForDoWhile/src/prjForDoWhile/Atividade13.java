package prjForDoWhile;

import java.util.Scanner;

public class Atividade13 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n, i;
		
		System.out.println("Digite o número desejado: ");
		n = in.nextInt();
		
		for (i=1; i<=n; i++) {
			System.out.println(i);
		}
	}
}
