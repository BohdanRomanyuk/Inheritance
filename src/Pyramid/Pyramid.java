package Pyramid;/*
  @author   Romanyuk Bohdan
  @project   Romanyuk
  @class  Pyramid
  @version  1.0.0 
  @since 21.03.2021 - 18.17
*/

import java.util.Objects;

public class Pyramid {

    // Parameters

    private double side;
    private double baseSide;
    private double AngleBetweenSideAndBase;
    private double sideRibLength;

    // 1. Create constructor:

    // Constructor FULL

    public Pyramid(double side, double baseSide, double angleBetweenSideAndBase, double sideRibLength) {
        this.side = side;
        this.baseSide = baseSide;
        AngleBetweenSideAndBase = angleBetweenSideAndBase;
        this.sideRibLength = sideRibLength;
    }


    // Constructor EMPTY

    public Pyramid() {
    }

    // 2. Getters & Setters:

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getBaseSide() {
        return baseSide;
    }

    public void setBaseSide(double baseSide) {
        this.baseSide = baseSide;
    }

    public double getAngleBetweenSideAndBase() {
        return AngleBetweenSideAndBase;
    }

    public void setAngleBetweenSideAndBase(double angleBetweenSideAndBase) {
        AngleBetweenSideAndBase = angleBetweenSideAndBase;
    }

    public double getSideRibLength() {
        return sideRibLength;
    }

    public void setSideRibLength(double sideRibLength) {
        this.sideRibLength = sideRibLength;
    }


    // 3. Creating five methods:

    // First Perimeter

    public double getPerimeter() {
        return (this.getBaseSide() * 4);
    }

    // Second - Area

    public double getArea() {
        return (this.getPerimeter() / 2 * getHeight() );
    }

    // Third  - Volume

    public double getVolume() {
        return (this.getPerimeter() / 3 * getHeight());
    }

    // Fourth - Height

    public double getHeight() {
        return (this.getSideRibLength() *
                Math.sin(this.getAngleBetweenSideAndBase()));
    }

    // Fifth - Side surface

    public double getSideSurface() {
        return (this.side * 4);
    }

    // Fifth - Radius of the described sphere


    // 4. toString() method:

    @Override
    public String toString() {
        return "Pyramid{" +
                "side=" + side +
                ", baseSide=" + baseSide +
                ", AngleBetweenSideAndBase=" + AngleBetweenSideAndBase +
                ", sideRibLength=" + sideRibLength +
                '}';
    }

    // 5. hash() and equals() methods:


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pyramid pyramid = (Pyramid) o;
        return Double.compare(pyramid.getSide(),
                getSide()) == 0 && Double.compare(pyramid.getBaseSide(),
                getBaseSide()) == 0 && Double.compare
                (pyramid.getAngleBetweenSideAndBase()
                , getAngleBetweenSideAndBase())
                == 0 && Double.compare(pyramid.getSideRibLength(),
                getSideRibLength()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSide(), getBaseSide(),
                getAngleBetweenSideAndBase(), getSideRibLength());
    }
}