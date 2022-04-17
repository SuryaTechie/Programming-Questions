import java.util.*;
public class Max_Possible_Palindrome {

    public static void main(String[] args)
    {
        //String str = "madameaga";
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=scan.nextLine();
        HashMap<Character,Integer> countMap=new HashMap<>();
        //Counting the character count in the given string
        for(char c:str.toCharArray())
        {
            countMap.put(c,countMap.getOrDefault(c,0)+1);
        }
        Character oddTemp=null;
        String preFix="";
        String postFix="";
        //Constructing the result string
        for(char key: countMap.keySet())
        {
            int count= countMap.get(key);
            //If even add the character on both sides
            if(count %2==0)
            {
                int half=count/2;
                for(int i=0;i<half;i++)
                {
                    preFix=preFix+key;
                }
                for(int i=0;i<half;i++)
                {
                    postFix=key+postFix;
                }
            }
            //if there is a odd length occuring character marking it to put it in centre
            else if(oddTemp==null)
            {
                oddTemp=key;
            }
        }
        //If there is a odd length char
        if(oddTemp==null)
        {
            System.out.println(preFix+postFix);
        }
        //If there is no odd length char
        else
        {
            System.out.println(preFix+oddTemp+postFix);
        }
    }

}
