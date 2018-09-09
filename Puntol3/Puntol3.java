package Puntol3;
import java.util.Scanner;
public class Puntol3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		double x1, x2, a, b, c, x;
		System.out.println("Ingrese el valor de a");
		a = sc.nextDouble();
		System.out.println("Ingrese el valor de b");
		b = sc.nextDouble();
		System.out.println("Ingrese el valor de c");
		c = sc.nextDouble();
		x = (Math.pow(b, 2))-(4 *(a * c));
		if(x == 0) {
			x1 = (-b) / (2 * a);
			System.out.println("El resultado es: "+x1);
		}else if(x < 0) {
			System.out.println("No tiene solucion");
		}else if(x > 0) {
			x1 = (-b) + Math.sqrt(x) / (2 * a);
			System.out.println("El resultado de x1 es: "+x1);
			x2 = (-b) - Math.sqrt(x) / (2 * a);
			System.out.println("El resultado de x2 es: "+x2);
		}
		sc.close();
	}
}