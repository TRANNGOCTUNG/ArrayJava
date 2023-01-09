import com.sun.security.jgss.GSSUtil;

public class test4 {
    public static void main(String[] args) {
        System.out.println("the grade is " + getGrade(70.5) );

        System.out.println("the grade is " + getGrade(59.9) );

    }

//    public static void printGrade(double number) {
//        if(number > 80){
//            System.out.println("A");
//        } else if(number > 70){
//            System.out.println("B");
//        } else if(number > 60){
//            System.out.println("C");
//        } else if (number > 50) {
//            System.out.println("D");
//        } else {
//            System.out.println("E");
//        }
//    }
    public static char getGrade(double num){
        if(num > 80){
            return 'A';
        } else if (num > 70) {
            return 'B';
        } else if (num > 60) {
            return 'C';
        } else if (num > 50) {
            return 'D';
        } else {
            return 'E';
        }
    }
}
