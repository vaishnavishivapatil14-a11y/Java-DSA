import org.w3c.dom.ls.LSOutput;

//public class Main{
//    //public static void main(String[]args){
//        System.out.println("Hi, I'am Vaishnavi, here to learn Java");
//        System.out.println("Java is fun if we understand it");
//        System.out.println("Bye");
//    }
//}


//variables
//public class Main {
//    public static void main(String[] args) {
//    int age = 20;
//    int classroom = 3;
//    double cgpa = 9.0;
//    char grad = 'A';
//    char symbol = '!';
//    boolean isStudent = true;
//    boolean isGirl = false;
//    String name = "shiva";
//System.out.println("My cgpa is "+ cgpa +" cpga");
//System.out.println("I scored "+grad +"I'm so happy");
//        System.out.println("My classroom number is:" + classroom);
//        System.out.println(isStudent);
//}
//}
//public class Main {
//    public static void main(String[] args) {
//        String colour = "blue";
//        String place = "Bangalore";
//        int age = 20;
//        int year = 2026;
//        int hour = 3;
//        double percentage = 96.32;
//        double quantity = 13.2;
//        char alphabet = 'A';
//        char symbol = '@';
//        boolean forSale = true;
//        boolean isHoliday = false;
//        System.out.println("My fav colour is "+ colour);
//        System.out.println("I'am "+ age+" years old");
//    }
//}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your gender(m/f) :");
        char gender=sc.next().charAt(0);
        System.out.println("you are "+ age+ " and you are a "+gender);
        sc.close();
    }
}

