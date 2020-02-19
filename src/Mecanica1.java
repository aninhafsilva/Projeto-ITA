
public class Mecanica1 implements MecanicaDoJogo {

	// o jogador poder� responder at� 10 palavras
	// o jogador poder� errar at� 5 vezes, a cada erro existe o desconto de 1 ponto
	// cada acerto valer� 1 pontos,

	BancodePalavras bancodepalavras = new BancodePalavras();

	int qtderros;
	int pontuacao;
	int qtdpalavras;
	String palavraOriginal;

	public Mecanica1() {
		qtderros = 0;
		pontuacao = 0;
		qtdpalavras = 0 ;
		palavraOriginal = "";
	}
	
	public boolean JogoTerminou() {

		if (qtdpalavras > 9 || qtderros == 5) {
			return true;
		} else {
			return false;
		}
	}

	public String Resultado() {
		String condicao;
		if (qtderros == 5) {
			condicao = "Voc� perdeu!";
		} else {
			condicao = "Voc� ganhou!";
		}

		return "Pontua��o: " + pontuacao + "\n" + condicao;
	}

	

	public String getPalavra() {

		palavraOriginal = bancodepalavras.lista_de_paravras();
		Embaralhador e = new FabricaEmbaralhadores().getEmbaralhador();
		return e.embaralhar(palavraOriginal);
	}

	public boolean verificaPalavra(String palavra) {
		qtdpalavras+=1;
		if (palavraOriginal.equals(palavra.trim())) {
			pontuacao+=1;
			return true;
		} else {
			qtderros+=1;
			pontuacao-=1;
			return false;
		}
	}

	@Override
	public String getRegras() {
	
		return " Regras: O jogo cont�m 10 palavras embaralhadas e o jogador poder� ter at� 5 erros. \n Bom jogo!";
	}
}
