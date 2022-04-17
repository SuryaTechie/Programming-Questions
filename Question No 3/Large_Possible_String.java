import java.util.*;
public class Large_Possible_String {
    static void desOrder(char[] s)
    {
        //sort the array
        Arrays.sort(s);
        reverse(s);
    }
    //reverse the elements
    static void reverse(char[] a)
    {
        int i,n=a.length;
        char t;
        for(i=0;i<n/2;i++)
        {
            t=a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=t;
        }
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of string to be entered : ");
        int count = scan.nextInt();
        scan.nextLine();
        String[] strings = new String[count];
        for (int i = 1 ; i <= count; i++) {
            System.out.print("Enter the String" + i + " : ");
            strings[i-1] = scan.nextLine();
        }
        for ( int i = 0 ; i < strings.length; i++) {
            char[] s = strings[i].toCharArray();
            desOrder(s);
            System.out.println("String" + (i+1) + " : " +String.valueOf(s));
        }

    }
}
