public class SpiralMatrix {

    public static void printSpiral(int matrix[][])
    {
        int startRow=0;
        int endRow=matrix.length-1;
        int startCol= 0;
        int endCol=matrix[0].length-1;

        while(startRow<=endRow && startCol <=endCol)
        {
            //top
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[startRow][j] + " ");
            }

            //right
            for(int i=0;i<matrix.length;i++)
            {
                System.out.print(matrix[i][endCol]+ " ");
            }

            //bottom
            for(int j=endCol-1;j>=endRow;j--)
            {
                if(startRow==endRow)
                {
                    break;
                }
                System.out.print(matrix[endRow][j]+ " ");
            }
            //left
            for(int i=endRow-1;i>=startRow+1;i--)
            {
                if(startCol==endCol)
                {
                    break;
                }
                System.out.print(matrix[i][startCol]+ " ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }
public static void main(String[] args) 
{
    int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    printSpiral(matrix);
}
}
