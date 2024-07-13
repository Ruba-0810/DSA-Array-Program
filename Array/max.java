package Array;

public class max {

                             //maximum
    static int max(int[]num){                 //orINTEGER.minVlaue
        int maxvalue=num[0];
        for(int i=1;i< num.length;i++){
            if(maxvalue<num[i]) {
                maxvalue= num[i];



                           //maxrange
//                static int maxRange(int[]num,int start,int end){
//                    int maxvalue=num[start];       //orINTEGER.minVlaue
//                    for(int i=start;i<=end;i++){
//                        if(maxvalue<num[i]){
//                            maxvalue=num[i];

            }
        }
        return maxvalue;
    }
    public static void main(String[] args) {
        int[]num={2,1,4,3,5,6,7};
        System.out.println(max(num));
    }
}
