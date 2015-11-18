package demo.cobertura;

import org.junit.Test;

public class AppTest {
	private App app = new App();
	
	@Test
	public void testIf(){
		app.runIf(true);
		app.runIf(false);
	}
	
	@Test
	public void testWhileLoop(){
		app.runWhileLoop(1);
	}
	
	@Test
	public void testForLoop(){
		app.runForLoop(1);
	}
	
	@Test
	public void testReturnBoolean(){
		app.runReturnBoolean(3);
		app.runReturnBoolean(6);
	}
	
	@Test
	public void testException(){
		app.runException();
	}
}
