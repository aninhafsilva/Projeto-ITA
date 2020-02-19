import java.util.ArrayList;
import java.util.Random;

public class FabricaEmbaralhadores {

	private ArrayList<Embaralhador> listaEmbaralhador = new ArrayList<Embaralhador>();
	
	public FabricaEmbaralhadores() {
			
		listaEmbaralhador.add( new EmbaralhadorOrdenado());
		listaEmbaralhador.add(new EmbaralhadorAleatorio());
		
	}
	
	public Embaralhador getEmbaralhador() {

		Random aleatorio = new Random();
		
		return listaEmbaralhador.get(aleatorio.nextInt(listaEmbaralhador.size()));
		
	}
}
