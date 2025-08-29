public class Arguments {

    public static void main(String[] args) {
        if (args.length < 4)
        {
            System.out.println("Please enter 4 arguments to proceed");
        } else {
            System.out.println(" argument is " + args[0]);
            System.out.println(" argument is " + args[1]);
            System.out.println(" argument is " + args[2]);
            System.out.println(" argument is " + args[3]);
        }
    }
}