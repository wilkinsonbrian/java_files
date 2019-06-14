class InsertionSort {
  
  public static void main(String[] args) {
    int[] nums = {4, 3, 2, 10, 12, 1, 5, 6};
    for (int x=0; x<nums.length; x++) {
      System.out.print(nums[x] + " ");
    }
    System.out.print("\n");
    /*
    // Insertion Sort Algorithm
    for (int i=1; i<nums.length; i++) {
      for (int j=0; j<i; j++) {
        if (nums[i] < nums[j]) {
          int temp = nums[j];
          nums[j] = nums[i];
          nums[i] = temp;
    }
      }
    }
    */
    
    // Selection Sort Algorithm
    for (int y=0; y<nums.length; y++) {
      int smallest = nums[y];
      int index = y;
      for (int x=y; x<nums.length; x++) {
        
        if (nums[x] < smallest) {
          smallest = nums[x];
          index = x;
        }
      }
      int temp = nums[y];
      nums[y] = smallest;
      nums[index] = temp;
 
      
      
    }
    
    
    for (int x=0; x<nums.length; x++) {
      System.out.print(nums[x] + " ");
    }
  }
}