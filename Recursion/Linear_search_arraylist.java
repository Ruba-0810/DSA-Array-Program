package Recursion;

import java.util.ArrayList;


public class Linear_search_arraylist {
    public static void main(String[] args) {
        int[] num = {2, 3, 5, 6, 6, 30};
//        int target = 26;
//        System.out.println(linearfirst(num, target, 0));
//        System.out.println(linearlast(num, target, num.length - 1));
//
//        findlallindex(num, 6, 0); // in this we did create arraylist in outside
//       System.out.println(list);
//        //but in this we create arraylist by passing arraylist in argunment
//        ArrayList<Integer> ans=findlallindex(num,6,0,new ArrayList<>());
//        System.out.println(ans);
        System.out.println(find(num,6,0));

    }


    /*
    SEARCH FROM FIRST
     */
//    static int linearfirst(int[] num, int target, int index) {
//        if (index == num.length) {  //see at last
//            return -1;
//        }
//        if (num[index] == target) {
//            //            return index;
//        }
//        return linearfirst(num, target, index + 1);
//
//    }

    /*
    SEARCH FROM LAST
     */
//    static int linearlast(int[] num, int target, int index) {
//        if (index == num.length) {  //see at last
//            return -1;
//        }
//        if (num[index] == target) {
//            return index;
//        }
//        return linearlast(num, target, index - 1);
//    }

    /*
                                     int this we create list outside the function(REPRET NUMBER SHOULD BE COLLECTED IN ARRAY)
     */
//    static ArrayList<Integer> list = new ArrayList<>();
//
//    static void findlallindex(int[] num, int target, int index) {
//        if (index == num.length ) {
//            return;
//        }
//        if (num[index] == target) {
//            list.add(index);
//        }
//        findlallindex(num, target, index + 1);
//    }

                                 /*
                                  in this we create list inside the function
                                   */

    //    static ArrayList<Integer> findlallindex(int[] num, int target, int index, ArrayList<Integer> list) {
//        if (index == num.length) {
//            return list;
//        }
//        if (num[index] == target) {
//            list.add(index);
//        }
//        return findlallindex(num, target, index + 1,list);
    // }
    static ArrayList<Integer> find(int[] num, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == num.length) {
            return list;
        }
       if (num[index] == target) {
          list.add(index);
      }
            ArrayList<Integer> ansforfind = find(num, target, index + 1);
            list.addAll(ansforfind);
            return list;
        }
}
