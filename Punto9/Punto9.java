package Punto9;
import java.util.Scanner;
public class Punto9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		double horas, minutos, segundos, dias;
		System.out.println("Ingrese la cantidad de horas que quiere convertir");
		horas = sc.nextFloat();
		minutos = horas * (60 / 1);
		System.out.println("Los minutos son :"+minutos);
		segundos = horas * (60 / 1) * (60 / 1);
		System.out.println("Los segundos son :"+segundos);
		dias = horas / 24;
		System.out.println("Los dias son :"+dias);
		sc.close();
	}
}
