public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int times = Integer.parseInt(args[1]);
        int sum = 0;
        int step;
        double steps;

        for (int i = 0; i < times; i++) {
            step = randomwalker(r);
            sum = sum + step;
            System.out.println(step);
            System.out.println(sum + "。");
        }
        steps = sum / (times * 1.0);
        System.out.println("average number of steps = " + steps);
    }

    public static int randomwalker(int r0) {
        int x = 0, y = 0, d = 0;
        int step = 0;
        int p, sum0;

        while (d != r0) {
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
            // System.out.println("(" + x + "," + y + ")");

            int x0 = Math.abs(x);
            int y0 = Math.abs(y);
            d = x0 + y0;
            step = step + 1;
        }
        sum0 = step;
        return sum0;
    }
}

