public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);



        boolean isPositiveNum;
        boolean isTriangle;
        boolean isRightTriangle;

        isPositiveNum = (a > 0) && (b > 0) && (c > 0);
        boolean condition1 = (a * a + b * b == c * c);
        boolean condition2 = (a * a + c * c == b * b);
        boolean condition3 = (b * b + c * c == a * a);
        isTriangle = condition1 || condition2 || condition3;
        isRightTriangle = isPositiveNum && isTriangle;

        System.out.println(isRightTriangle);
    }
}
