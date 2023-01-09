public class test2 {
    public static void main(String[] args) {
       int [] myList = new int[5];
       for(int i = 0; i < myList.length; i++){
           myList[i] = i;
       }

        for(int item: myList ){
            System.out.println(item);
        }
    }
}
