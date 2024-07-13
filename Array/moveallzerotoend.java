package Array;

import java.util.Arrays;

public class moveallzerotoend {
    static void allzero(int[]num,int size){
        if(size==0||size==1){
            return;
        }
        int nz=0,n=0;
        while(nz<size){
            if(num[nz]!=0){
                int temp=num[nz];
                num[nz]=num[n];
                num[n]=temp;
                nz++;
                n++;

            }
            else{
                nz++;
            }
        }
    }

    public static void main(String[] args) {
        int[]num={2,5,0,6,7,0,0,4,5,3,0,6};
        int size =num.length;
        allzero(num,size);
        System.out.println(Arrays.toString(num));

    }
}
