

public class ArrayExamples {

  // Changes the input array to be in reversed order
  //fixed
  static void reverseInPlace(int[] arr) {
    int[] h = new int[arr.length];
    for (int i = 0; i < arr.length; i++){
      h[i] = arr[i];
    }
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = h[arr.length -  1 - i];
    }
  }
  // Returns a *new* array with all the elements of the input array in reversed order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for (int i = 0; i < arr.length; i++){
        newArray[i] = arr[i];
    }
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = newArray[arr.length - i - 1];
    }
    return arr;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    if(arr.length < 2) { 
      return 0.0;
    }
    double lowest = arr[0], sum = 0.0;
    for(double num: arr) {
      if(num < lowest) {
         lowest = num;
        }
        // grabs the lowest number
    }
    for(double num: arr) {
      if(num != lowest) {
           sum += num; // if it is not the lowesst, keep adding it to sum
      }
    }
    return (sum / (arr.length - 1) ) ;
  }
}