package fran.lopez.SVC.miw.upm.es;
/**
 * 
 */
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author franlopez
 *
 */
public class C21Test {
	private C21 objectFromC21Class;
	
	@Before
    public void before() {
		this.objectFromC21Class = new C21();
    }

	/**
	 * Test method for {@link fran.lopez.SVC.miw.upm.es.C21#m1()}.
	 */
	@Test
	public void testM1() {
		assertEquals("m1", this.objectFromC21Class.m1());
	}

	/**
	 * Test method for {@link fran.lopez.SVC.miw.upm.es.C21#m2()}.
	 */
	@Test
	public void testM2() {
		assertEquals("m2", this.objectFromC21Class.m2());
	}
	
	/**
	 * Test method for {@link fran.lopez.SVC.miw.upm.es.C21#m2()}.
	 */
	@Test
	public void testM3() {
		assertEquals("m3", this.objectFromC21Class.m3());
	}

}
