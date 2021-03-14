package rom.edu;/*
  @author   Romanyuk Bohdan
  @project   Romanyuk
  @class  AboutMe
  @version  1.0.0 
  @since 12.03.2021 - 14.05
*/

public class AboutMe {
    public static void main(String[] args) {
        System.out.println("Some facts about me!");

        byte myAge = 21;
        System.out.println("My age is " + myAge + " years.");

        short yearOfBirth = 1999;
        System.out.println("I was born in " + yearOfBirth + "." );

        int cityPopulation = 112447;
        System.out.println("In Uzhhorod lives " + cityPopulation + " people.");

        long earthPopulation = 70000000000l;
        System.out.println("In Earth lives " + earthPopulation + "humans.");

        float myWeight = 74.4f;
        System.out.println("My weight is " + myWeight + " kgs."   );

        double myHeight = 184;
        System.out.println("My height is " + myHeight + " cms.");

        char sign = '!';
        System.out.println("I love Ukraine" + sign);

        boolean myFuture = true;
        System.out.println("I want to study in Slovak. Its " + myFuture + "!");

        String str = "Thank for your Attention!";
        System.out.println(str);
    }
}
