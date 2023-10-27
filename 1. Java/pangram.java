import java.util.Scanner;

public class pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase();
        boolean isPangram = isPangram(sentence);
        if (isPangram) {
            System.out.println("It's a pangram!");
        } else {
            System.out.println("It's not a pangram.");
        }
    }

    public static boolean isPangram(String s) {
        // Pangram checking logic
        boolean[] mark = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Check if the character is from 'a' to 'z'
            if ('a' <= ch && ch <= 'z') {
                mark[ch - 'a'] = true;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (!mark[i]) {
                return false;
            }
        }

        return true;
    }
}