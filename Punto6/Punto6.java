package Punto6;
import java.util.Scanner;
public class Punto6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int longitud1, longitud2, area;
		System.out.println("Ingrese la longitud 1");
		longitud1 = sc.nextInt();
		System.out.println("Ingrese la longitud 2");
		longitud2 = sc.nextInt();
		area = longitud1 * longitud2;
		System.out.println("El area del cuadrado es: "+area);
		sc.close();
	}
}
