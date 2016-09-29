/**
 * 
 */
package fran.lopez.SVC.miw.upm.es;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author franlopez
 *
 */
public class C32Test {
	private C32 objectFromC32Class;
	
	@Before
    public void before() {
        this.objectFromC32Class = new C32();
    }

	/**
	 * Test method for {@link fran.lopez.SVC.miw.upm.es.C32#mA()}.
	 */
	@Test
	public void testMA() {
		assertEquals("mA", this.objectFromC32Class.mA());
	}

}
