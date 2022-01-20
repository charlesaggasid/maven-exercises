import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter something and: \n a. I'll print whether or not  the user entered is a number\n b. Flip the case of the string \n c. Reverse the string");
        String userInput = scanner.nextLine();

        System.out.println("a. " + StringUtils.isNumeric(userInput));
        System.out.println("b. " + StringUtils.swapCase(userInput));
        System.out.println("c. " + StringUtils.reverse(userInput));






    }
}
