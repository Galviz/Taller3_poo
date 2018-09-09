package Punto27;
import java.util.Scanner;
public class Punto27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int []vector = new int[5];
		int suma = 0, i;
		System.out.println("Ingrese cinco numeros");
		for(i = 0; i<5;i++) {
			vector[i] = sc.nextInt();
			suma = suma + vector[i];
		}
		System.out.println("La suma de los elementos del vector es: "+suma);
		sc.close();
	}
}