package Pyramid;/*
  @author   Romanyuk Bohdan
  @project   Romanyuk
  @class  Main
  @version  1.0.0 
  @since 21.03.2021 - 18.30
*/

public class Main {
    public static void main(String[] args) {

        // TESTING
        // Creating object of Pyramid

        Pyramid myPyramid = new Pyramid(6,5,1.0472,6);

        System.out.println("Area = " + myPyramid.getArea());
        myPyramid.setBaseSide(7);
        System.out.println("Perimeter = " + myPyramid.getPerimeter());

        System.out.println(myPyramid.toString());

    }
}
