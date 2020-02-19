import java.util.Random;

public class EmbaralhadorAleatorio implements Embaralhador {

	private char[] letras;

	@Override
	public String embaralhar(String palavra) {

		letras = palavra.toCharArray();

		Random aleatorio = new Random();

		char auxiliar;
		int primeiroindice, segundoindice;

		for (int i = 0; i < letras.length; i++) {
			primeiroindice = aleatorio.nextInt(letras.length);
			segundoindice = aleatorio.nextInt(letras.length);

			auxiliar = letras[primeiroindice];
			letras[primeiroindice] = letras[segundoindice];
			letras[segundoindice] = auxiliar;

		}
		return String.valueOf(letras);
	}

}
