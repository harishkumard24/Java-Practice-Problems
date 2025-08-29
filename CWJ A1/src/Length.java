import java.util.Arrays;
import java.util.Scanner;

public class Length
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string \n");
        String name = sc.nextLine();
        name = name.replaceAll("\\s+","").toLowerCase();
        char[] chars= name.toCharArray();
        Arrays.sort(chars);
        String sortedd = new String(chars);
        System.out.println("the sorted array is \n"+ sortedd);
        int len= chars.length;
        System.out.println("the length of the string is"+ len);
    }
}