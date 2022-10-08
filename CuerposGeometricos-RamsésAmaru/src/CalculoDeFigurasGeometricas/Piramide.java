package CalculoDeFigurasGeometricas;
import java.util.Scanner;
public class Piramide {
	public static void main(String[] args) {
		Scanner lec=new Scanner(System.in);
		int h, n;
		double l, At, Pb, angulo, ap, Al, Abase, Volumen, AP;
		do{System.out.println("Digite la altura");
		h=lec.nextInt();}while(h<=0);
		do{System.out.println("Digite el numero de lado");
		n=lec.nextInt();}while(n<=0);
		do{System.out.println("Digite la longitud de los lados");
		l=lec.nextDouble();}while(l<=0);
		Pb=l*n;
		angulo=360/(2*n);
		ap=l/(2*Math.tan(angulo));
		AP=Math.pow(h,2)+Math.pow(ap,2);
		Al=(Pb*AP)/2;
		Abase=Math.pow(l, 2);
		At=Al+Abase;
		Volumen=(Abase*h)/3;
		
		System.out.println("Datos del prisma");
		System.out.println("1.Altura:"+h);
		System.out.println("2.Longitud de lados:"+l);
		System.out.println("3.Numero de lados:"+n);
		System.out.println("4.Perimetro de la base:"+Pb);
		System.out.println("5.Apotema:"+ap);
		System.out.println("6.Apotema base:"+AP);
		System.out.println("7.Area lateral:"+Al);
		System.out.println("8.Area tota:"+At);
		System.out.println("9.Volumen:"+Volumen);
		
	}
}
