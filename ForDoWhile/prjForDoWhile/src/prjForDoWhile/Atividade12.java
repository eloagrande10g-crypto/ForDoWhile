package prjForDoWhile;

import java.util.Scanner;

public class Atividade12 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int i, mul=1;
		
		for (i=1; i<=10; i++) {
			mul= mul*i;
						
		}System.out.println("A multiplicação é: "+mul);
	}
}

