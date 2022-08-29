
public class Solution {
	    public static int solution(String R) {
	        // A para asfalto - 20 min pie - 5 patinete 
	    	// S para arena - 30 min pie - 40 patinete
	    	// SAASssssssss
	    	// en cualquier momento puedes bajarte de la scooter y 
	    	// seguir a pie el resto del viaje. ¿Cuál es el tiempo 
	    	// más corto en el que puede llegar al trabajo?
	    	
	    	//pasar a array de caracteres
	    	char[] caracteres = R.toCharArray();
	    	
	    	int contador = 0;
	    	int tiempo = 0;
	    	int tiempoContado = 0;
	    	
	    		
	    		//recorrer el array y parar en cada momento
	    	while (contador < caracteres.length) {
	    		tiempoContado=0;
	    		for (int i = 0; i < caracteres.length; i++) {
	    	
				if(caracteres[i] == 'A') {
					//si el contador es menor a i contar pie
					if(contador >= i ) {
						tiempoContado = tiempoContado + 5;
					} else {
						tiempoContado = tiempoContado + 20;
					}
					
				} else if (caracteres[i] == 'S') {
					if(contador >= i) {
						tiempoContado = tiempoContado + 40;
					} else {
						tiempoContado = tiempoContado + 30;
					}
				}
				}
	    
			//si es menor, pero mayor que 0, substutuir.	
	    	if(tiempoContado < tiempo || tiempo == 0) {
	    		tiempo = tiempoContado;
	    	}
	    	contador++;
	    }
		    
		    //control de errores (todo el tiempo con y sin el scooter
	    	tiempoContado=0;
			for (int i = 0; i < caracteres.length; i++) {
    	    	
				if(caracteres[i] == 'A') {
						tiempoContado = tiempoContado + 20;	
				} else if (caracteres[i] == 'S') {
						tiempoContado = tiempoContado + 30;
				}
				}
			if(tiempoContado < tiempo || tiempo == 0) {
	    		tiempo = tiempoContado;
	    	}
			
	    	tiempoContado=0;
			for (int i = 0; i < caracteres.length; i++) {
    	    	
				if(caracteres[i] == 'A') {
						tiempoContado = tiempoContado + 5;	
				} else if (caracteres[i] == 'S') {
						tiempoContado = tiempoContado + 40;
				}
				}
			if(tiempoContado < tiempo || tiempo == 0) {
	    		tiempo = tiempoContado;
	    	}
			
	    	
	    	return tiempo;
	    }
	
	public static void main(String[] args) {

		System.out.println(solution("ASAASS"));
		System.out.println(solution("SSA"));
		System.out.println(solution("SSSSAAA"));
	}
}
