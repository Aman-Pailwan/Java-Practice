

public class Main{
    public static void main(String[] args) {
        double sum = 0;
        for(int i = 0 ; i < args.length ; i++)
        {
            if(args[i].matches("[0-9\\.]+"))
                 sum = sum + Double.parseDouble(args[i]);
        }

        System.out.println(sum);
    }
}