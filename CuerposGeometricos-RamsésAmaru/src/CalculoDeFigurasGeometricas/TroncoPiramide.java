package CalculoDeFigurasGeometricas;

import java.util.Scanner;

public class TroncoPiramide {
	public static void main(String[] args) {
		Scanner lec=new Scanner(System.in);
		int h, n;
		double l1,l2, At, Pb, angulo, ap, Al, Abase, Volumen, AP, PB, ABase;
		do{System.out.println("Digite la altura");
		h=lec.nextInt();}while(h<=0);
		do{System.out.println("Digite el numero de lado");
		n=lec.nextInt();}while(n<=0);
		do{System.out.println("Digite la longitud de los lados inferior");
		l1=lec.nextDouble();}while(l1<=0);
		do{System.out.println("Digite la longitud de los lados superior");
		l2=lec.nextDouble();}while(l2<=0);
		
		Pb=l1*n;
		PB=l2*n;
		angulo=360/(2*n);
		ap=l1/(2*Math.tan(angulo));
		AP=Math.pow(h,2)+Math.pow(ap,2);
		Al=((Pb+PB)*AP)/2;
		Abase=Math.pow(l1, 2);
		ABase=Math.pow(l2, 2);
		At=Al+Abase+ABase;
		Volumen=h*(ABase+Abase+(Math.sqrt((ABase*Abase))))*1/3;
		
		System.out.println("Datos del prisma");
		System.out.println("1.Altura:"+h);
		System.out.println("2.Longitud de lado infeior:"+l1);
		System.out.println("3.Longitud de lado superior:"+l2);
		System.out.println("4.Area de la base superior:"+ABase);
		System.out.println("5.Area de la base inferior:"+Abase);
		System.out.println("6.Numero de lados:"+n);
		System.out.println("7.Perimetro de la base:"+Pb);
		System.out.println("8.Apotema:"+ap);
		System.out.println("9.Apotema base:"+AP);
		System.out.println("10.Area lateral:"+Al);
		System.out.println("11.Area tota:"+At);
		System.out.println("12.Volumen:"+Volumen);
		
	}
}
