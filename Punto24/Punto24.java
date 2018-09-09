package Punto24;
import java.util.Scanner;
public class Punto24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int isla = 24, anos = 360;
		double capital;
		
		capital = isla * 0.12 * anos;
		System.out.println("El capital en 1976 seria de: "+capital);
		sc.close();
	}	
}