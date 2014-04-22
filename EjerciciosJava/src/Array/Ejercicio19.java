package Array;
import java.util.Arrays;
public class Ejercicio19 {

	/**
	 Construir un programa que genere dos vectores de nœmeros enteros v1 y v2, 
	 y que construya un nuevo vector v que almacene la suma de ambos vectores. 
	 El nuevo vector se ha de ajustar al vector m‡s largo proporcionado por el 
	 usuario. Finalmente, mostrar el resultado por pantalla.
	 */
	public static void main(String[] args) {
		int[] listaNumeros1=new int[10];
		int[] listaNumeros2=new int[7];
		//int[] listaNumeros=new int[Math.max(listaNumeros1.length,listaNumeros2.length)];
		int[] listaNumeros;
		int x;
		
		for(int i=0; i<listaNumeros1.length;i++){
			x  = (int) (100*Math.random()+1);
			listaNumeros1[i]=x;
		}
		for(int i=0; i<listaNumeros2.length;i++){
			x  = (int) (100*Math.random()+1);
			listaNumeros2[i]=x;
		}
		
		if(listaNumeros1.length<listaNumeros2.length){
			listaNumeros=listaNumeros2;
			for(int i=0; i<listaNumeros1.length; i++){
				listaNumeros[i]=listaNumeros[i]+listaNumeros1[i];
			}
			
		}else{
			listaNumeros=listaNumeros1;
			for(int i=0; i<listaNumeros2.length; i++){
				listaNumeros[i]=listaNumeros[i]+listaNumeros2[i];
			}
			
		}
		
		System.out.println("array 1 "+Arrays.toString(listaNumeros1));
		System.out.println("array 2 "+Arrays.toString(listaNumeros2));
		System.out.println("sumados "+Arrays.toString(listaNumeros));
		
	}

}
