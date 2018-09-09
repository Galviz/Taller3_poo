package Puntol6;
import java.util.Scanner;
public class Puntol6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int pago, credito, deuda;
		double nuevaDeuda;
		System.out.println("Ingrese el monto que va a pagar");
		pago = sc.nextInt();
		System.out.println("Ingrese la deuda pendiente");
		deuda = sc.nextInt();
		if(pago == deuda) {
			System.out.println("No debe nada, todas sus facturas estan pagadas ");
		}else if(pago > deuda) {
			credito = pago - deuda;
			System.out.println("El credito a favor es de: "+credito);
			
		}else if(pago < deuda) {
			nuevaDeuda = deuda + (deuda * 0.03);
			System.out.println("La nueva deuda es de:"+nuevaDeuda);
		}
		sc.close();
	}
}
