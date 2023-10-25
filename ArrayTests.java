import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test 
	public void avgLowest() {
    double[] input1 = { 3.0,4.0,5.0 };
    double s = ArrayExamples.averageWithoutLowest(input1);
    assertArrayEquals(new double[]{5.0,4.0,3.0}, new double[]{4.5});
	}

  @Test
  public void testReverseInPlace2_5() {
    int[] input1 = { 2, 3, 4, 5 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{5, 4, 3, 2}, input1);
  }

  @Test
  public void testReversed2_5() {
    int[] input1 = { 2,3,4,5};
    int[] inp2 = ArrayExamples.reversed(input1);
    assertArrayEquals(new int[]{5,4,3,2 }, inp2);
  }
}
