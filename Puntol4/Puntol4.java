package Puntol4;
import java.util.Scanner;
public class Puntol4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int numero;
		System.out.println("Ingrese un numero");
		numero = sc.nextInt();
		if(numero > 100) {
			numero += 20;
		}else if(numero == 100) {
			numero += 1;
		}else if(numero < 100) {
			numero -= 20;
		}
		System.out.println("El numero despues del calculo es: "+numero);
		sc.close();
	}
}