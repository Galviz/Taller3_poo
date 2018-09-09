package Puntol9;
import java.util.Scanner;
public class Puntol9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int []vector = new int[10];
		int positivos = 0, negativos= 0;
		int cantidadCeros = 0;
		System.out.println("Ingrese los numeros");
		for(int i = 0; i<10;i++) {
			vector[i] = sc.nextInt();
			if(vector[i] > 0) {
				positivos += vector[i];
			}else {
				negativos += vector[i];
			}
			if(vector[i] == 0) {
				cantidadCeros++;
			}
		}
		System.out.println("La suma los numero postivos es: "+positivos);
		System.out.println("La suma los numero negativos es: "+negativos);
		System.out.println("La cantidad de ceros es: "+cantidadCeros);
		sc.close();
	}
}