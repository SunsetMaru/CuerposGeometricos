package CalculoDeFigurasGeometricas;
import java.util.Scanner;
public class Cilindro {
	public static void main(String[] args) {
		Scanner lec=new Scanner(System.in);
		int r;
		double areaTotal, Volumen, h, areaLateral, a;
		
		do{
		System.out.println("Digite el radio");
		r=lec.nextInt();}while(r<=0);
		do{
		System.out.println("Digite la altura");
		h=lec.nextDouble();}while(h<=0);
		a=(2*Math.PI);
		areaLateral= a*(r*h);
		areaTotal= a*r*(h+r);
		Volumen = (Math.PI*(Math.pow(r,2)))*h;
		System.out.println("1.Datos del Cilindro:");
		System.out.println("2.Radio: "+r);
		System.out.println("3.Altura: "+h);
		System.out.println("4.Area Lateral: "+areaLateral);
		System.out.println("5.Area Total: "+areaTotal);
		System.out.println("6.Volumen: "+Volumen);
		lec.close();
	}
}
