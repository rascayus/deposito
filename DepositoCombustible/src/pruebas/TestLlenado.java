package pruebas;





import static org.junit.Assert.*;


import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import principal.DepositoCombustible;
@RunWith(value = Parameterized.class)

public class TestLlenado {
	@Parameters 
	public static Iterable<Object[]> cantidades() {
		    return Arrays.asList(new Object[][] {
		    	{32,2}, {100,70}, {-10,-40}, {110,80}
		    });
		  }
	 	private double esperado, cantidad;
	 	
		public TestLlenado(double esperado,double cantidad) {
			  this.esperado = esperado;
			  this.cantidad= cantidad;
		}
	 	 	 
	@Test
	public void testLlenado() {
		DepositoCombustible miDeposito = new DepositoCombustible(100,30);
		miDeposito.fill(cantidad);
		assertEquals(esperado,miDeposito.getDepositoNivel(),0);
	}
}
