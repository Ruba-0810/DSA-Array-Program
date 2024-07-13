
/*Suppose you have a temperature sensor 
in a room, and you want to determine 
if the current temperature reading falls within 
an acceptable range for the room's comfort.
You have predefined lower and upper bounds for 
the acceptable temperature range (e.g., lower bound 70°F and upper bound = 80°F).
You write a program to read the current temperature value in Celsius 
(in this case, 25°C) and convert it into Fahrenheit, print the temperature in 
Fahrenheit, 
then check if it falls within the specified range. If it does, 
the program prints
 "Temperature is within the range".

Test Case 1:
Input: 23
Output: 73.4

Temperature is within the range
*/
Temperature problem
import java.util.*;
class temperatur{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        double min_temp=70;
        double max_temp=80;
        double current_temp=sc.nextDoulbe();
        current_temp= current_temp*(9.0/5.0)+32; // beacaue when divide by 9/5 it will give integer  and their will be data loss
        if(current_temp>=min_temp && current_temp<=max_temp){
           System.out.println(current_temp);
           System.out.println("Temperature is within range");
        }
    }
}
