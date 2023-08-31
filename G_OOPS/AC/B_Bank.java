
public class B_Bank{

    public static void main(String args[]){ 
        BankAccount myacc = new  BankAccount(); 
        myacc.username = "nandini"; 
        myacc.setpassword("asbaduefowrbfw");

        System.out.println(myacc.setpassword);

    }
}   

class BankAccount{
    public String username; 
    private String password; 
    public void setpassword(String pwd){
        password = pwd;
    }
}