import java.util.Scanner;

public class SearchValue {
    public static void main(String[] args) {
        String[] myList = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name’s student: ");
        String nameInput = scanner.nextLine();
        boolean isExits = false;
        for (int i = 0; i < myList.length; i++) {
            if(myList[i].equals(nameInput)){
                System.out.println("Position of the students in the list " + nameInput + " is: " + i);
                isExits =true;
            }
        }
        if(!isExits){
            System.out.println("Not found" + nameInput + " in the list.");
        }
    }
}
