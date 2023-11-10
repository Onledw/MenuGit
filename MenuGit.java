package bucleforI;

import java.util.Scanner;

public class MenuGit {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);	
		int x=0;
	while (x!=5) {
		System.out.println("Selecione la función\n1:Suma\n2:Resta\n3:Multiplicación\n4:División\n5:Salir");
		x =sc.nextInt();
		switch (x) {
		case 1:
			System.out.println("Suma");
			break;
		case 2:
			System.out.println("Resta");
			break;
		case 3:
			System.out.println("Multiplicación");
			break;
		case 4:
			System.out.println("División");
			break;
			
		}
		
	}
	System.out.println("Saliendo del Programa");
	
	}
}
