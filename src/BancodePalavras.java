import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class BancodePalavras {

	private ArrayList<String> palavras = new ArrayList<String>();

	public BancodePalavras() {
		try {
			FileReader arq = new FileReader("D:\\listadepalavras.txt");
			BufferedReader lerArq = new BufferedReader(arq);

			String linha = lerArq.readLine();

			while (linha != null) {
				linha = lerArq.readLine();
				if(linha != null) {
					palavras.add(linha.trim());
				}
			}

			arq.close();
		} catch (IOException e) {
			e.getMessage();
		}
	}

	public String lista_de_paravras() {

		Random aleatorio = new Random();

		int n = aleatorio.nextInt(palavras.size());
		return palavras.get(n);

	}

}
