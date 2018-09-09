package Puntol1;
import java.util.Scanner;
public class Puntol1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int a, b, c, d;
		System.out.println("Ingrese un numero");
		a = sc.nextInt();
		System.out.println("Ingrese un numero");
		b = sc.nextInt();
		System.out.println("Ingrese un numero");
		c = sc.nextInt();
		System.out.println("Ingrese un numero");
		d = sc.nextInt();
		if(a / b == c /d) {
			System.out.println("Si son iguales");
		}else {
			System.out.println("No son iguales");
		}
		sc.close();
	}
}