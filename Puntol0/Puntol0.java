package Puntol0;
import java.util.Scanner;
public class Puntol0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int numero;
		System.out.println("Ingrese un numero");
		numero = sc.nextInt();
		System.out.println("El numero es: "+numero);
		System.out.println("El valor absoluto del numero es: "+Math.abs(numero));
		sc.close();
	}
}
