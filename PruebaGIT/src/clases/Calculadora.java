package clases;

/**
 *  Esta es una clase de utilidades, que consta en efectuar operaciones de sumar, 
 *  restar, dividir y multiplicar.
 *  @author Andrei Flaviu Marc
 *  @version 1.0 10/02/2017
 */

public class Calculadora {
	/**
	 * Se encarga de la suma
	 * @param x primer sumando
	 * @param y segundo sumando
	 * @return x+y
	 */
	public static float suma(float x,float y){
		return (x+y);
	}
	/**
	 * Se encarga de la resta
	 * @param x primer factor
	 * @param y segundo factor
	 * @return x-y
	 */
	public static float resta(float x, float y){
		return (x-y);
	}
	
	/**
	 * Se encarga de la multiplicacion
	 * @param x primer factor
	 * @param y segundo factor
	 * @return x*y
	 */
	public static float multiplicar(float x, float y){
		return (x*y);
	}
	
	/**
	 * Se encarga de la division
	 * @param x dividendo
	 * @param y	divisor
	 * @return cociente
	 */
	public static float dividir(float x, float y){
		return (x/y);
	}

	
	
	
	
	
	
}
