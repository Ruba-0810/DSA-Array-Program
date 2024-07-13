import java.util.*;
class p18{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
        int magic_topic=(int)(Math.random()*4);
        int magic_name=(int)(Math.random()*4);
        boolean ruba= true;

        do{
            System.out.println("\t\t\t\tTopics");
            System.out.println("1.Instagram\n2.Indian Education\n3.covid\n4.AI");
            int guess_topic=sc.nextInt();
            System.out.println("\t\t\t\tCandidate name");
            System.out.println("1.roobi\n2.raja\n3.rose\n4.ruba");
            int name=sc.nextInt();
            if(magic_topic==guess_topic && magic_name==name) {
                if(guess_topic==1 && name==1){
                    System.out.println("Instagram - roobi");
                }
                else if(guess_topic==1 && name==2){
                    System.out.println("Instagram - raja");
                }
                else if(guess_topic==1 && name==3){
                    System.out.println("Instagram - rose");
                }
                else if(guess_topic==1 && name==4){
                    System.out.println("Instagram - ruba");
                }
                else if(guess_topic==2 && name==1){
                    System.out.println("Instagram - roobi");
                }
                else  if(guess_topic==2 && name==2){
                    System.out.println("Indian Education - raja");
                }
                else if(guess_topic==2 && name==3){
                    System.out.println("Indian Education- rose");
                }
                else if(guess_topic==2 && name==4){
                    System.out.println("Indian Education - ruba");
                }
                else if(guess_topic==3 && name==1){
                    System.out.println("covid - roobi");
                }
                else  if(guess_topic==3 && name==2){
                    System.out.println("covid - raja");
                }
                else if(guess_topic==3 && name==3){
                    System.out.println("covid- rose");
                }
                else if(guess_topic==3 && name==4){
                    System.out.println("covid - ruba");
                }
                else if(guess_topic==4 && name==1){
                    System.out.println("AI - roobi");
                }
                else  if(guess_topic==4 && name==2){
                    System.out.println("AI - raja");
                }
                else if(guess_topic==4 && name==3){
                    System.out.println("AI- rose");
                }
                else if(guess_topic==4 && name==4){
                    System.out.println("AI - ruba");
                }
                else
                 System.out.println("wow....");
                 System.out.println("1.repeat\n2.not repeat");
                int input=sc.nextInt();
                 if(input==2){
                    ruba= false;
                }

            
            }
            /*else{
                System.out.println("1.repeat\n2.not repeat");
                int input=sc.nextInt();
                if(input==2){
                    ruba= false;
                }
            }*/
        }while(ruba);
    }
}