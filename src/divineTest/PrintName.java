package divineTest;

public class PrintName {

    public String printUsername(String username){
        if (username.isEmpty()){
            System.out.println("Please give me a username");
        }
        else {
            System.out.println("Hello " + username);
        }
        return username;
    }


}
