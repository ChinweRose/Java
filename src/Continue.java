public class Continue {
    public static void main(String[] args)
    {
        for ( int counter = 1; counter <= 10; counter ++)
        {
            if (counter == 3)
                continue;
        System.out.printf("%d ", counter);
        }
    }
}
