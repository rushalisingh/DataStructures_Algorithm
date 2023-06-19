package java.Arrays;
import java.util.*;

public class LongestPathinMatrix {
    
    static int R=3;
    static int C=10;
    static class Pair{
        boolean found;
        int val;
        //constructor 
        Pair(boolean x, int y)
        {
            found=x;//return true if dest reached 
            val=y; //return longest dist travelled to reach destination
        }
    }

    static Pair findLongestPathinMatrix(int mat[][] ,int i,int j, int x,int y,boolean visisted[][])
    {
        //base 
        if(i==x && j==y)
        {
                return new Pair(true, 0);
        }
        //invalid case
        if(i<0 || i>=R || j<0 || j>=C || mat[i][j]==0 ||visisted[i][j])
        {
            return new Pair(false,Integer.MAX_VALUE);
        }

        visisted[i][j] = true;
        int res= Integer.MIN_VALUE;
        //backtracking steps = up(i+1) ,down(i+1) ,left(j-1) ,right(j+1)

        // going left and found destination
        Pair sol = findLongestPathinMatrix(mat, i, j-1, x, y, visisted);
        if(sol.found){
            res = Math.max(sol.val ,res);
        } 

        //going right and found destination
        sol=findLongestPathinMatrix(mat, i, j+1, x, y, visisted);
        if(sol.found)
        {
            res = Math.max(sol.val , res);
        }

        //going up and found destination
        sol =findLongestPathinMatrix(mat, i-1, j, x, y, visisted);
        if(sol.found)
        {
            res = Math.max(sol.val,res);
        }

        //going down and found destination
        sol=findLongestPathinMatrix(mat, i+1, j, x, y, visisted);
        if(sol.found)
        {
            res=Math.max(sol.val, res);
        }

        visisted[i][j]=false;

        // if destination can be reached from curr cell
        if(res!=Integer.MIN_VALUE)
        {
            return new Pair(true, res+1);
        }
        else{
            return new Pair(false,Integer.MAX_VALUE);
        }
    }
    static void findLongestPath (int mat[][] ,int i, int j ,int x,int y)
    {
        boolean visisted[][]= new boolean[R][C];
        Pair p=findLongestPathinMatrix(mat, i, j, x, y, visisted);
        if(p.found)
        {
            System.out.println("Length of longest path is : "+ p.val);
        }
        else
        {
            System.out.println("Destination not reachable");
        }
    }

    public static void main(String[] args) {
        int mat[][] = { { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
        { 1, 1, 0, 1, 1, 0, 1, 1, 0, 1 },
        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 } };

        findLongestPath(mat,0,0,1,7);
    }
}
