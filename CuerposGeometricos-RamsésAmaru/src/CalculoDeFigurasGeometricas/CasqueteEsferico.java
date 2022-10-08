package CalculoDeFigurasGeometricas;
import java.util.Scanner;
public class CasqueteEsferico {
	public static void main(String[] args) {
		Scanner lec=new Scanner(System.in);
		double Area, Volumen, r, R, h;
		do{
		System.out.println("Digite el radio menor");
		r=lec.nextDouble();}while(r<=0);
		do{
		System.out.println("Digite el radio mayor");
		R=lec.nextDouble();}while(R<=0);
		do{
		System.out.println("Digite la altura");
		h=lec.nextDouble();}while(h<=0);
		Area= 2*Math.PI*(R*h);
		Volumen = Math.PI*Math.pow(h,2)*((3*R)-h)/3;

		System.out.println("1.Datos de la Casquete Esferico:");
		System.out.println("2.Radio: "+r);
		System.out.println("3.Radio Mayor: "+R);
		System.out.println("4.Altura: "+h);
		System.out.println("5.Area Total: "+Area);
		System.out.println("6.Volumen: "+Volumen);
		lec.close();
	}
}
