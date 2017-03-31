package aula;

import static org.junit.Assert.*;

import org.junit.*;

public class CadastroTest {
	private Cadastro c;

	@Before
	public void init() {
		try {
			c = new Cadastro("Filmes.txt");
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testConstructor1() {
		try {
			new Cadastro("teste.txt");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test(expected = AssertionError.class)
	public void testConstructor2() {
		try {
			new Cadastro("");
		}catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test(expected = AssertionError.class)
	public void testConstructor3() {
		try {

			new Cadastro(null);

		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testInsertFIles1() {
		try {
			assertTrue(c.insert(1, "De volta para o futuro"));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testInsertFIles0() {
		try {
			assertFalse(c.insert(0, "missao impossivel"));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testInsertFIles2() {
		try {
			assertFalse(c.insert(2, null));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testInsertFIles3() {
		try {
			assertFalse(c.insert(3, ""));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
}
