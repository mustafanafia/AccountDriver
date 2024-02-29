import java.util.Scanner;
import java.util.Random;
public class AccountDriver {
    public static void main (String[] args) {
        
        
        
        String userNameInput;
        String userPassword;
  
        int randomNum;

        
        int length;
        
        
        
        String encryptedPassword;

        
        
        
        UserAccount userName = new UserAccount();
        UserAccount password = new UserAccount();
        
        
        Random randGen = new Random ();
        Scanner scnr = new Scanner (System.in);
        
        
            
        
        System.out.println("Enter Username");
        userNameInput = scnr.next();
        
     
        
        length = userNameInput.length(); 

        
        
        
            if (length < 8 || length > 16) {
            System.out.println("Username has to be between 8 and 16"); 
            userNameInput = scnr.next(); 
        }
            else {
                userName.setuserName(userNameInput);
        }
        
        
    
    
    
    
    
        
        System.out.println("Enter password");
        userPassword = scnr.next();
    
        
        length = userPassword.length(); 
        
        if (length < 8 || length > 20) {
            System.out.println("Password has to be between 8 and 16"); 
            userPassword = scnr.next(); 
        }
        
        
        
        
        
        
        randomNum = randGen.nextInt(9) + 1;
        
        encryptedPassword = (userPassword + randomNum);
        
        
        
        

    
    
        
        System.out.println(userName);
        
        System.out.println("Your password is: " + encryptedPassword);
    }
}


    
    
    





    

        
     