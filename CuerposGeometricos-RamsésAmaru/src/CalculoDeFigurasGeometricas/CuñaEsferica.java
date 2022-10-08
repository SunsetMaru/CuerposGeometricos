package CalculoDeFigurasGeometricas;
import java.util.Scanner;
public class CuñaEsferica {
	public static void main(String[] args) {
		Scanner lec=new Scanner(System.in);
		double Volumen, r, n;
		do{
		System.out.println("Digite el radio");
		r=lec.nextDouble();}while(r<=0);
		do{
		System.out.println("Digite los grados");
		n=lec.nextDouble();}while(n<=0);
		Volumen = (Math.PI*Math.pow(r,3)*n)/270;
		System.out.println("1.Datos de la Esfera:");
		System.out.println("2.Radio: "+r);
		System.out.println("3.Grados: "+n);
		System.out.println("4.Volumen: "+Volumen);
		lec.close();
	}
}
