//swiggy application
import java.util.*;
class project3{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args)throws Exception
    {
        System.out.println("Welcome To swiggy");
        System.out.println("Select Hotel");
        System.out.println("Processing..................");
        Thread.sleep(3000);
        System.out.println("1.Buhari\n2.A2B\n3.Amma Canteen\n4.S.S Hydrabad");//hotel
        int Select_hotel=sc.nextInt();
        switch(Select_hotel){
            case 1:{//Buhari
                 System.out.println("Welcome To Buhari");
                 System.out.println("Select Favorite food");
                 System.out.println("1.Mutton biryani\n2.Chicken 65\n3.Prawn biryani\n4.Mandi biriyani");
                 int price;//price for food
                 double total;//total price
                 int Enter_the_quality;//total quality
                 int Select_favorite_food=sc.nextInt();
                 switch(Select_favorite_food){
                    case 1:{//Mutton biryani
                        price=100;
                        System.out.println("Enter the quality:");
                        Enter_the_quality=sc.nextInt();
                        total=Enter_the_quality*100;
                        System.out.println("Total bill:"+total);
                        System.out.println("Select the payment");// select payment
                        System.out.println("Processing..................");
                        Thread.sleep(3000);
                        System.out.println("1.G.pay\n2.phone pay");
                        int Select_the_payment=sc.nextInt();
                        switch(Select_the_payment){
                            case 1:{// Mutton biryani gpay
                                System.out.println("Please enter the bill amount");
                                int user_bill=sc.nextInt();
                                if( user_bill==total){
                                    System.out.print("Enter OTP:");
                                    Thread.sleep(2000);
                                    int otp_random=(int)(Math.random()*9999+9999);
                                    System.out.println(otp_random);
                                    int user_otp=sc.nextInt();

                                    if(user_otp==otp_random){
                                        System.out.print("Order success");
                                    }else{
                                        System.out.print(" fail order");
                                    }
                                }
                                break;

                                }
                                case 2:{//Mutton biryani phone pay
                                System.out.println("Please enter the bill amount");
                                int user_bill=sc.nextInt();
                                if( user_bill==total){
                                    System.out.print("Enter OTP:");
                                    Thread.sleep(2000);
                                    int otp_random=(int)(Math.random()*9999+9999);
                                    System.out.println(otp_random);
                                    int user_otp=sc.nextInt();

                                    if(user_otp==otp_random){
                                        System.out.print("Order success");
                                    }else{
                                        System.out.print(" fail order");
                                    }
                                }
                                break;

                                }
                            default:{
                                System.out.println("Invalid Select the payment");
                                break;
                            }
                        }
                        break;
                        }
                        case 2:{//Chicken 65
                        price=100;
                        System.out.println("Enter the quality:");
                        Enter_the_quality=sc.nextInt();
                        total=Enter_the_quality*100;
                        System.out.println("Total bill:"+total);
                        System.out.println("Select the payment");// select payment
                        System.out.println("Processing..................");
                        Thread.sleep(3000);
                        System.out.println("1.G.pay\n2.phone pay");
                        int Select_the_payment=sc.nextInt();
                        switch(Select_the_payment){
                            case 1:{// Chicken 65 gpay
                                System.out.println("Please enter the bill amount");
                                int user_bill=sc.nextInt();
                                if( user_bill==total){
                                    System.out.print("Enter OTP:");
                                    Thread.sleep(2000);
                                    int otp_random=(int)(Math.random()*9999+9999);
                                    System.out.println(otp_random);
                                    int user_otp=sc.nextInt();

                                    if(user_otp==otp_random){
                                        System.out.print("Order success");
                                    }else{
                                        System.out.print(" fail order");
                                    }
                                }
                                break;

                                }
                                case 2:{//Chicken 65 phone pay
                                System.out.println("Please enter the bill amount");
                                int user_bill=sc.nextInt();
                                if( user_bill==total){
                                    System.out.print("Enter OTP:");
                                    Thread.sleep(2000);
                                    int otp_random=(int)(Math.random()*9999+9999);
                                    System.out.println(otp_random);
                                    int user_otp=sc.nextInt();

                                    if(user_otp==otp_random){
                                        System.out.print("Order success");
                                    }else{
                                        System.out.print(" fail order");
                                    }
                                }
                                break;

                                }
                            default:
                                System.out.println("Invalid Select the payment");
                        }
                        break;
                        }

                        case 3:{//Prawn biryani
                        price=100;
                        System.out.println("Enter the quality:");
                        Enter_the_quality=sc.nextInt();
                        total=Enter_the_quality*100;
                        System.out.println("Total bill:"+total);
                        System.out.println("Select the payment");// select payment
                        System.out.println("Processing..................");
                        Thread.sleep(3000);
                        System.out.println("1.G.pay\n2.phone pay");
                        int Select_the_payment=sc.nextInt();
                        switch(Select_the_payment){
                            case 1:{// Prawn biryani gpay
                                System.out.println("Please enter the bill amount");
                                int user_bill=sc.nextInt();
                                if( user_bill==total){
                                    System.out.print("Enter OTP:");
                                    Thread.sleep(2000);
                                    int otp_random=(int)(Math.random()*9999+9999);
                                    System.out.println(otp_random);
                                    int user_otp=sc.nextInt();

                                    if(user_otp==otp_random){
                                        System.out.print("Order success");
                                    }else{
                                        System.out.print(" fail order");
                                    }
                                }
                                break;

                                }
                                case 2:{// phone pay Prawn biryani
                                System.out.println("Please enter the bill amount");
                                int user_bill=sc.nextInt();
                                if( user_bill==total){
                                    System.out.print("Enter OTP:");
                                    Thread.sleep(2000);
                                    int otp_random=(int)(Math.random()*9999+9999);
                                    System.out.println(otp_random);
                                    int user_otp=sc.nextInt();

                                    if(user_otp==otp_random){
                                        System.out.print("Order success");
                                    }else{
                                        System.out.print(" fail order");
                                    }
                                }
                                break;

                                }
                            default:
                                System.out.println("Invalid Select the payment");
                        }
                        break;
                        }

                        case 4:{//Mandi briyani
                        price=100;
                        System.out.println("Enter the quality:");
                        Enter_the_quality=sc.nextInt();
                        total=Enter_the_quality*100;
                        System.out.println("Total bill:"+total);
                        System.out.println("Select the payment");// select payment
                        System.out.println("Processing..................");
                        Thread.sleep(3000);
                        System.out.println("1.G.pay\n2.phone pay");
                        int Select_the_payment=sc.nextInt();
                        switch(Select_the_payment){
                            case 1:{// Mandi briyani gpay
                                System.out.println("Please enter the bill amount");
                                int user_bill=sc.nextInt();
                                if( user_bill==total){
                                    System.out.print("Enter OTP:");
                                    Thread.sleep(2000);
                                    int otp_random=(int)(Math.random()*9999+9999);
                                    System.out.println(otp_random);
                                    int user_otp=sc.nextInt();

                                    if(user_otp==otp_random){
                                        System.out.print("Order success");
                                    }else{
                                        System.out.print(" fail order");
                                    }
                                }
                                break;

                                }
                                case 2:{//Mandi briyani phone pay
                                System.out.println("Please enter the bill amount");
                                int user_bill=sc.nextInt();
                                if( user_bill==total){
                                    System.out.print("Enter OTP:");
                                    Thread.sleep(2000);
                                    int otp_random=(int)(Math.random()*9999+9999);
                                    System.out.println(otp_random);
                                    int user_otp=sc.nextInt();

                                    if(user_otp==otp_random){
                                        System.out.print("Order success");
                                    }else{
                                        System.out.print(" fail order");
                                    }
                                }
                                break;
                            }
                            default:
                                System.out.println("Invalid Select the payment");
                        }
                        break;
                        }
                        }
                break;
                }
                default:
                    {
                        System.out.println("Food not present");
                    }
/*
                case 2:{//A2B
                 System.out.println("Welcome To Buhari");
                 System.out.println("Select Favorite food");
                 System.out.println("1.Dosa\n2.Idly\n3.Vada");
                 int price;//price for food
                 double total;//total price
                 int Enter_the_quality;//total quality
                 int Select_favorite_food=sc.nextInt();
                 switch(Select_favorite_food){
                    case 1:{//Dosa
                        price=100;
                        System.out.println("Enter the quality:");
                        Enter_the_quality=sc.nextInt();
                        total=Enter_the_quality*100;
                        System.out.println("Total bill:"+total);
                        System.out.println("Select the payment");// select payment
                        System.out.println("Processing..................");
                        Thread.sleep(3000);
                        System.out.println("1.G.pay\n2.phone pay");
                        int Select_the_payment=sc.nextInt();
                        switch(Select_the_payment){
                            case 1:{// Dosa gpay
                                System.out.println("Please enter the bill amount");
                                int user_bill=sc.nextInt();
                                if( user_bill==total){
                                    System.out.print("Enter OTP:");
                                    Thread.sleep(2000);
                                    int otp_random=(int)(Math.random()*9999+9999);
                                    System.out.println(otp_random);
                                    int user_otp=sc.nextInt();

                                    if(user_otp==otp_random){
                                        System.out.print("Order success");
                                    }else{
                                        System.out.print(" fail order");
                                    }
                                }
                                break;

                                }
                                case 2:{//Dosa phone pay
                                System.out.println("Please enter the bill amount");
                                int user_bill=sc.nextInt();
                                if( user_bill==total){
                                    System.out.print("Enter OTP:");
                                    Thread.sleep(2000);
                                    int otp_random=(int)(Math.random()*9999+9999);
                                    System.out.println(otp_random);
                                    int user_otp=sc.nextInt();

                                    if(user_otp==otp_random){
                                        System.out.print("Order success");
                                    }else{
                                        System.out.print(" fail order");
                                    }
                                }
                                break;

                                }
                            default:
                                System.out.println("Invalid Select the payment");
                        }
                        break;
                        }
                        case 2:{//idly
                        price=100;
                        System.out.println("Enter the quality:");
                        Enter_the_quality=sc.nextInt();
                        total=Enter_the_quality*100;
                        System.out.println("Total bill:"+total);
                        System.out.println("Select the payment");// select payment
                        System.out.println("Processing..................");
                        Thread.sleep(3000);
                        System.out.println("1.G.pay\n2.phone pay");
                        int Select_the_payment=sc.nextInt();
                        switch(Select_the_payment){
                            case 1:{// idly gpay
                                System.out.println("Please enter the bill amount");
                                int user_bill=sc.nextInt();
                                if( user_bill==total){
                                    System.out.print("Enter OTP:");
                                    Thread.sleep(2000);
                                    int otp_random=(int)(Math.random()*9999+9999);
                                    System.out.println(otp_random);
                                    int user_otp=sc.nextInt();

                                    if(user_otp==otp_random){
                                        System.out.print("Order success");
                                    }else{
                                        System.out.print(" fail order");
                                    }
                                }
                                break;

                                }
                                case 2:{//idly phone pay
                                System.out.println("Please enter the bill amount");
                                int user_bill=sc.nextInt();
                                if( user_bill==total){
                                    System.out.print("Enter OTP:");
                                    Thread.sleep(2000);
                                    int otp_random=(int)(Math.random()*9999+9999);
                                    System.out.println(otp_random);
                                    int user_otp=sc.nextInt();

                                    if(user_otp==otp_random){
                                        System.out.print("Order success");
                                    }else{
                                        System.out.print(" fail order");
                                    }
                                }
                                break;

                                }
                            default:
                                System.out.println("Invalid Select the payment");
                        }
                        break;
                        }
                        System.out.println("Thank you");//idly
                        case 3:{//vada
                        price=100;
                        System.out.println("Enter the quality:");
                        Enter_the_quality=sc.nextInt();
                        total=Enter_the_quality*100;
                        System.out.println("Total bill:"+total);
                        System.out.println("Select the payment");// select payment
                        System.out.println("Processing..................");
                        Thread.sleep(3000);
                        System.out.println("1.G.pay\n2.phone pay");
                        int Select_the_payment=sc.nextInt();
                        switch(Select_the_payment){
                            case 1:{// vada gpay
                                System.out.println("Please enter the bill amount");
                                int user_bill=sc.nextInt();
                                if( user_bill==total){
                                    System.out.print("Enter OTP:");
                                    Thread.sleep(2000);
                                    int otp_random=(int)(Math.random()*9999+9999);
                                    System.out.println(otp_random);
                                    int user_otp=sc.nextInt();

                                    if(user_otp==otp_random){
                                        System.out.print("Order success");
                                    }else{
                                        System.out.print(" fail order");
                                    }
                                }
                                break;

                                }
                                case 2:{// vada Prawn biryani
                                System.out.println("Please enter the bill amount");
                                int user_bill=sc.nextInt();
                                if( user_bill==total){
                                    System.out.print("Enter OTP:");
                                    Thread.sleep(2000);
                                    int otp_random=(int)(Math.random()*9999+9999);
                                    System.out.println(otp_random);
                                    int user_otp=sc.nextInt();

                                    if(user_otp==otp_random){
                                        System.out.print("Order success");
                                    }else{
                                        System.out.print(" fail order");
                                    }
                                }
                                break;

                                }
                            default:
                                System.out.println("Invalid Select the payment");
                        }
                        break;
                        }
                        
                        }
                break;
                }
                */
                 }
    }
}