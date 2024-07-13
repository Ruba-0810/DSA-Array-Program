//switch inside switch
import java.util.*;
class project2{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
         System.out.println("Select the input:");
         System.out.println("1.Telugu\n2.Hindi\n3.Tamil\n4Kannada");
         int Select_the_input=sc.nextInt();
         switch(Select_the_input){
            case 1:{
                System.out.println("Select the Telugu movies");
                System.out.println("1.Arundati\n2.Salar\n3.Pushpa");
                int Select_the_Teugu_movies=sc.nextInt();
                switch(Select_the_Teugu_movies){
                    case 1:{
                        System.out.println("Anushka shethy Mam");
                        break;}
                        case 2:{
                        System.out.println("Prabhas Sir");
                        break;}
                        case 3:{
                        System.out.println("Atlu Arjun sir");
                        break;}
                        default:{
                            System.out.println("Invalid Tengu movies");
                            break;}
                }
                break;}
                case 2:{
                System.out.println("Select the Hindu movies");
                System.out.println("1.PK\n2.Chennai Exp\n3.Animal");
                int Select_the_Hindu_movies=sc.nextInt();
                switch(Select_the_Hindu_movies){
                    case 1:{
                        System.out.println("A.K sir");
                        break;}
                        case 2:{
                        System.out.println("S.R.K sir");
                        break;}
                        case 3:{
                        System.out.println("R.K sir");
                        break;}
                        default:{
                            System.out.println("Invalid Hindu movies");
                            break;}
                }
                break;}
            case 3:{
                System.out.println("Select the Tamil movies");
                System.out.println("1.Leo\n2.Vikram\n3.Guruda");
                int Select_the_Tamil_movies=sc.nextInt();
                switch(Select_the_Tamil_movies){
                    case 1:{
                        System.out.println("Vijay");
                        break;}
                        case 2:{
                        System.out.println("Kamal");
                        break;}
                        case 3:{
                        System.out.println("uri");
                        break;}
                        default:{
                            System.out.println("Invalid Tamil movies");
                            break;}

                }
                break;}
            case 4:{
                System.out.println("Select the Kannada movies");
                System.out.println("1.KGF\n2.Salar\n3.Pushpa");
                int Select_the_Kannada_movies=sc.nextInt();
                switch(Select_the_Kannada_movies){
                        case 1:{
                        System.out.println("Yash sir");
                        break;}
                        case 2:{
                        System.out.println("Raj  Sir");
                        break;}
                        case 3:{
                        System.out.println("GV sir");
                        break;}
                        default:{
                            System.out.println("Invalid Kannada movies");
                            break;}
                }
                break;}
            default:{
                System.out.println("Invalid movies");
                break;
            }
            
         }
    }
}