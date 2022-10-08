package CalculoDeFigurasGeometricas;
import java.util.Scanner;
public class Octaedro {
	public static void main(String[] args) {
		Scanner lec=new Scanner(System.in);
		double Area, Volumen, arista;
		do{System.out.println("Digite el valor de la arista");arista=lec.nextDouble();}while(arista <=0);
		Area= 2*Math.pow(arista,2)*Math.sqrt(3);
		Volumen = Math.pow(arista,3)*Math.sqrt(2)/3;
		System.out.println("1.Datos de la Octaedro:");
		System.out.println("2.Area Total: "+Area);
		System.out.println("3.Volumen: "+Volumen);
        lec.close();
	}
}
