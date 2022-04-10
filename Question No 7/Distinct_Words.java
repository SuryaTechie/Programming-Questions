import java.util.*;
public class PrintDistinct {

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the String:");
        String input=in.nextLine();

        //split the words by space
        String[] inputarr=input.split(" ");


        HashSet<String> set=new LinkedHashSet<String>();

        //Iterate over the set
        for(String x:inputarr)
        {
            set.add(x);
        }

        Iterator itr=set.iterator();

        //print distinct words
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
    }

}
