public class Mecanica2 implements MecanicaDoJogo{
	
	// O jogador perde quando errar uma vez 
	// Ao perder a pontua��o � apresentada
	
	BancodePalavras bancodepalavras = new BancodePalavras();

	int qtderros;
	int pontuacao;
	String palavraOriginal;

	public Mecanica2() {
		qtderros = 0;
		pontuacao = 0;
		palavraOriginal = "";
	}
	
	public boolean JogoTerminou() {

		if (qtderros == 1) {
			return true;
		} else {
			return false;
		}
	}

	public String Resultado() {
		return "Pontua��o: " + pontuacao + "\n";
	}

	

	public String getPalavra() {

		palavraOriginal = bancodepalavras.lista_de_paravras();
		Embaralhador e = new FabricaEmbaralhadores().getEmbaralhador();
		return e.embaralhar(palavraOriginal);
		
	}

	public boolean verificaPalavra(String palavra) {
		
		if (palavraOriginal.equals(palavra.trim())) {
			pontuacao+=1;
			return true;
		} else {
			qtderros+=1;
			return false;
		}
	}
	
	@Override
	public String getRegras() {
		return "Regras: O jogo apresenta palavras embaralhadas at� que o jogador erre.\n Bom jogo!";
	}
	
}
