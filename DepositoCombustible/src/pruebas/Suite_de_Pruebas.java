package pruebas;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestConsumo.class, TestLlenado.class, TestMitad.class, TestNivelActual.class, TestVacio.class,
		TestValorLimite.class })
public class Suite_de_Pruebas {

}
