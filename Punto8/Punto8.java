package Punto8;
import java.util.Scanner;
public class Punto8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int altura = 1454, gravedad = 32;
		double velocidad , resultado;
		velocidad = 2 * gravedad * altura;
		resultado = Math.sqrt(velocidad);
		System.out.println("La velocidad de impacto al tocar el suelo es: "+resultado+ " pies/sg");
		sc.close();
	}
}
