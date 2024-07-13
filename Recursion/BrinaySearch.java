package Recursion;

public class BrinaySearch {
    public static void main(String[] args) {
        int[]num={2,14,20,27,30,45,57,68,70,80,90};
        int target=14;
        System.out.println(search(num,target,0,num.length-1));
    }
    static int search(int[]num,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(num[mid]==target){
            return mid;
        }
        if(target<num[mid]){
            return  search(num,target,start,mid-1);
            }
        return search(num,target,mid+1,end);
        }
    }
