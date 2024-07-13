package binary;

public class binarysearch {
    static int binarybs(int[]num,int target){


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
        return -1;
    }
    public static void main(String[] args) {
        int[]num={2,3,4,5,7,8,9};
        int target=8;
        int result=binarybs(num,target);
        System.out.println(result);
    }
}
