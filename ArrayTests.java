import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace0() {
    int[] input1 = { 0 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{0}, input1);
	}
  	@Test 
	public void testReverseInPlace3_7() {
    int[] input1 = { 3,5,6,7 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{7,6,5, 3 }, input1);
	} // failure inducing as a JUnit tests
  
  // @Test 
	// public void avgLowest() {
  //   double[] input2 = {3.0,4.0,5.0};
  //   double[] s = {ArrayExamples.averageWithoutLowest(input2)};
  //  assertArrayEquals(new double[]{4.5}, s, 0.0001);
	// }

  // @Test
  // public void testReverseInPlace2_5() {
  //   int[] input1 = { 2, 3, 4, 5 };
  //   ArrayExamples.reverseInPlace(input1);
  //   assertArrayEquals(new int[]{5, 4, 3, 2}, input1);
  // }

  // @Test
  // public void testReversed2_5() {
  //   int[] input1 = { 2,3,4,5};
  //   int[] inp2 = ArrayExamples.reversed(input1);
  //   assertArrayEquals(new int[]{5,4,3,2 }, inp2);
  // }


}

