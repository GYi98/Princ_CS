// 学习内容：
// 概率选择、绝对值

public class RandomWalker {
    public static void main(String[] args) {
        int x = 0, y = 0, d = 0;
        int r = Integer.parseInt(args[0]);
        int step = 0;
        int p;

        while (d != r) {
            p = (int) (Math.random() * 3); // random*n要加括号，运算顺序
            if (p == 0) {
                x = x + 1;
            }
            else if (p == 1) {
                x = x - 1;
            }
            else if (p == 2) {
                y = y + 1;
            }
            else {
                y = y - 1;
            }
            System.out.println("(" + x + "," + y + ")");

            int x0 = Math.abs(x);
            int y0 = Math.abs(y);
            d = x0 + y0;
            step = step + 1;
        }
        System.out.println("steps =" + step);

    }
}
