package binary;

public class sqrt {
     static int square(int k){
         int start=0;
         int end=k;
         while (start<=end){
             int mid=start+end;
             if(mid*mid==k){
                 return mid;
             }
             else if(mid*mid<k){
                 start=mid+1;
             }
             else{
                 end=mid-1;
             }
         }
      return end;
     }

    public static void main(String[] args) {
        int k=16;
        System.out.println( square(k));
     }
}
