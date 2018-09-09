package Punto7;
import java.util.Scanner;
public class Punto7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int altura, base, hipotenusa;
		float resultado;
		System.out.println("Ingrese la base del triangulo");
		base = sc.nextInt();
		System.out.println("Ingrese la altura del triangulo");
		altura = sc.nextInt();
		hipotenusa = (altura * altura) + (base * base);
		resultado = (float) Math.sqrt(hipotenusa);
		System.out.println("La hipotenusa del triangulo es: "+resultado);
		sc.close();
	}
}