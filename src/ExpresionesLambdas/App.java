package ExpresionesLambdas;


import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		
		 List<String> listaPalabras = List.of("Perro", "Abeja", "Mariposa", "Lince", "Pez");
	        
		 List<String> palabrasConO = listaPalabras.stream()
	                .filter(evaluaO -> evaluaO.contains("o"))
	                .collect(Collectors.toList());
	                
	        System.out.println(palabrasConO);
	    }


}
