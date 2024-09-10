package org.example.kiemtra;

import java.io.Serializable;

public class Rectangle extends Shape implements Serializable {
    private double width;
    private double height;

    public Rectangle(String color, String shapeName, double width, double height) {
        super(color, shapeName);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    @Override
    public double calArea() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                 "color=" + getColor() +
                "Name" + getShapeName() +
                '}';
    }
    public double getArea(){
        return width * height;
    }

}
