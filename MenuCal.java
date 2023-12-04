package bucleforI;

import java.util.Scanner;

public class MenuCal {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int op;
	do {
		System.out.println("1:SUMA\n2:RESTA\n3:MULTIPLICACIÓN\n4:DIVISON\n5:SALIR");
		op=sc.nextInt();
		switch(op) {
		case 1:
			System.out.println("INTRODUZCE LOS SUMANDOS");
			int num=sc.nextInt();
			int num1=sc.nextInt();
			int suma=num+num1;
			System.out.println(suma);
			break;
		case 2:
			System.out.println("INTRODUZCE LA RESTA");
			num=sc.nextInt();
			num1=sc.nextInt();
			suma=num-num1;
			System.out.println(suma);
			break;
		case 3:
			System.out.println("INTRODUZCE LA MULTIPLICACIÓN");
			num=sc.nextInt();
			num1=sc.nextInt();
			suma=num*num1;
			System.out.println(suma);
			break;
		case 4:
			break;
		case 5:
			break;
			
		}
	}while(op!=5);
	System.out.println("SALIENDO DEL PROGRAMA");
	}
}
