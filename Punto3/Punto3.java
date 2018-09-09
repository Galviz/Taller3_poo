package Punto3;
import java.util.Scanner;
public class Punto3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int var1, var2, var3;
		double vars,resultado;
		System.out.println("Ingrese un numero");
		var1=sc.nextInt();
		System.out.println("Ingrese un numero");
		var2=sc.nextInt();
		System.out.println("Ingrese un numero");
		var3 =sc.nextInt();
		vars=(var1+var2+var3)/2;
		vars=vars*(vars-var1)*(vars-var2)*(vars-var3);
		resultado= Math.sqrt(vars);
		System.out.println("resultado = "+resultado);
		sc.close();
	}
}