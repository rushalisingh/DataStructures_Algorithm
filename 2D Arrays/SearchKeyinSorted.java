public class SearchKeyinSorted {

    public static boolean staircaseSearch(int matrix[][],int key)
    {
        int row=0,col=matrix[0].length-1;

        while(row <matrix.length && col >=0)
        {
            if(matrix[row][col]==key)
            {
                System.out.println("Found the key at ("+ row + " , "+ col+ " )");
                return true;
            }
            else if(key <matrix[row][col])
            {
                col--;
            }
            else if(key>matrix[row][col])
            {
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) 
    {
        int matrix[][]={{10,20,30,40},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int key=40;
        System.out.print(staircaseSearch(matrix,key));
    }
    
}
