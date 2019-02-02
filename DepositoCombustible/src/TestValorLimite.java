


import static org.junit.Assert.*;

import org.junit.Test;

public class TestValorLimite {

	@Test
	public void nivelMaximo() {
			DepositoCombustible miDeposito = new DepositoCombustible(50,20);
			assertEquals(50,miDeposito.getDepositoMax(),0);
	}

}
