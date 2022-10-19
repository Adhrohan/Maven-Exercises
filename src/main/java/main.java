import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println(StringUtils.rotate(("hello"), 2));
        System.out.println(StringUtils.upperCase("hello"));
        System.out.println(StringUtils.lowerCase("hello"));
        System.out.println(StringUtils.isEmpty(""));

        System.out.println("Enter something: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        if (StringUtils.isEmpty(userInput)){
            System.out.println("You didn't enter anything.");
        }else {
            System.out.println("You entered: " + userInput);
        }
        //flips the case of user input.
        System.out.println(StringUtils.swapCase(userInput));

        //reverse the input.
        System.out.println(StringUtils.reverse(userInput));

    }
}

