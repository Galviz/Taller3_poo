package Punto4;
import java.util.Scanner;
public class Punto4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int x, a, b, c;
		double y;
		System.out.println("Ingrese el valor de x");
		x = sc.nextInt();
		System.out.println("Ingrese el valor de a");
		a = sc.nextInt();
		System.out.println("Ingrese el valor de b");
		b = sc.nextInt();
		System.out.println("Ingrese el valor de c");
		c = sc.nextInt();
		y = a * (Math.pow(x,2)) + (b * x) + c;
		System.out.println("El valor de y es: "+y);
		sc.close();
	}
}
