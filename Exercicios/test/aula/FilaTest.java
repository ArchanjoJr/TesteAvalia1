package aula;

import static org.junit.Assert.*;
import org.junit.*;

public class FilaTest {
	private Fila f;

	@Test(expected = AssertionError.class)
	public void testConstructorCelulaVoid() {
		try {
			new Celula("");
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testConstructorCelulaNormal() {
		try {
			new Celula("Ana");
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test(expected= AssertionError.class)
	public void testConstructorCelulaNull() {
		try {
			new Celula(null);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void addTestNormal() {
		try {
			f.add("Teste");

		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test(expected = AssertionError.class)
	public void addTestVoid() {
		try {
			f.add("");
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test(expected = AssertionError.class)
	public void addTestNull() {
		try {
			f.add(null);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void singleRemove() {
		try {
			f.add("teste");
			assertEquals("teste", f.remover());
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void RemoveNull() {
		try {

			assertEquals(null, f.remover());
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void RemoveMoreOne() {
		try {
			f.add("teste1");
			f.add("teste2");
			assertEquals("teste1", f.remover());
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void finalTestSimple() {
		try {
			f.add("teste");
			assertEquals("teste", f.getFinal());

		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test(expected = AssertionError.class)
	public void finalTestNull() {
		try {
			assertEquals("teste", f.getFinal());

		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test(expected = AssertionError.class)
	public void finalTestVoid() {
		try {
			f.add("");
			assertEquals("", f.getFinal());

		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void finalTestMoreOne() {
		try {
			f.add("teste");
			f.add("teste2");
			assertEquals("teste2", f.getFinal());

		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void getFinalTwo() {
		try {
			f.add("primeira");
			f.add("segunda");
			assertEquals("segunda", f.getFinal());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	public void getFinalOne() {
		try {
			f.add("teste");
			assertEquals("teste", f.getFinal());
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Before
	public void setInit() {
		f = new Fila();
	}
}
