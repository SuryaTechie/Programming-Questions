import java.util.Scanner;


public class Diagonal_Pattern_Odd_Length {
    public static void main(String[] args) {

        //String str = "ABCDEFGHIJK";
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = scan.nextLine();

        if (str.length() % 2 == 0) {
            System.out.println("Not possible");
            return;
        }

        int innerSpace = 3;
        int preSpace = str.length() - 1;

        //First half
        for (int line = 1 ; line <= str.length()/2+1; line++) {

            //Printing pre space
            for (int s = 0; s < preSpace; s++) {
                System.out.print(" ");
            }

            preSpace -=2;

            if (line == 1) {
                System.out.print(str.charAt(str.length()/2));
            } else {
                System.out.print(str.charAt(str.length()/2 - line + 1) + " ");
                //inner space
                for (int i = 0; i < innerSpace ; i++) {
                    System.out.print(" ");
                }

                innerSpace += 4;

                System.out.print(str.charAt(str.length()/2 + line - 1) + " ");
            }

            System.out.println();

        }

        preSpace += 2;
        innerSpace -= 8;

        //Second half
        for (int line = str.length()/2 ; line > 0; line--) {
            preSpace +=2;
            //Printing pre space
            for (int s = 0; s < preSpace; s++) {
                System.out.print(" ");
            }
            if (line == 1) {
                System.out.print(str.charAt(str.length()/2));
            } else {
                System.out.print(str.charAt(str.length()/2 - line + 1) + " ");

                //inner space
                for (int i = 0; i < innerSpace ; i++) {
                    System.out.print(" ");
                }

                innerSpace -= 4;

                System.out.print(str.charAt(str.length()/2 + line - 1) + " ");
            }

            System.out.println();

        }

    }
}
