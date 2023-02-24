class Frequency {
  public static void main(String args[]) {
    int arr[] = { 1, 3, 4, 5, 6, 7, 4, 3, 1, 3, 4 };// arr is of length 10
    int count = 1; // count =1
    for (int i = 0; i < arr.length; i++) { // ll compare with j
      for (int j = i + 1; j < arr.length; j++) { // ll compare with i
        if (arr[i] == arr[j]) { // if arr[i]==arr[j]
          count++; // count is incremented
          arr[j] = -1; // if we dont use this condition all the numbers in array ll have seperate line
                       // and count error
        }
      }
      if (arr[i] != -1 ) {
        System.out.println("frequency :" + count);
      }
      count = 1;
    }
  }
}