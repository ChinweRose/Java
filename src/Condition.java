public class Condition {
    public static void main(String[] args) {

        int a = 20;
        int b = 10;
        boolean thunderStorm = true;
        boolean sunnyDay = false;
        if ( !(a > b) && thunderStorm || !(a<b) && sunnyDay) {
            System.out.print("Please, get inside!");
        }else{
            System.out.print("Go out if you want.");
        }

        }
    }

