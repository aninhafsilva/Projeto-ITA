import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int continuar = 1;

		FabricaMecanicaDoJogo fabrica = new FabricaMecanicaDoJogo();

		MecanicaDoJogo mj;
		Scanner scan = new Scanner(System.in);

		System.out.println("Jogo das palavras");
		System.out.println(" As palavras estão embaralhadas escreva de forma correta: \n");

		do {
			mj = fabrica.getMecanicaJogo();
			System.out.println(mj.getRegras());
			do {
				System.out.println("Palavra: " + mj.getPalavra());

				if (mj.verificaPalavra(scan.next())) {
					System.out.println("Acertou.");
				} else {
					System.out.println("Errou.");
				}

			} while (!mj.JogoTerminou());
			System.out.println(mj.Resultado());
			System.out.println("Deseja jogar novamente? \nDigite 1(Sim) 0(Não)");
			continuar = scan.nextInt();
		} while (continuar != 0);
	}
}
