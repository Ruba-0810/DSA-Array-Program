package binary;

public class SmallestLetterEgCeliging {
    static char smallestletter(char[]lengths,char target){
        int start=0;
        int end=lengths.length-1;
        while (start <= end) {

            int mid=start+(end-start)/2;
            if(target>lengths[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return lengths[start%lengths.length];
    }


    public static void main(String[] args) {
       char[] lengths = {'c','f','j'};
        char target = 'a';
        System.out.println(smallestletter(lengths,target));
    }
}
