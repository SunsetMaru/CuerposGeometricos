package CalculoDeFigurasGeometricas;
import java.util.*;
public class TroncoCono {

	public static void main(String[] args) {
		Scanner lec=new Scanner(System.in);
		double Volumen, r, R, h, g, Al, At, Ab, AB, B, b;
		do{
		System.out.println("Digite el radio menor");
		r=lec.nextDouble();}while(r<=0);
		do{
		System.out.println("Digite el radio mayor");
		R=lec.nextDouble();}while(R<=0);
		do{
		System.out.println("Digite la altura");
		h=lec.nextDouble();}while(h<=0);
		do{
		System.out.println("Digite la base mayor");
		B=lec.nextDouble();}while(B<=0);
		do{
	    System.out.println("Digite la base menor");
		b=lec.nextDouble();}while(b<=0);
		AB=Math.PI*Math.pow(B,2);
		Ab=Math.PI*Math.pow(b,2);
		g= Math.sqrt(Math.pow(h,2)+Math.pow(r,2));
		Al=(Math.PI*g)*(R+r);
		At=Al+Ab+AB;
		Volumen=Math.PI*h*(Math.pow(R, 2)+Math.pow(r, 2)+R+r)*1/3;
		System.out.println("1.Datos del Tronco del Cono:");
		System.out.println("2.Radio menor: "+r);
		System.out.println("3.Radio mayor: "+R);
		System.out.println("4.Altura: "+h);
		System.out.println("5.Base mayor: "+B);
		System.out.println("6.Base menor: "+b);
		System.out.println("7.Area de la base menor: "+String.format("%.2f", Ab));
		System.out.println("8.Area de la base mayor: "+String.format("%.2f", AB));
		System.out.println("9.Area Lateral: "+Al);
		System.out.println("10.Area Total: "+At);
		System.out.println("11.Volumen: "+Volumen);
		lec.close();
	}
}
