package module2.Inheritance;/*
  @author   Romanyuk Bohdan
  @project   Romanyuk
  @class  Main
  @version  1.0.0 
  @since 22.03.2021 - 12.10
*/

public class Main {
    public static void main(String[] args) {

        Rectangle myRectangle = new Rectangle(3, 4);
        System.out.println(myRectangle.toString() + "\n");

        // Creating object of Computer Monitor

        ComputerMonitor SE2719HR = new ComputerMonitor("black", "Samsung",
                75, 1920, 1080,
                15, 9);

        System.out.println(SE2719HR.toString() + "\n");
    }
}
