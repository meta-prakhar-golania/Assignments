import static org.junit.Assert.*;
import org.junit.Test;

public class LcmTest {

	LcmHcf LcmHcfObj = new LcmHcf();

	@Test
	public void expression() {
		int result = LcmHcfObj.lcm(5,7);
		assertEquals(35,result);
	}
	
	@Test
	public void expression1() {
		int result = LcmHcfObj.lcm(10,15);
		assertEquals(30,result);
	}

	@Test
	public void expression2() {
		int result = LcmHcfObj.lcm(25,30);
		assertEquals(150,result);
	}
	
	@Test
	public void expression3() {
		int result = LcmHcfObj.lcm(75,30);
		assertEquals(150,result);
	}
	
	
	@Test
	public void expression4() {
		int result = LcmHcfObj.hcf(5,7);
		assertEquals(1,result);
	}
	
	@Test
	public void expression5() {
		int result = LcmHcfObj.hcf(10,15);
		assertEquals(5,result);
	}

	@Test
	public void expression6() {
		int result = LcmHcfObj.hcf(25,30);
		assertEquals(5,result);
	}
	
	@Test
	public void expression7() {
		int result = LcmHcfObj.hcf(75,30);
		assertEquals(15,result);
	}
	
}
