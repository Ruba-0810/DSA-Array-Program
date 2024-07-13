package Back_tracking;
                                  //true flase
public class Back_tracking_maze {
    public static void main(String[] args) {
        boolean[][] booleanproblem={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        mazeproblem("",booleanproblem,0,0 );
    } static void mazeproblem(String p,boolean[][]maze,int r,int c){
        if(r== maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(maze[r][c]==false){
            return;
        }
        maze[r][c]=false;
        if(r<maze.length-1){
            mazeproblem(p+'R',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            mazeproblem(p+'D',maze,r,c+1);
        }
        if(r>0){
            mazeproblem(p+"U",maze,r-1,c);
            }
        if(c>0){
            mazeproblem(p+"L",maze,r,c-1);
        }
        //this function is over which mean it take backtracking FALSE CHANGE INTO TRUE
        maze[r][c]=true;
    }
    }
