package lab2;
import java.util.ArrayList;
/**
 *
 * @author ahnaf
 */
public class ProceduralAbstraction {
    
    //Requires: None
    //Modifies: None
    //Effects: Returns the smallest positive integer n for which n!
    // (i.e. 1*2*3*...*n) is greater than or equal to x, for positive
    // integer x. Otherwise returns 1.
    
    public static int reverseFactorial (int x){
        int num = 1;
        int fact = 1;
        
        while (fact < x){
            fact*= num;
            num++;
        }
        return num-1;
    }
    
    //Requires: None
    //Modifies: None
    //Effects: If the matrix arr satisfies Nice property, prints the sum and
    // returns true. Otherwise returns false.
    
    /**
     * @param arr
     * @return
     */
    public static boolean isMatrixNice(int[][] arr) {

        int row = 0, col = 0, diag = 0, diagr = 0;
        ArrayList sumCheck = new ArrayList<>();
        if(arr[arr.length - 1].length==arr.length){
             for (int[] arr1 : arr) {
                 row = 0;
                 for (int j = 0; j<arr.length; j++) {
                     row += arr1[j];
                 }
                 sumCheck.add(row);
             }
                for (int i = 0;i<arr.length; i++){
                    col = 0;
                    for (int[] arr1 : arr) {
                        col += arr1[i];
                    }
                    sumCheck.add(col);
                }
                for (int i = 0;i<arr.length; i++){   
                    for(int j = 0;j<arr.length;j++){
                        if(j==i)
                            diag +=arr[j][i];
                    }                   
                }
                sumCheck.add(diag);
                
                for (int i=arr.length - 1;i >= 0; i--){   
                    for(int j=arr.length - 1;j >= 0;j--){
                        if(j==i)
                            diagr +=arr[j][i];
                    }        
                }
                sumCheck.add(diagr);
                
            for(int k = 1;k<sumCheck.size();k++){
                if (sumCheck.get(k)!=sumCheck.get(k-1))
                    return false;
            }
            System.out.println("sum: "+diag);
            return true;
        }
        else 
            return false;
    }
    
    public static void main (String[] args){
        int [][] nice={{2,7,6},{9,5,1},{4,3,8}};
        int [][] notNice ={{-3,1,0},{4,-3,4},{7,-9,0}};
        int [][] notSquare = {{3,4,3},{5,4,3}};
        
        System.out.println(reverseFactorial(24));
        System.out.println(reverseFactorial(119));
        System.out.println(isMatrixNice(nice));
        System.out.println(isMatrixNice(notNice));
        System.out.println(isMatrixNice(notSquare));
    }
}
