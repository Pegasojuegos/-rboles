import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArbolTest {

	@Test
	void testToString() {
		Arbol<Integer> a1=new Arbol<Integer>(5, null, null);
		a1.add(5);a1.add(9);a1.add(3);a1.add(7);a1.add(11);a1.add(6);a1.add(8);a1.add(10);a1.add(12);
		String esp="3,5,6,7,8,9,10,11,12";
		assertEquals(esp, a1.toString());
	}
	@Test
	void testBorrar() {
		Arbol<Integer> a1=new Arbol<Integer>(5, null, null);
		a1.add(5);a1.add(9);a1.add(3);a1.add(7);a1.add(11);a1.add(6);a1.add(8);a1.add(10);a1.add(12);
		a1.del(9);
		String esp="3,5,6,7,8,10,11,12";
		assertEquals(esp, a1.toString());
	}
	@Test
	void testDepth() {
		Arbol<Integer> a1=new Arbol<Integer>(5, null, null);
		a1.add(5);a1.add(9);a1.add(3);a1.add(7);a1.add(11);a1.add(6);a1.add(8);a1.add(10);a1.add(12);
		int esp=4;
		assertEquals(esp, a1.depth(),0);
	}
}
