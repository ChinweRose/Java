public class compound {
    public static void main(String [] args){

        double amount;
        double principal = 1000;
        double rate = 0.05;

        System.out.printf("%s%20s" , "Year" , "Amount");

        for(int year = 1; year<= 10; year++){
            amount = principal * Math.pow( 1.0 + rate,year);

            System.out.printf("%3d%20.2f%n" , year , amount);
        }
    }
}
