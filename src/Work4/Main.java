/**
 * 课后练习 5.4
 * int[][] a={{1,5,6,81,2},{3,4,5,8,10},{4,6,98,0,43},{22,3,5,12,4}}
 * 找出 min max，指出它们所在的行和列
 *
 * @Author: FoskyM
 * @Date: 2023/10/23 20:45
 */

package Work4;

public class Main {
    public static void main(String[] args) {
        int[][] a = {
                {1, 5, 6, 81, 2},
                {3, 4, 5, 8, 10},
                {4, 6, 98, 0, 43},
                {22, 3, 5, 12, 4}
        };
        int min = a[0][0], max = a[0][0];
        int minRow = 0, minCol = 0, maxRow = 0, maxCol = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                int num = a[i][j];
                if (num < min) {
                    min = num;
                    minRow = i;
                    minCol = j;
                }
                if (num > max) {
                    max = num;
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        System.out.println("min: " + min + " row: " + minRow + " col: " + minCol);
        System.out.println("max: " + max + " row: " + maxRow + " col: " + maxCol);
    }
}