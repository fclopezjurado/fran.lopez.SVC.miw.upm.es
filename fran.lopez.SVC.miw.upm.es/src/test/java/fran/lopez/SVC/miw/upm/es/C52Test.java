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
public class C52Test {
	private C52 objectFromC52Class;
	
	@Before
    public void before() {
        this.objectFromC52Class = new C52();
    }

	/**
	 * Test method for {@link fran.lopez.SVC.miw.upm.es.C52#mA()}.
	 */
	@Test
	public void testMA() {
		assertEquals("mA", this.objectFromC52Class.mA());
	}

}
