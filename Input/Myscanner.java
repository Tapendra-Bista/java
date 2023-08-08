import java.util.Scanner;

public class Myscanner {
    public static void main(String[] args) {
        // Scanner is easy and simplicity as compared to ReaderBuffer
        // Scanner also use in Kotlin
        // make object of Scanner
        Scanner myscanner = new Scanner (System.in);
        System.out.print("Enter Your name :");
        String name = myscanner.nextLine();
       
         System.out.print("Enter Your College :");
        String College = myscanner.nextLine();
          System.out.print("Enter Your age :");
        int age = myscanner.nextInt();
         System.out.print("Enter Your Roll no :");
        int Roll = myscanner.nextInt();
        
System.out.println("\n");
System.out.println("Your name is "+name);
System.out.println("Your age is "+age);
System.out.println("Your college is "+College);
System.out.println("Your roll is "+Roll);
myscanner.close();
    }
}
