package Back_tracking;

import java.util.Arrays;

public class Back_tracking_number {
    public static void main(String[] args) {
        boolean[][] booleanproblem = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][]path=new int[booleanproblem.length][booleanproblem[0].length];
        mazeproblem("", booleanproblem, 0, 0,path,1);
    }

    static void mazeproblem(String p, boolean[][] maze, int r, int c,int[][]path,int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c]=step;
            for(int[]arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (maze[r][c] == false) {
            return;
        }
        maze[r][c] = false;
        path[r][c]=step;
        if (r < maze.length - 1) {
            mazeproblem(p + 'R', maze, r + 1, c,path,step+1);
        }
        if (c < maze[0].length - 1) {
            mazeproblem(p + 'D', maze, r, c + 1,path,step+1);
        }
        if (r > 0) {
            mazeproblem(p + "U", maze, r - 1, c,path,step+1);
        }
        if (c > 0) {
            mazeproblem(p + "L", maze, r, c - 1,path,step+1);
        }
        //this function is over which mean it take backtracking FALSE CHANGE INTO TRUE
        maze[r][c] = true;
    }
}
