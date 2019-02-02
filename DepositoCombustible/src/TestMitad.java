


import static org.junit.Assert.*;


import org.junit.Test;
	
public class TestMitad {

	@Test
	public void nivelMitad() {
		DepositoCombustible miDeposito = new DepositoCombustible(60,30);
		assertEquals((miDeposito.getDepositoMax()/2),miDeposito.getDepositoNivel(),0);
		}

}
