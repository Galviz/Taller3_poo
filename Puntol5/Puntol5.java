package Puntol5;
import java.util.Scanner;
public class Puntol5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int []vector = new int[3];
		int mayor = 0, menor = 9999;
		System.out.println("Ingrese tres numeros");
		for(int i = 0; i<3;i++) {
			vector[i] = sc.nextInt();
			if(vector[i]<menor) {
				menor = vector[i];
				
			}else if(vector[i]>mayor) {
				mayor = vector[i];
			}else {
				
			}
		
	}
		System.out.println("El numero mayor es: "+mayor);
		System.out.println("El numero menor es: "+menor);
		sc.close();
	}
}