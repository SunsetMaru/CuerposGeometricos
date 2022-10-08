package CalculoDeFigurasGeometricas;
import java.util.Scanner;
public class Tetraedro {
	public static void main(String[] args) {
		Scanner lec=new Scanner(System.in);
		double Area, Volumen, arista, H;
		do{System.out.println("Digite el valor de la arista");arista=lec.nextDouble();}while(arista <=0);
		H=arista*Math.sqrt(6)/3;
		Area= Math.pow(arista,2)*Math.sqrt(3);
		Volumen = Math.pow(arista,3)*Math.sqrt(2)/12;
		System.out.println("1.Datos de la Tetraedro:");
		System.out.println("2.Altura: "+H);
		System.out.println("3.Area Total: "+Area);
		System.out.println("4.Volumen: "+Volumen);
		lec.close();
	}
}
