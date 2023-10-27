//B. Enter a Roman Number as input and convert it to an integer.
import java.util.Scanner;

public class roman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String roman = scanner.nextLine();
        int result = RomanToInteger(roman);
        System.out.println("Equivalent Integer: " + result);
    }

    public static int RomanToInteger(String s) {
        java.util.HashMap<Character, Integer> values = new java.util.HashMap<>();
        values.put('I', 1);
        values.put('i', 1);
        values.put('V', 5);
        values.put('v', 5);
        values.put('X', 10);
        values.put('x', 10);
        values.put('L', 50);
        values.put('l', 50);
        values.put('C', 100);
        values.put('c', 100);
        values.put('D', 500);
        values.put('d', 500);
        values.put('M', 1000);
        values.put('m', 1000);

        int total = 0, prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int current = values.get(s.charAt(i));
            total += (current < prev) ? -current : current;
            prev = current;
        }

        return total;
    }
}