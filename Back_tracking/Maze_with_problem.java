package Back_tracking;

public class Maze_with_problem {
    public static void main(String[] args) {

         boolean[][] booleanproblem={
                 {true,true,true},
                 {true,false,true},
                 {true,true,true}
         };
        mazeproblem("",booleanproblem,0,0 );
    }

    static void mazeproblem(String p,boolean[][]maze,int r,int c){
        if(r== maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(maze[r][c]==false){
            return;
        }
        if(r<maze.length-1){
            mazeproblem(p+'R',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            mazeproblem(p+'D',maze,r,c+1);
        }
    }
}
