



import static org.junit.Assert.*;

import org.junit.Test;

public class TestNivelActual {

	@Test
	public void nivelLlenado() {
	DepositoCombustible miDeposito = new DepositoCombustible(50,20);
	assertEquals(20,miDeposito.getDepositoNivel(),0);
	}

}
