//Titel: ArrayMatrix.java | Author: Ramon Schenk | Date: 02/09/2014
package arrayMatrix;

public class ArrayMatrix {
	public static void main(String[] args){
	
	//Array als Matrix um mittels ASCII Code & Print eine Zeichnung zu machen
	char[][] matrix = {  
			//Zeilen
			// 1 ,  2 ,  3 ,  4 ,  5 ,  6 ,  7 ,  8 ,  9 ,  X
			{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'x' }, //1
            { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'x', ' ' }, //2
            { ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'x', ' ', ' ' }, //3
            { ' ', ' ', ' ', ' ', ' ', ' ', 'x', ' ', ' ', ' ' }, //4
            { ' ', ' ', ' ', ' ', ' ', 'x', ' ', ' ', ' ', ' ' }, //5
            { ' ', ' ', ' ', ' ', 'x', ' ', ' ', ' ', ' ', ' ' }, //6
            { ' ', ' ', ' ', 'x', ' ', ' ', ' ', ' ', ' ', ' ' }, //7
            { ' ', ' ', 'x', ' ', ' ', ' ', ' ', ' ', ' ', ' ' }, //8
            { ' ', 'x', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' }, //9
            { 'Z', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' }  //10
        };
	
	   for(int i = 0; i < matrix.length; i++){  
	        for(int j = 0; j < matrix.length; j++){  
	                System.out.print(matrix[i][j]);
	        }
	        System.out.print("\n");
	    }
	}
}