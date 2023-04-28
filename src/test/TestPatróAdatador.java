package test;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPatróAdatador {
	
	private IPersonatge escut;
	private IPersonatge Mag;
	private IPersonatge vengatiu;

	@BeforeEach
	public void setUp() throws Exception {
		Mag = new AdaptadorPersonatgeMag(new double[]{2,0.5});
		escut = new AdaptadorPersonatgeAmbEscut(new double[]{5,3});
		// vengatiu  ??
	}

	@Test
	public void testMagAtacaEscut() {
		System.out.println("El Mag ataca al personatge amb Escut");
		this.atac(escut,Mag);
		int vidaEsperada = 5-2+1;
		assertEquals(vidaEsperada, escut.getVida());
	}
	
	@Test
	public void testEscutAtacaMag() {
		System.out.println("El personatge amb Escut ataca al Mag");
		this.atac(Mag,escut);
		//int vidaEsperada = 5-3 o 5-3+1;
		assertTrue( Mag.getVida() == 2 || Mag.getVida() == 3);
	}
	
	@Test
	public void testEscutAtacaVengatiu() {
		//PENDENT IMPLEMENTAR
		fail();
	}
	
	@Test
	public void testEscutAtacaVengatiuTestRepresalia() {
		//PENDENT IMPLEMENTAR
		fail();
	}
	
	@Test
	public void testVengatiuAtacaEscut() {
		//PENDENT IMPLEMENTAR
		fail();
	}

	@Test
	public void testMagAtacaVengatiu() {
		//PENDENT IMPLEMENTAR
		fail();
	}
	
	@Test
	public void testMagAtacaVengatiuTestRepresalia() {
		//PENDENT IMPLEMENTAR
		fail();
	}
	
	@Test
	public void testVengatiuAtacaMag() {
		//PENDENT IMPLEMENTAR
		fail();
	}
	
	private void atac( IPersonatge Victima, IPersonatge Atacant){
		Victima.somVictimaDUnAtac(Atacant);
		Victima.print();
		Atacant.print();
	}
}
