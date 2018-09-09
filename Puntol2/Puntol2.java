package Puntol2;
import java.util.Scanner;
public class Puntol2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int x, a, b, c, d;
		double cat;
		System.out.println("Ingrese el valor de x");
		x = sc.nextInt();
		System.out.println("Ingrese el valor de a");
		a = sc.nextInt();
		System.out.println("Ingrese el valor de b");
		b = sc.nextInt();
		System.out.println("Ingrese el valor de c");
		c = sc.nextInt();
		System.out.println("Ingrese el valor de d");
		d = sc.nextInt();
		if(x == 0) {
			cat = (a + b) / (c + d);
			System.out.println("El valor de cat es: "+cat);
		}else if(x < 0) {
			cat = a + b - c + d;
			System.out.println("El valor de cat es: "+cat);
		}else if(x > 0) {
			cat = (a + b) * (c + d);
			System.out.println("El valor de cat es: "+cat);
		}
		sc.close();
	}
}
