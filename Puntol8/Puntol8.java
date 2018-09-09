package Puntol8;
import java.util.Scanner;

public class Puntol8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int horasTrabajadas, horasExtras;
		double sueldo = 0;
		float sueldoHora;
		String nombre;
		System.out.println("Ingrese el nombre del empleado");
		nombre = sc.nextLine();
		System.out.println("Ingrese las horas trabajadas por el empleado");
		horasTrabajadas = sc.nextInt();
		System.out.println("Ingrese el sueldo por hora del empleado");
		sueldoHora = sc.nextFloat();
		if(horasTrabajadas <= 40) {
			sueldo = sueldoHora * horasTrabajadas;
		}else if(horasTrabajadas > 40) {
			System.out.println("Ingrese las horas extras del empleado");
			horasExtras = sc.nextInt();
			sueldo = (40 * sueldoHora + horasExtras * sueldoHora * 1.5);
		}
		System.out.println("El empleado "+nombre+ " gana: "+sueldo);
		sc.close();
	}
}