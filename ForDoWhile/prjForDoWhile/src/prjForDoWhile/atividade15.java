package prjForDoWhile;

import java.util.Scanner;

public class atividade15 {

	public static void main(String[] args) {
			Scanner in = new Scanner (System.in);
			int n, i, soma=0;
			
		
			for (i=1; i<=10; i++) {
				System.out.println("Digite o "+(i)+"* número");
				n = in.nextInt();
				
				soma = soma+n;
			}   System.out.println(soma);	
		}
	}

