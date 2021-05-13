import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello from Maven.");


        System.out.println("type input you want to modify :)");
        String input = sc.nextLine();
        String modifiedInput = StringUtils.swapCase(input);
        String reversedInput = StringUtils.reverse(modifiedInput);
        System.out.println(modifiedInput);
        System.out.println(reversedInput);
    }

}
