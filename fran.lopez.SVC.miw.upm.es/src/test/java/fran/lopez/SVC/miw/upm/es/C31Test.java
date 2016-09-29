package fran.lopez.SVC.miw.upm.es;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C31Test {
	private C31 objectFromC31Class;

	@Before
    public void before() {
        this.objectFromC31Class = new C31();
    }

	@Test
	public void testM1() {
		assertEquals("m1", this.objectFromC31Class.m1());
	}

	@Test
	public void testM2() {
		assertEquals("m2", this.objectFromC31Class.m2());
	}
	
	@Test
	public void testMB() {
		assertEquals("mB", this.objectFromC31Class.mB());
	}

}
