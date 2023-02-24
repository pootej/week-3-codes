class Duplicate {
  public static void main(String args[]) {
    int arr[] = { 1, 3, 4, 5, 6, 7, 4, 3, 1, 3, 4 };

    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          arr[i] = -1;
        }
      }
      if (arr[i] != -1) {
        System.out.println("array without duplicate elements is" + arr[i]);
      }
    }

  }
}
