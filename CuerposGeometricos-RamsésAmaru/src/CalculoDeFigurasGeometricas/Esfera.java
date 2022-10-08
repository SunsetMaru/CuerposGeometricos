package CalculoDeFigurasGeometricas;
import java.util.Scanner;
public class Esfera {
	public static void main(String[] args) {
		Scanner lec=new Scanner(System.in);
		double Area, Volumen, r;
		do{System.out.println("Digite el radio");r=lec.nextDouble();}while(r<=0);
		Area= 4*Math.PI*(Math.pow(r,2));
		Volumen = (Math.PI*Math.pow(r,3))*4/3;
		System.out.println("1.Datos de la Esfera:");
		System.out.println("2.Radio: "+r);
		System.out.println("3.Area Total: "+Area);
		System.out.println("4.Volumen: "+Volumen);
        lec.close();
	}
}
