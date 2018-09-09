package Punto20;
import java.util.Scanner;
public class Punto20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int numero = 5, resultado = 1, i;
		System.out.println("Tabla de multiplicar del numero 5");
		for(i = 1; i <= 10; i++) {
			resultado = numero * i;
			System.out.println(numero + "*" + i + "=" + resultado);
		}
		sc.close();
	}
}
