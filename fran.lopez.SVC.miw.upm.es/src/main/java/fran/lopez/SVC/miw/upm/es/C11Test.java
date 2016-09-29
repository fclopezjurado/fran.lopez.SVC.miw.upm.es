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
public class C11Test {
	private C11 objectFromC11Class;

    @Before
    public void before() {
    	this.objectFromC11Class = new C11();
    }

	/**
	 * Test method for {@link fran.lopez.SVC.miw.upm.es.C11#m1()}.
	 */
	@Test
	public void testM1() {
		assertEquals("m1", this.objectFromC11Class.m1());
	}

	/**
	 * Test method for {@link fran.lopez.SVC.miw.upm.es.C11#m2()}.
	 */
	@Test
	public void testM2() {
		assertEquals("m2", this.objectFromC11Class.m2());
	}

}
