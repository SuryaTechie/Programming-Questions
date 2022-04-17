import java.util.Scanner;

public class Characters_Difference {
    private static boolean isValid(String str) {
        int prevDiff = 0;
        prevDiff = Math.abs(str.charAt(0) - str.charAt(1));
        for (int i = 1; i < str.length(); i++) {
            int curDiff = Math.abs(str.charAt(i) - str.charAt(i-1));
            if (prevDiff != curDiff) {
                return false;
            }
            prevDiff = curDiff;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = scan.nextLine();
        if (isValid(str)) {
            System.out.println("Equal difference");
        } else {
            System.out.println("Unequal difference");
        }
    }
}
