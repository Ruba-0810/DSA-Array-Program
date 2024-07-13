package binary;
                                //PEAK INDEX IN MOUNTAIN ARRAY
public class PeakIndexMountainArray {
           public static void main(String[] args) {
               int[]arr={4,5,6,7,4,3,2,1,0};
               System.out.println(peakmountain(arr));
           }
          static int peakmountain(int[]arr){
               int start=0;
               int end= arr.length;
               while(start<end){
                   int mid=start+(end-start)/2;
                   if(arr[mid]>arr[mid+1]){
                      end=mid;
                   }
                   else {
                       start=mid+1;
                   }
               }
               return start;

           }

}
