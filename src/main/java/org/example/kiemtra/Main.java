package org.example.kiemtra;

public class Main {
    public static void main(String[] args) {
        CRUDRectangle crudRectangle = new CRUDRectangle();
        Rectangle rectangle = new Rectangle("red ", "Hình chữ nhật", 5.0, 7.0);
        Rectangle rectangle1 = new Rectangle("yellow ", "Hình chữ nhật", 10.0, 17.0);
        Rectangle rectangle2 = new Rectangle("green ", "Hình chữ nhật", 7.0, 13.0);
        Rectangle rectangle3 = new Rectangle("sliver ", "Hình chữ nhật", 8.0, 14.0);
        Shape shapeRectangle = new Rectangle("blue", "chu nhat", 3.0, 5.0);
        crudRectangle.addRectangle(rectangle);
        crudRectangle.addRectangle(rectangle1);
        crudRectangle.addRectangle(rectangle2);
        crudRectangle.addRectangle(rectangle3);

        crudRectangle.addRectangleToFile(rectangle, "rec0");
        crudRectangle.addRectangleToFile(rectangle1, "rec1");
        crudRectangle.addRectangleToFile(rectangle2, "rec2");
        crudRectangle.addRectangleToFile(rectangle3, "rec3");

        System.out.println("rectangle from file rec0 : " + rectangle);
        System.out.println("rectangle from file rec0 : " + rectangle1);
        System.out.println("rectangle from file rec0 : " + rectangle2);
        System.out.println("rectangle from file rec0 : " + rectangle3);

        System.out.println(crudRectangle.getRectangleFromFile("rec0"));
        System.out.println(crudRectangle.getRectangleFromFile("rec1"));
        System.out.println(crudRectangle.getRectangleFromFile("rec2"));
        System.out.println(crudRectangle.getRectangleFromFile("rec3"));

        // Lưu mảng đối tượng hình chữ nhật vào file
        Rectangle[] listRectangle = {rectangle1, rectangle2, rectangle3};
        crudRectangle.addRectangleListToFile(listRectangle, "rectangles");
        // Hiển thị tất cả thông tin hình chữ nhật trong mảng đối tượng hình chữ nhật trong file
        Rectangle[] rectanglesFromFile = crudRectangle.getAllRectangleFromFile("rectangles");
        if (rectanglesFromFile != null) {
            System.out.println("All Rectangles from file rectangles:");
            for (Rectangle rect : rectanglesFromFile) {
                if (rect != null) {
                    System.out.println(rect);
                }
            }
        }


        System.out.println("Area = " + rectangle3.getArea());
        System.out.println(rectangle3.toString());


    }
}
