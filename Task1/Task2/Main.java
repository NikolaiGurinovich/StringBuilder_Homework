package Task2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern docPattern = Pattern.compile("[0-9]{4}-[0-9]{4}-[0-9]{2}");
        Pattern numberPattern = Pattern.compile("(\\+\\([0-9]{2}\\)[0-9]{7})");
        Pattern emailPattern = Pattern.compile("\\w+([\\\\.-]?\\w+)*@\\w+([\\\\.-]?\\w+)*\\.\\w{2,4}");
        Matcher matcherForDoc = docPattern.matcher(input);
        Matcher matcherForNumber = numberPattern.matcher(input);
        Matcher matcherForEmail = emailPattern.matcher(input);
        while (matcherForDoc.find()){ // работает
            System.out.println("document number: " + matcherForDoc.group());
        }
        while (matcherForNumber.find()){ //работает
            System.out.println("telephone number: " + matcherForNumber.group());
        }
        while (matcherForEmail.find()){ // работает
            System.out.println("email: " + matcherForEmail.group());
        }
    }
}
