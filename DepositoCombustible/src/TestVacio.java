


import static org.junit.Assert.*;

import org.junit.Test;

public class TestVacio {

	@Test
	public void controlVacio() {
		DepositoCombustible miDeposito = new DepositoCombustible(50,0);
		assertTrue(miDeposito.estaVacio());
		}

}
