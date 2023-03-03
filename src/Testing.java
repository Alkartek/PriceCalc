
import java.util.Scanner;

public class Testing {

    Scanner scanner = new Scanner(System.in);
    public static void tester(String[] args){
        int result = 0;
        Scanner scanner1 = new Scanner(System.in);
        String x = scanner1.next();
        String y = scanner1.next();
        char[] bukva = x.toCharArray();
        char[] bukva2 = y.toCharArray();
        for (int i =0; i<bukva.length; i++){
            if (bukva.equals(i)){
                result = result + 1;
            }
        }

    }
}
