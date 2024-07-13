package binary;


public class Agnosticproblem {
    /*
    for sorted array we need to use binary search
     */
    /*
    IN THIS WE DONT KNOW IT IS ASCENDING OR DESENDING  SO THAT I USE THIS METHOD
     */


    static int agnosticbs(int[]num,int target){
        int start=0;
        int end=num.length-1;
        boolean isagno;
        if(num[start]<num[end]){
            isagno=true;
        }
        else{
           isagno= false;
        }
        while(start<=end){
           int mid=start+(end-start)/2;
           if(isagno){
               if(target<num[mid]){
                   end=mid-1;
               }
               else if(target>num[mid]){
                   start=mid+1;
               }
               else {
                   return mid;
               }
           }

           /*
           DESENDING  point to words symbol
            */
           else{
               if(target<num[mid]){
                   start=mid+1;
               }
               else if(target>num[mid]){
                   end=mid-1;
               }
               else {
                   return mid;
               }
           }
        }
        return -1;
    }

    public static void main(String[] args) {
        //int[]num={-2,-1,0,1,2,3,4,5};
        int[]num={8,7,6,5,4,3,2};
        int target=4;
        int result=agnosticbs(num,target);
        System.out.println(result);
    }
}
