/**
 * 隐式转换
 * 输出名字中各个字的Unicode编码值之和
 * 并输出每个字的下一个字
 * @Author: FoskyM
 * @Date: 2023/10/11 22:15
 */

package Work1;

public class Main {
    public static void main(String[] args) {
        char a = '张';
        char b = '某';
        char c = '三';
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println((int) a + (int) b + (int) c);
        System.out.println("" + (char) (a + 1) + (char) (b + 1) + (char) (c + 1));
    }
}