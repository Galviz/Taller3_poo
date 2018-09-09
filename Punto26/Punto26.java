package Punto26;
import java.util.Scanner;
public class Punto26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int velocidad;
		System.out.println("Ingrese la velocidad del vehiculo");
		velocidad = sc.nextInt();
		if(velocidad <= 90) {
			System.out.println("La velocidad esta bien");
		}else if(velocidad > 90) {
			System.out.println("El vehiculo va muy rapido");
		}else if(velocidad > 160) {
			System.out.println("No se puede medir esa velocidad");
		}
		sc.close();
	}
}