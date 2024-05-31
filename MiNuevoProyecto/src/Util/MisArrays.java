package Util;

import java.util.Arrays;

public abstract class MisArrays {
	
	/**
	 * Calcula la supuesta media de los numeros entre 0 y 10
	 * @return la media de la array
	 * @throws IllegalArgumentException si los numeros no estan entre 0 y 10
	 */
		public static float mediaNotas(int[] array) {

			for(int i=0; i<array.length; i++) {
				if(array[i]<0 || array[i]>10) {
					throw new IllegalArgumentException("Debe ser los numeros entre 0 y 10");
					
				}
			}
			int suma =0;
			for(int i = 0; i < array.length; i++) {
				suma += array[i];
			}
			return (float) suma / array.length;
		}
		
		/**
		 * Calcula mediana del array de numeros
		 * 
		 * param num entre 0 y 10
		 * @return La mediana del array
		 * @throws IllegalArgumentException si el array no esta entre 0 y 10
		 */
		public static float medianaNotas(int[] array) {
		for(int i=0; i<array.length; i++) {
			if(array[i]<0 || array[i]>10) {
				throw new IllegalArgumentException("Debe ser los numeros entre 0 y 10");
			}
			}
		Arrays.sort(array);
		int medio = array.length/2;
		if( array.length % 2 ==0) {
					return (float) (array[array.length/2-1]+array[array.length/2])/2;

			
		}
		else {
			return array[array.length/2];
		}
		}
		/**
		 * Mira cual es el maximo valor de un array
		 * @param array el array de numeros
		 * @return el valor maximo
		 * @throws IllegalArgumentException  si el numero no esta entre 0 y 1'
		 */
	    public static int maximaNota(int[] array) {
	    	for(int i=0; i<array.length; i++) {
	    		if(array[i]<0 || array[i]>10) {
	    			throw new IllegalArgumentException("Debe ser los numeros entre 0 y 10");
	    		}
	    		}
	        if (array.length == 0) {
	            throw new IllegalArgumentException("El array no tiene valores");
	        }

	        int max = array[0];
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] > max) {
	                max = array[i];
	            }
	        }
	        return max;
	    }
	    
	    /**
	     * Enseña la minima nota de los numeros array
	     * @param array de numeros
	     * @return el valor minimo de los numeros array
		 * @throws IllegalArgumentException  si el numero no esta entre 0 y 1'
	     */
	    public static int minimaNota(int[] array) {
	        for (int num : array) {
	            if (num < 0 || num > 10) {
	                throw new IllegalArgumentException("Debe ser los numeros entre 0 y 10");
	            }
	        }

	        if (array.length == 0) {
	            throw new IllegalArgumentException("El array no tiene numeros");
	        }

	        int min = array[0];
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] < min) {
	                min = array[i];
	            }
	        }
	        return min;
	    }
	}
