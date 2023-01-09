public class test {
   public static int sum(int i1, int i2){
       int result = 0;
       for(int i = i1; i <= i2; i++){
           result += i;
       }
       return result;
   }

    public static void main(String[] args) {
        System.out.println("1 -> 10 " + sum(1,10));
    }
}
//        int sum = 0;
//        int sum1 = 0;
//        int sum2 = 0;
//        for(int i = 0; i<=10 ; i++) {
//            sum += i;
//        }
//        System.out.println( + sum);
//
//        for(int i =20; i <= 37; i++){
//            sum1 += i;
//        }
//        System.out.println(sum1);
//
//        for(int i = 35; i <= 49; i++){
//            sum2 += i;
//        }
//        System.out.println(sum2);

