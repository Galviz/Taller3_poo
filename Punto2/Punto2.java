package Punto2;
import java.util.Scanner;
public class Punto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		double a, b, c, d;
		double r;
		System.out.println("Ingrese un numero");
		a = sc.nextInt();
		System.out.println("Ingrese un numero");
		b = sc.nextInt();
		System.out.println("Ingrese un numero");
		c = sc.nextInt();
		System.out.println("Ingrese un numero");
		d = sc.nextInt();
		r = (a + b / c) * d;
		System.out.println("El resultado de la ecuacion es: "+r);
		sc.close();
	}
}
