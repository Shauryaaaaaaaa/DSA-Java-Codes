import java.util.*;

public class SortedMatrix {
    public static void main(String[] args){
    }

    //since it is applying simple binary search in the row hence:
    static int[] binarySearch(int[][] matrix, int row , int cStart, int cEnd, int target){
       while(cStart <= cEnd){
        int mid = cStart + (cEnd - cStart) / 2;
        if(matrix[row][mid] == target){
            return new int[]{row, mid};
        }
        if(matrix[row][mid] < target){
            cStart = mid + 1;
        }else{
            cEnd= mid - 1;
        }
       }
        return new int[] {-1,-1}; 
    }

    static int[] search(int[][] matrix , int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows == 1){
            return binarySearch(matrix, 0, 0, cols-1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        //we will run the loop only until 2 rows are remaining:
        while(rStart < (rEnd - 1)){
            int mid = rStart + (rEnd - rStart) / 2;
            if(matrix[mid][cMid] == target){
                return new int[] {mid, cMid};
            }
            if(matrix[mid][cMid] < target){
                rStart = mid;
            }else{
                rEnd = mid;
            }
        }
        
        //now we have 2 rows:
        //check wheather the target is in the column of 2 rows:
        if(matrix[rStart + 1][cMid] == target){

            return new int[]{rStart, cMid};
        }

        //search in 1st half:
            if(matrix[rStart][cMid -1] >= target){
                return binarySearch(matrix, rStart, 0, cMid-1, target);
            }
            //search in 2nd half:
            if(matrix[rStart][cMid+1] <= target){
                return binarySearch(matrix, rStart, cMid +1, cols- 1, target);
            }
            //search in 3rd half:
            if(matrix[rStart + 1][cMid - 1] >= target){
                return binarySearch(matrix, rStart + 1, 0, cMid-1, target);
            }
            //search in 4th half:
            else(matrix[rStart + 1][cMid - 1] <= target){
                return binarySearch(matrix, rStart + 1, cMid + 1, cMid-1, target);    
            }

            }
    }
}
