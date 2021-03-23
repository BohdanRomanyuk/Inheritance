package module2.Inheritance;/*
  @author   Romanyuk Bohdan
  @project   Romanyuk
  @class  Rectangle
  @version  1.0.0 
  @since 22.03.2021 - 12.15
*/

import java.util.Objects;

public class Rectangle {

    // Parameters

    private int length;
    private int width;

    // Constructor FULL

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Constructor EMPTY

    public Rectangle() {
    }

    // Getters Setters

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    // Method of calculating the area

    public int getArea() {
        return this.getLength() * this.getWidth();
    }

    // Method which determines a Quadrate

    public boolean isQuadrate(){
        return ((this.length == this.width) ? true : false);
    }

    // Method toString()

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + getArea() +
                ", isQuadrate=" + isQuadrate() +
                '}';
    }

    // Methods equals() and hashCode()

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return getLength() == rectangle.getLength() &&
                getWidth() == rectangle.getWidth();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLength(), getWidth());
    }
}