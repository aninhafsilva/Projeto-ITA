import java.util.ArrayList;
import java.util.Random;

public class FabricaMecanicaDoJogo {
	
	public MecanicaDoJogo getMecanicaJogo() {

		ArrayList<MecanicaDoJogo> listaMecanica = new ArrayList<MecanicaDoJogo>();
		
		listaMecanica.add( new Mecanica1());
		listaMecanica.add( new Mecanica2());
		
		Random aleatorio = new Random();
		
		return listaMecanica.get(aleatorio.nextInt(listaMecanica.size()));
		
	}
}
