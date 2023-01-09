public class passArray {
    public static void main(String[] args) {
        int x = 1;
        int[] y = new int[10];
        m(x,y);
        System.out.println("x is " + x);
    }
    public static void m(int num, int[] nums){
        num = 1001;
      for(int i = 0; i < nums.length; i++){
          nums[i] = i;
      }
        for (int item: nums
             )
            System.out.println(item);{

        }
    }
}
