package fran.lopez.SVC.miw.upm.es;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C22Test {
private C22 objectFromC22Class;
	
	@Before
    public void before() {
		this.objectFromC22Class = new C22();
    }

	/**
	 * Test method for {@link fran.lopez.SVC.miw.upm.es.C22#mA()}.
	 */
	@Test
	public void testMA() {
		assertEquals("mA", this.objectFromC22Class.mA());
	}

}
