package Array;
import java.util.Arrays;
public class Ejercicio17 {

	/**
	 Construir un programa que genere una serie de nœmeros enteros, 
	 los almacene en un array, e indique en pantalla si dicho array es capicœa, 
	 es decir, si la secuencia de sus elementos es igual vista de delante hacia atr‡s 
	 y de detr‡s hacia delante.
	 */
	public static void main(String[] args) {
		
		int[] listaNumeros=new int[10];
		int x;
		boolean capicua=true;
	
		for(int i=0; i<listaNumeros.length;i++){
			x  = (int) (100*Math.random()+1);
			listaNumeros[i]=x;
		}
		int i=0;
		int k;
		while(capicua && i<listaNumeros.length/2){
			k=listaNumeros.length-1-i;
			if(listaNumeros[i]!=listaNumeros[k]){
				capicua=false;
			}
			i++;
		}

		System.out.println("La lista de arrays es "+Arrays.toString(listaNumeros));
		
		if(capicua){
			System.out.println("Es capicua");
		}else{
			System.out.println("NO es capicua");
		}
		
	}
}
