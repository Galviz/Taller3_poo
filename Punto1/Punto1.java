package Punto1;
import java.util.Scanner;
public class Punto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int numero;
		double cuadrado, cubo;
		System.out.println("Ingrese un numero");
		numero = sc.nextInt();
		System.out.println("El numero ingresado es: "+numero);
		cuadrado = Math.pow(numero,2);
		System.out.println("El cuadrado del numero es: "+ cuadrado);
		cubo = Math.pow(numero,3);
		System.out.println("El cubo del numero es: "+ cubo);
		sc.close();
	}
}