package CalculoDeFigurasGeometricas;
import java.util.Scanner;
public class HusoEsferico {
	public static void main(String[] args){
		Scanner lec=new Scanner(System.in);
		double Area, r, n;
		do{
	    System.out.println("Digite el radio");
		r=lec.nextDouble();}while(r<=0);
		do{
		System.out.println("Digite los grados");
		n=lec.nextDouble();}while(n<=0);
		Area= (Math.PI*Math.pow(r,2)*n)/90;
		System.out.println("1.Datos del huso Esferico:");
		System.out.println("2.Grados: "+n);
		System.out.println("3.Radio: "+r);
		System.out.println("4.Area Total: "+Area);
		lec.close();
	}
}
