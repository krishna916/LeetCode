class Main {
  public static void main(String[] args) {
    int[] num = {5, 3, 7, 12, 43, 6};
    int[] result = twoSum(num, 11);
    for(int i =0; i< result.length; i++) {
      System.out.print(result[i] + " ");
    }
  }

  /*
   * Given an array of integers, return indices of the two numbers such that they add up to * a specific target.
   * You may assume that each input would have exactly one solution, and you may not use * * the same element twice.
   *
   * Example:
   *
   * Given nums = [2, 7, 11, 15], target = 9,
   *
   * Because nums[0] + nums[1] = 2 + 7 = 9,
   * return [0, 1].
   * 
   * bruteforce method
   */
  public static int[] twoSum(int[] nums, int target) {
        
      int length = nums.length;
      int [] result = new int[2];
      for(int i = 0; i < length; i++) {
        for(int j = i +1; j<length; j++) {
          if(nums[i] + nums[j] == target){
            result[0] = i;
            result[1] = j;
            break;
          }
        }
      }
      return result;
    }
}