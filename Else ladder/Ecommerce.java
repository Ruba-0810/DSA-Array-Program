/*
For an Ecommerce application we need to write a logic to calculate the total price of the purchase 
after applying the discount. The discount are as follows,If the customer is a teenager, 
flat discount 5%. If the total purchase price is above 5000 after the flat discount 
customer gets additional 5% discount.
If the customer is in 20's flat discount 6%. If the total
purchase price is above 4000 after the flat discount
customer gets additional 6% discount.If the customer is aged above 29 flat discount 15%.
Assume the age and total purchase price is given as input.
Write a program to calculate the total price of purchase after discount and display, 
total price before discount, total price after discount, discounted amount if any.
Test Case 1:

Input age:12
Input total price:200
Output:200
200
Test Case 2:
Input age: 19
Input total price: 2000
Output:2000
1900
100
Test Case 3:
Input age:21
Input total price:10000
Output:10000
A
8836
1164

*/
import java.util.*;
class program8{
    public static void main(String [] agrs){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        double total_price=sc.nextInt();
        double after_discount=total_price;
        if(age>=13 && age<=19){
          
          //s1.appy 5%
          after_discount=total_price-(total_price*0.05);
          
          //s2. apply extra 5% when it is greater than 5000
          if(after_discount>5000)
          after_discount=after_discount-(after_discount*0.05);

        }
        else if(age>=20 && age<= 29){
            
            //s1.appy 5%
            after_discount=total_price-(total_price*0.06);
            
             //s2. apply extra 5% when it is greater than 4000
            if(after_discount>4000)
            after_discount=after_discount-(after_discount*0.06);
        }
        else if(age>29){
        //S1 aply 1.5%
        after_discount=total_price-(total_price*1.5);
        }
    
    //display 
    //1.total price
    //2.total price after discount
    //3.discounted amount
    System.out.println(total_price);
    System.out.println(after_discount);
    System.out.println(total_price-after_discount);
    }
}

