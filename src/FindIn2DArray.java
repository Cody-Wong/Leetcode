/**
 * 二维数组中的查找
 * 线性查找法，从右上角查找到左下角，时间复杂度O(m+n) m n分别为matrix的行列数
 * @Author Cody
 * @Date 2020/12/22
 */
public class FindIn2DArray {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        //避免空二维数组导致数组越界
        if(matrix.length == 0){
            return false;
        }
        int row = 0;
        int column = matrix[0].length -1;

        while(row <= matrix.length -1 && column >= 0){
            if(target > matrix[row][column]){
                row++;
            }else if(target < matrix[row][column]){
                column--;
            }else{
                return true;
            }
        }

        return false;
    }
}
