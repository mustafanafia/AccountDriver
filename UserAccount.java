//********************************************************************
//  UserAccount.java
//  Student name:
//  Date:
//  Purpose:
//********************************************************************

import java.util.Random;

public class UserAccount
{
   public String userName;
   private String password;
   private int CaesarShift;
   private int decrypt;
   



  
   //-----------------------------------------------------------------
   //  This method uses a Caesar  to enrypt the password. 
   //  The shift amount is passed in as a parameter.
   //  It will not encrypt an already encrypted password.
   
   //-----------------------------------------------------------------
   
   public UserAccount() { 
       CaesarShift = 0;
    }
    public UserAccount(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    
       
   
   public String getuserName() {
       return userName;
    }
   public void setuserName(String userName) {
       this.userName = userName;
    }
    
    
   public String getpassword() {
       return password;
    }
   public void setpassowrd(String password) {
       this.password = password;
    }
    
  
   
   
   
   public void encrypt(int shift)
   {

      if (CaesarShift == 0 && (shift > 0 && shift < 10))
      {
         String masked = "";
         
         for (int index = 0; index < password.length(); index++)
            masked = masked + (char)(password.charAt(index)+shift);
        
         password = masked;
         CaesarShift = shift;
      }

   }

  public int getdecrypt() {
      return decrypt;
  
      
      
      
      
}


     public String toString () {
         
         return ("Your Username is: " + userName);
        }
    }

    




