package binary_search;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testOfBinarySearch {

	@Test
	void testNormal() {
		assertEquals(1, BinarySearch.binarySearch(new int[] {1,2,3,4,5}, 2));
	}
	
	@Test
	void testFront() {
		assertEquals(0, BinarySearch.binarySearch(new int[] {1,2,3,4,5}, 1));
		
	}
	
	@Test
	void testNotFound() {
		assertEquals(-1, BinarySearch.binarySearch(new int[] {1,2,3,4,5}, 10));
	}
	
	@Test 
	void testEnd() {
		assertEquals(4, BinarySearch.binarySearch(new int[] {1,2,3,4,5}, 5));
	}
	
	@Test
	void testEmpty() {
		assertEquals(-1, BinarySearch.binarySearch(new int[] {}, 0));
	}
	
	@Test 
	void testLengthOne() {
		assertEquals(0, BinarySearch.binarySearch(new int[] {1}, 1));
	}
	
	@Test
	void testLengthTwo() {
		assertEquals(1, BinarySearch.binarySearch(new int[] {1, 3}, 3));
		assertEquals(0, BinarySearch.binarySearch(new int[] {1, 3}, 1));
	}
	
}
