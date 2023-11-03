/**
 * 课后练习 5.9
 *
 *
 * @Author: FoskyM
 * @Date: 2023/10/31 19:13
 */

package Work5;

import java.util.Scanner;

public class T_5_9 {
    public static void main(String[] args) {
        System.out.println("输入字符串：");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("输入字符：");
        String c = sc.nextLine();
        System.out.println(str.replace(c, ""));
    }
}
