import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mybufferr {
    public static void main(String[] args)  throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter number : ");
        int x = Integer.parseInt(br.readLine());
        switch (x) {
            case 1:
                  System.out.print(1);
                break;
        case 2:
                  System.out.print(2);
                break;
                case 3:
                  System.out.print(3);
                break;
            default:
                  System.out.print("Invalid Input  (only upto 3)");
                break;
        }
    }
}
