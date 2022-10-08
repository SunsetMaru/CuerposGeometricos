package CalculoDeFigurasGeometricas;
import java.util.Scanner;
public class Prisma {
	public static void main(String[] args) {
		Scanner lec=new Scanner(System.in);
		int h, n;
		double l, At, Pb, angulo, ap, Al, Abase, Volumen;
		do{System.out.println("Digite la altura");
		h=lec.nextInt();}while(h<=0);
		do{System.out.println("Digite el numero de lado");
		n=lec.nextInt();}while(n<=0);
		do{System.out.println("Digite la longitud de los lados");
		l=lec.nextDouble();}while(l<=0);
		Pb=l*n;
		Al=Pb*h;
		angulo=360/(2*n);
		ap=l/(2*Math.tan(angulo));
		Abase=(Pb*ap)/2;
		At=Al+(2*Abase);
		Volumen=Abase*h;
		
		System.out.println("Datos del prisma");
		System.out.println("1.Altura:"+h);
		System.out.println("2.Longitud de lados:"+l);
		System.out.println("3.Numero de lados:"+n);
		System.out.println("4.Perimetro de la base:"+Pb);
		System.out.println("5.Apotema:"+ap);
		System.out.println("6.Area lateral:"+Al);
		System.out.println("7.Area tota:"+At);
		System.out.println("8.Volumen:"+Volumen);
		
	}
	
}
