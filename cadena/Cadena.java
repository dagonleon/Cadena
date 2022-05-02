package org.cuatrovientos.ed;

public class Cadena {
	
		public int longitud(String cadena) {
			return cadena.length();
		}
		
		public int vocales(String cadena) {
			int vocales = 0;
			for (int i = 0; i < cadena.length(); i++) {
			    char letraActual = cadena.charAt(i);
			    if (vocales(letraActual)) {
			    	String clave = String.valueOf(letraActual);
			    	vocales++;
			    } 
			}
			return vocales;
		}
		
		public String invertir(String cadena) {
			String invertida = "";
			for (int i = cadena.length() - 1; i >= 0; i--) {
				invertida += cadena.charAt(i);
			}
			return invertida;
		}
		
		public int contarLetra(String cadena, char caracter) {
			 int posicion, contador = 0;
		        posicion = cadena.indexOf(caracter);
		        while (posicion != -1) { 
		            contador++;                                          
		            posicion = cadena.indexOf(caracter, posicion + 1);
		        }
		        return contador;
		}
		

	

}
