package prjForDoWhile;

import java.util.Scanner;

public class Atividade11 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n, i;
		
		System.out.println("Insira o número");
		n = in.nextInt();
		
		for (i=1; i<=10; i++){
		System.out.println(n+"x"+ i + "=" + (n*i));
		}
			
	}

}
