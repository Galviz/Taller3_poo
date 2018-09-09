package Punto28;
import java.util.Scanner;
public class Punto28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int matriz[][]=new int[4][4];
		matriz[0][0] = 1;
		matriz[0][1] = 2;
		matriz[0][2] = 3;
		matriz[0][3] = 4;
		matriz[1][0] = 5;
		matriz[1][1] = 6;
		matriz[1][2] = 7;
		matriz[1][3] = 8;
		matriz[2][0] = 9;
		matriz[2][1] = 10;
		matriz[2][2] = 11;
		matriz[2][3] = 12;
		matriz[3][0] = 13;
		matriz[3][1] = 14;
		matriz[3][2] = 15;
		matriz[3][3] = 16;
		
		
		int vectorfila[]=new int[4];
		int vectorcolumna[]=new int[4];
		
		
		vectorfila[0]=matriz[0][0]+matriz[0][1]+matriz[0][2]+matriz[0][3];
		vectorfila[1]=matriz[1][0]+matriz[1][1]+matriz[1][2]+matriz[1][3];
		vectorfila[2]=matriz[2][0]+matriz[2][1]+matriz[2][2]+matriz[2][3];
		vectorfila[3]=matriz[3][0]+matriz[3][1]+matriz[3][2]+matriz[3][3];
		
		vectorcolumna[0]=matriz[0][0]+matriz[1][0]+matriz[2][0]+matriz[3][0];
		vectorcolumna[1]=matriz[0][1]+matriz[1][1]+matriz[2][1]+matriz[3][1];
		vectorcolumna[2]=matriz[0][2]+matriz[1][2]+matriz[2][2]+matriz[3][2];
		vectorcolumna[3]=matriz[0][3]+matriz[1][3]+matriz[2][3]+matriz[3][3];
		
		sc.close();
	}
}