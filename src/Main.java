import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String anaOne;
        String anaTwo;
        boolean same = true;

        System.out.println("Enter a String one");
        anaOne = scan.nextLine();
        System.out.println("Enter String Two");
        anaTwo = scan.nextLine();

        int lengthOne = anaOne.length();
        int lengthTwo = anaTwo.length();

        //creates array and sort them the same
        char arrayOne[] = anaOne.toCharArray();
        Arrays.sort(arrayOne);
        System.out.println(arrayOne);

        char arrayTwo[] = anaTwo.toCharArray();
        Arrays.sort(arrayTwo);
        System.out.println(arrayTwo);

        if(lengthOne == lengthTwo) {
            for (int i = 0; i < lengthOne; i++) {
                if (arrayOne[i] != arrayTwo[i]) {
                    same = false;
                }
            }
        }

        if(same){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}