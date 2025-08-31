import java.util.Arrays;
import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to be Entered \n");
        String Sentence = sc.nextLine();
        int count=0;
        char[] chars= Sentence.toCharArray();
        char[] vowels={'A','E','I','O','U','a','e','i','o','u'};
        for(int i=0;i<chars.length;i++)
        {
            for(int j=0;j<vowels.length; j++)
            {
                if(chars[i]==vowels[j])
                    count++;
            }
        }System.out.println("The no of vowels in the string are "+count);
    }
}
