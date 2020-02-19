import java.util.ArrayList;
import java.util.Collections;

public class EmbaralhadorOrdenado implements Embaralhador{

	@Override
	public String embaralhar(String palavra) {
		
		ArrayList<String> letras = new ArrayList<String>();
		
		String novaPalavra = "";
		
		for(int i=0; i < palavra.length(); i++) {
			letras.add(String.valueOf(palavra.charAt(i)));
		}

		Collections.sort(letras);
		
		for(int i=0; i< letras.size(); i++) {
			novaPalavra+= letras.get(i);
		}
		return novaPalavra;
	}
	
}
