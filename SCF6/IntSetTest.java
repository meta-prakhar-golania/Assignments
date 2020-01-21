import static org.junit.Assert.*;

import org.junit.Test;

public class IntSetTest {
	IntSet intSetObj = new IntSet(new int[]{1,2,3,4,8,6,5,9,11});

	@Test
	public void whenIntegerPassed() {
		assertEquals(true, intSetObj.isMember(5));
	}
	
	@Test
	public void whenIntegerPassed1() {
		assertEquals(false, intSetObj.isMember(15));
	}
	
	@Test
	public void sizeOfArrayOfObject() {
		assertEquals(9, intSetObj.arraySize());
	}

	@Test
	public void whenObjectPassed() {
		assertEquals(true, intSetObj.isSubset(new IntSet(new int[]{1,2,3})) );
	}

	@Test
	public void whenObjectPassed1() {
		assertEquals(false, intSetObj.isSubset(new IntSet(new int[]{1,12,3})) );
	}
	
	@Test
	public void whenTwoObjectPassed() {
		IntSet obj = intSetObj.union( new IntSet(new int[]{1,2,3}), new IntSet(new int[]{1,12,3}) );
		assertArrayEquals(new int[]{1,2,3,12}, obj.getset() );
	}
	
	@Test
	public void whenNullArrayIsPassed() {
	try {
		assertEquals("size of array is size is zero",1, new IntSet(new int[]{}));
	}
	catch (AssertionError e) {
		System.out.println("size of array is zero");
	}
	}
	
}
