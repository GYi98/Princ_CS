public class GreatCircle {
    public static void main(String[] args) {
        double r = 6371.0;
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        double x = Math.toRadians(x2 - x1);
        double y = Math.toRadians(y2 - y1);

        double p = Math.pow(Math.sin(x / 2) , 2);
        double q = Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.pow(Math.sin(y / 2) , 2);
        double distance = 2 * r * Math.asin(Math.sqrt(p + q));

        System.out.println(distance + " kilometers");

    }
}
