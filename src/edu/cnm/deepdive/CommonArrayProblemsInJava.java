package edu.cnm.deepdive;

public class CommonArrayProblemsInJava {

  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
    for (int i = 1; i < numbers.length; i++) {//typical problem where the loop starts on 1 instead
      //of on 0 and skips the first element.
      System.out.print(i + " - " + numbers[i] + ", ");//prints 1 - 2, 2 - 3, 3 - 4, 4 - 5
    }

//    for (int i = 1; i <= numbers.length ; i++) {
//      System.out.println(i + " - " + numbers[i]);
//    Will throw ArrayIndexOutOfBoundsException for index 5
//    }

//    int[20] nums; will not compile because the size of the array cannot be defined on the left.
    int[] nums = new int[20];// this is the correct way. Size only at initialization.

//    int size = nums.length(); will not compile because the length of an array is not a method
    //like for Strings but instead a final variable.
    int size = numbers.length;

    //the array size cannot be changed
    //numbers.length = 10 will not compile.
  }
}
