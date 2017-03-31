package aula;

import static org.junit.Assert.*;
import org.junit.*;
import java.lang.reflect.*;

public class ListaTest {
	private Lista l;

	@Before
	public void init() {
		l = new Lista();

	}
	@Test
	public void getMostRightTest1() {
		try {
			l.add(15);
			Method mostRight = Lista.class.getDeclaredMethod("getMostRight");
			mostRight.setAccessible(true);
			No n = (No) mostRight.invoke(l);
			assertEquals(15, n.valor);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessError | IllegalArgumentException
				| InvocationTargetException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	@Test
	public void getMostRightTest2() {
		try {
			l.add(15);
			l.add(-15);
			Method mostRight = Lista.class.getDeclaredMethod("getMostRight");
			mostRight.setAccessible(true);
			No n = (No) mostRight.invoke(l);
			assertEquals(15, n.valor);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessError | IllegalArgumentException
				| InvocationTargetException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}
	@Test
	public void getMostLeftTest1() {
		try {
			l.add(15);
			Method mostLeft = Lista.class.getDeclaredMethod("getMostLeft");
			mostLeft.setAccessible(true);
			No n = (No) mostLeft.invoke(l);
			assertEquals(15, n.valor);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessError | IllegalArgumentException
				| InvocationTargetException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			fail(e.getMessage());

		}
	}

	@Test
	public void getMostLeftTest2() {
		try {
			l.add(15);
			l.add(-15);
			Method mostLeft = Lista.class.getDeclaredMethod("getMostLeft");
			mostLeft.setAccessible(true);
			No n = (No) mostLeft.invoke(l);
			assertEquals(-15, n.valor);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessError | IllegalArgumentException
				| InvocationTargetException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			fail(e.getMessage());

		}
	}
}