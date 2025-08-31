import java.util.Scanner;

public class PositiveNegativeSeparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size");
        byte Size = sc.nextByte();
        int[] num= new int[Size];
        System.out.println("Enter the numbers");
        for (int i = 0; i < Size; i++) {
            num[i]= sc.nextInt();
        }

        int left=0; int right= Size-1;
        while(left<= right)
        {
            if(num[left]<0 && num[right]>0 )
            {
                right--;
                left++;
            }
            else if(num[left]>0 && num[right]<0)
            {
                int temp= num[left];
                num[left]= num[right];
                num[right]= temp;
                left++;
                right--;
            }
            else if(num[left]<0)
            {
                left++;
            }
            else
                right--;
        }
        for(int numb : num)
            System.out.print(numb+" ");
    }
}
