package aula;

import static org.junit.Assert.*;

import org.junit.*;

public class SenaTest {
	private String s;
	private String[] sl;
	
	@Test(expected = AssertionError.class)
	public void testConstructorLesser() {
		try {
			new Sena(5);
		}catch(Exception e) {
			fail(e.getMessage());
		}
	}
	@Test
	public void testConstructorNormal() {
		try {
			new Sena(6);
		}catch(Exception e) {
			fail(e.getMessage());
		}
	}
	@Test
	public void testConstructorNormal2() {
		try {
			new Sena(11);
		}catch(Exception e) {
			fail(e.getMessage());
		}
	}
	@Test
	public void testConstructorNormal3() {
		try {
			new Sena(12);
		}catch(Exception e) {
			fail(e.getMessage());
		}
	}
	@Test(expected = AssertionError.class)
	public void testConstructorGreater() {
		try {
			new Sena(13);
		}catch(Exception e) {
			fail(e.getMessage());
		}
	}
	@Before
	public void set() {
		try {
		this.s = new Sena(12).toString();
		this.sl = s.split(";");
		}catch(Exception e){
			fail(e.getMessage());
			}
	}
	@Test
	public void testNumHigher(){
		for(String element: sl) {
			assertTrue("NUMERO MAIOR QUE 60 OU MENOR DO QUE 1"+element,Integer.parseInt(element)>=1 && Integer.parseInt(element)<=60);
		}
	}
	@Test
	public void numOrdering() {
		for(int i = 0;i < sl.length-1;i++) {
			if(Integer.parseInt(sl[i])>Integer.parseInt(sl[i+1])) {
				fail("NÚMEROS NÃO ORDENADOS");
			}
		}
	}
	@Test
	public void numEqual() {
		for(int i=0;i<sl.length-1;i++) {
			if(Integer.parseInt(sl[i])== Integer.parseInt(sl[i+1])) {
				fail("Dois Números Iguais: "+sl[i]+" "+sl[i+1]);
			}
		}
	}
}
