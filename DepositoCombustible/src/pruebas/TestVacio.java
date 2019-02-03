package pruebas;




import static org.junit.Assert.*;

import org.junit.Test;

import principal.DepositoCombustible;

public class TestVacio {

	@Test
	public void controlVacio() {
		DepositoCombustible miDeposito = new DepositoCombustible(50,0);
		assertTrue(miDeposito.estaVacio());
		}

}
