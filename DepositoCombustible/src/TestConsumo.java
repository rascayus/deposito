



import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(value = Parameterized.class)

public class TestConsumo {
	@Parameters 
	public static Iterable<Object[]> cantidades() {
		    return Arrays.asList(new Object[][] {
		    	{0,30}, {-40,70}, {70,-40}, {25,5}
		    });
		  }
	 	private double esperado, consumo;
	 	
		public TestConsumo(double esperado,double consumo) {
			  this.esperado = esperado;
			  this.consumo= consumo;
		}
	 	 	 
	@Test
	public void testConsumo() {
		DepositoCombustible miDeposito = new DepositoCombustible(100,30);
		miDeposito.consumir(consumo);
		assertEquals(esperado,miDeposito.getDepositoNivel(),0);
	}
}

