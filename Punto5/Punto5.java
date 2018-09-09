package Punto5;
import java.util.Scanner;
public class Punto5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		double numero1, numero2, suma, resta, multiplicacion, division;
		System.out.println("Ingrese el primer numero");
		numero1 = sc.nextInt();
		System.out.println("Ingrese el segundo numero");
		numero2 = sc.nextInt();
		suma = numero1 + numero2;
		System.out.println("La suma es: "+suma);
		resta = numero1 - numero2;
		System.out.println("La resta es: "+resta);
		multiplicacion = numero1 * numero2;
		System.out.println("La multiplicacion es: "+multiplicacion);
		division = numero1 / numero2;
		System.out.println("La division es: "+division);
		sc.close();
	}
}
