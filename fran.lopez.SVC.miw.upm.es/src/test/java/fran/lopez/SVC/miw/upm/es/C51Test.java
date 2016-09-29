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
public class C51Test {
	private C51 objectFromC51Class;
	
	@Before
    public void before() {
        this.objectFromC51Class = new C51();
    }

	/**
	 * Test method for {@link fran.lopez.SVC.miw.upm.es.C51#m1()}.
	 */
	@Test
	public void testM1() {
		assertEquals("m1", this.objectFromC51Class.m1());
	}

	/**
	 * Test method for {@link fran.lopez.SVC.miw.upm.es.C51#m2()}.
	 */
	@Test
	public void testM2() {
		assertEquals("m2", this.objectFromC51Class.m2());
	}

}
