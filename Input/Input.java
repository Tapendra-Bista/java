import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

 public class Input{
    static void UsingScanner(){
Scanner ss = new Scanner(System.in);
System.out.println("Enter String");
String st = ss.nextLine();
System.out.println(st);

System.out.println("Enter int");
int it = ss.nextInt();
System.out.println(it);
System.out.println("Enter double");
double de = ss.nextDouble();
System.out.println(de);
ss.close();
// boolean bn = ss.nextBoolean();
// System.out.println(bn);

    }
    public static void main(String[] args)
    {
        /*
         *we can take input in two way
         Scanner class 
         bufferedReader class
        */

// buffereReader class 
BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
try {
    System.out.println("Enter your name");
String name = br.readLine();
System.out.println(name);
    System.out.println("Enter your age");
int age =Integer.parseInt(br.readLine());
System.out.println("Age is : "+age);
} catch (Exception e){
   System.out.println(e);
}
// Scanner 
UsingScanner();
}
}
