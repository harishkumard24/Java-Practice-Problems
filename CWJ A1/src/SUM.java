public class SUM {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("please enter 3 number to calculate the Sum");
            return;
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int Sum = a + b + c;

        System.out.println("enter no 1 "+a);
        System.out.println("enter no 2 "+b);
        System.out.println("enter no 3 "+c);
        System.out.println("\nThe sum is "+Sum);
    }
}
