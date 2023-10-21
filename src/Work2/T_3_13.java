package Work2;

import java.util.*;

public class T_3_13 {
    public static void main(String[] args) {
        // 3.13
        System.out.println("输入圆的半径r：");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("输入圆柱的高h：");
        int h = sc.nextInt();
        double pi = 3.14;
        double s = r * r * pi;
        double v = s * h;
        System.out.println("圆柱体积：" + v);
    }
}
