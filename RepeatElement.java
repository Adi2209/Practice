//q5

public class RepeatElement
{
	void printRepeating(int arr[], int size)
	{
		int i, j;
		System.out.println("Repeated Elements are :");
		for (i = 0; i < size-1; i++)
		{
			for (j = i + 1; j < size; j++)
			{
				if (arr[i] == arr[j])
					System.out.print(arr[i] + " ");
			}
		}
	}
	public static void difference(int arr[],int size ){
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){

				if(arr[i]-arr[j]==0){

				System.out.println("Difference of " +arr[i]+" & "+ arr[j] + "is zero ");

				}	

			}
		}
	}

	public static void display(int[][] matrix) {
        System.out.println("The matrix is: ");
        for(int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
	

	public static void main(String[] args)
	{
		RepeatElement repeat = new RepeatElement();
		int arr[] = {4, 2, 4, 5, 2, 3, 1,3,8,6};
		repeat.printRepeating(arr, 10);

		System.out.println("  ");

		difference(arr, 10);


		int row = 3, column = 3;
        int[][] matrix = { {2, 3, 4}, {5, 6, 4},{1,2,3} };

		System.out.println("  ");

        // Display current matrix
        display(matrix);

        // Transpose the matrix
        int[][] transpose = new int[column][row];
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Display transposed matrix
        display(transpose);
	}
}
