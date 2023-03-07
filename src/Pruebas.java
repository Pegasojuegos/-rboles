import static org.junit.jupiter.api.Assertions.assertEquals;

public class Pruebas {

	public static void main(String[] args) {
			Arbol<Integer> a1=new Arbol<Integer>(5, null, null);
			a1.add(5);a1.add(9);a1.add(3);a1.add(7);a1.add(11);a1.add(6);a1.add(8);a1.add(10);a1.add(12);
			System.out.println(a1.toStringArbol());
		
	}

}
