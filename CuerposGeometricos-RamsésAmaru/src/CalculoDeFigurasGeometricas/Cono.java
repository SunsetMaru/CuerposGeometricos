package CalculoDeFigurasGeometricas;
import java.util.Scanner;
public class Cono {
	public static void main(String[] args) {
		Scanner lec=new Scanner(System.in);
		int r;
		double areaTotal, Volumen, h, areaLateral, a, g;
		do{
		System.out.println("Digite el radio");
		r=lec.nextInt();}while(r<=0);
		do{
		System.out.println("Digite la altura");
		h=lec.nextDouble();}while(h<=0);
		g= Math.sqrt(Math.pow(h,2)+Math.pow(r,2));
		a=Math.PI*r;
		areaLateral= a*g;
		areaTotal= a*(g+r);
		Volumen = Math.PI*(Math.pow(r,2))*h/3;
		System.out.println("1.Datos del Cono:");
		System.out.println("2.Radio: "+r);
		System.out.println("3.Altura: "+h);
		System.out.println("4.Generatriz: "+g);
		System.out.println("5.Area Lateral: "+areaLateral);
		System.out.println("6.Area Total: "+areaTotal);
		System.out.println("7.Volumen: "+Volumen);
        lec.close();
	}
}
