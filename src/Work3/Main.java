/**
 * 找出前五个完美数
 * 完美数是指一个数恰好等于它的因子之和
 * 例如：6 = 1 + 2 + 3
 * @Author: FoskyM
 * @Date: 2023/10/16 22:16
 */

package Work3;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        for (int p = 1; count < 5; p++) {
            // 2 ^ (p - 1) * (2 ^ p - 1)
            int num = (1 << (p - 1)) * ((1 << p) - 1);

            if (isPerfectNumber(num)) {
                count++;
                System.out.println(num);
            }
        }
    }

    static boolean isPerfectNumber(int n) {
        if (n < 2) return false;
        int sum = 1;
        for (int i = 2; i <= (int)Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i + n / i;
                if (sum > n) return false;
            }
        }
        return n == sum;
    }
}