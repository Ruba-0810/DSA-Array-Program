
//password change
import java.util.*;
class project1{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)throws Exception
    {
        System.out.println("Select the application:");
        System.out.println("1.Facebook\n2.Instagram");
        int select_the_application=sc.nextInt();
        switch(select_the_application){
            case 1:{
                System.out.println("Welcome to Facebook");
                System.out.println("1.email\n2.pwd\n3.change password");
                int Select_the_menu_fackbook=sc.nextInt();
                String email="rubavathy0810@gmail.com";
                int pwd=1234;
                switch(Select_the_menu_fackbook){
                    case 1:{
                        System.out.println("Enter the email:"+email);
                        break;
                        }
                    case 2:{
                        System.out.println("Enter the pwd:"+pwd);
                        break;
                        }
                    case 3:{
                        System.out.print("Enter the OTP:");
                        Thread.sleep(3000);
                        int system_otp=(int)(Math.random()*9999+9999);
                        System.out.print(system_otp);
                        int user_otp=sc.nextInt();
                        if(user_otp==system_otp)
                        System.out.println("otp is matched");
                        else
                        System.out.println("Otp is not matched");
                        break;

                    }
                    default:{
                        System.out.println("Select the menu is not present");
                        break;
                        }
                }
                break;
                }  
            case 2:{
                System.out.println("1.email\n2.pwd\n3.change password\n4.change gmail");
                int Select_the_menu_Instagram=sc.nextInt();
                String gmail="rubavathy0810@gmail.com";
                int password=2345;
                switch(Select_the_menu_Instagram){
                    case 1:{
                        System.out.println("Enter the email:"+gmail);
                        break;
                        }
                    case 2:{
                        System.out.println("Enter the pwd:"+password);
                        break;
                        }
                    case 3:{
                        System.out.print("Enter the OTP:");
                        Thread.sleep(3000);
                        int otp_pwd=(int)(Math.random()*9999+9999);
                        System.out.print(otp_pwd);
                        int user_otp=sc.nextInt();
                        if(user_otp==otp_pwd){
                        System.out.println("otp is matched");
                        System.out.println("Enter new Password:");
                        password=sc.nextInt();
                        }
                        else{
                        System.out.println("Otp is not matched"); 
                        }
                        break;
                        }
                    case 4:{
                        System.out.println("Change the email");
                        System.out.print("Enter the OTP:");
                        Thread.sleep(3000);
                        int otp_email=(int)(Math.random()*9999+9999);
                        System.out.println(otp_email);
                        int user_otp_instagram=sc.nextInt();
                        if(user_otp_instagram==otp_email){
                          System.out.print("Enter new gmail:");
                        }
                        else{
                        System.out.println("Incorrect OTP");
                        }
                        break;
                        }
                    default:
                       System.out.println("Instagram menu is not present");  
                       break;
                   }

                break;
                }
                default:
                    System.out.println("Invalid Application");
                    break;

            
        }
    }
}

               
                



                
                
             
            