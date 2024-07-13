package binary;

public class floor {
    static int floorBS(int[]num,int target){


        /*
        HERE  I KNOW IT IS IN THE ASCENDING ORDER SO THAT I US THIS METHOD
         */
        int start=0;
        int end=num.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            /*
            mid=(start+mid)/2 (simple number EXAMPLE:0,9)
            or
            mid=start+(end-start)/2;  (large number EXAMPLE:0,1000)
             */
            if(target<num[mid]){
                end=mid-1;
            }
            else if(target>num[mid]){
                start=mid+1;
            }
            else{
                return mid; //if mid and target get same then we need to write mid
            }

        }
        return end;
    }
    public static void main(String[] args) {
        int[]num={2,3,5,9,14,16,18};
        int target=15;
        int result=floorBS(num,target);
        System.out.println(result);
    }
}

