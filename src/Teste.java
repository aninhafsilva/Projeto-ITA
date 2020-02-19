import static org.junit.Assert.*;

import org.junit.Test;

public class Teste {

	@Test
	public void TesteEmbaralhadorOrdenado() {
	
		EmbaralhadorOrdenado eo = new EmbaralhadorOrdenado();
		String palavranova = eo.embaralhar("casa");
		assertEquals("aacs", palavranova);
	}

}
