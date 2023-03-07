import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArbolTest {

	@Test
	void testToString() {
		Arbol<Integer> a1=new Arbol<Integer>(5, null, null);
		a1.add(3);a1.add(8);a1.add(9);a1.add(1);
		String esp="1,3,5,8,9";
		assertEquals(esp, a1.toString());
	}

}
