package demo1;

import java.util.Scanner;
public class StringReplacement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the original string:");
        String originalString = scanner.nextLine();

        System.out.println("Enter the substring to replace:");
        String substringToReplace = scanner.nextLine();

        System.out.println("Enter the replacement substring:");
        String replacementSubstring = scanner.nextLine();

              
        String modifiedString = replaceSubstring(originalString, substringToReplace, replacementSubstring);

            
        System.out.println("Modified String:");
        System.out.println(modifiedString);
        scanner.close();    }
     
    private static String replaceSubstring(String original, String toReplace, String replacement) {
        if (original == null || toReplace == null || replacement == null) {
            return "Invalid input. Please provide non-null strings.";
        }

        if (toReplace.isEmpty()) {
            return "Substring to replace cannot be empty.";
        }

        return original.replaceAll(toReplace, replacement);
    }
}
 