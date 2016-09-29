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
public class C12Test {
	private C12 objectFromC12Class;
	
	@Before
    public void before() {
    	this.objectFromC12Class = new C12();
    }

	/**
	 * Test method for {@link fran.lopez.SVC.miw.upm.es.C12#mA()}.
	 */
	@Test
	public void testMA() {
		assertEquals("mA", this.objectFromC12Class.mA());
	}

}
