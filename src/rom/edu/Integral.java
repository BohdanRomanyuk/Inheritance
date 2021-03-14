package rom.edu;/*
  @author   Romanyuk Bohdan
  @project   Romanyuk
  @class  Integral
  @version  1.0.0 
  @since 14.03.2021 - 15.31
*/

public class Integral {
    public static void main(String[] args) {

        double start = 0;
        double finish = Math.PI;
        double deltaX = 0.1;
        double y = 0.5;
        double area = 0;

        for (double x = start; x < finish; x += deltaX) {

            double rectangle = 0;

            if (Math.sin(x) < y ) {
                rectangle = Math.sin(x) * deltaX;
            } else {
                rectangle = y * deltaX;
            }
            area += rectangle;

        }
        System.out.println(area);
    }
}
