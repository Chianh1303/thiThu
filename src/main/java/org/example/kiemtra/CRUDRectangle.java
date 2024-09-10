package org.example.kiemtra;

import java.io.*;

public class CRUDRectangle {
    // Mảng đối tượng hình chữ nhật
    private Rectangle[] rectangleList;

    // Thuộc tính static lưu số hình chữ nhật hiện tại trong danh sách
    private static int numberOfRectangle;

    // Phương thức khởi tạo không tham số
    public CRUDRectangle() {
        // Khởi tạo mảng chứa tối đa 100 hình chữ nhật
        this.rectangleList = new Rectangle[100];
        numberOfRectangle = 0; // Số hình chữ nhật ban đầu là 0
    }

    // 009/ Phương thức thêm một hình chữ nhật vào danh sách
    public boolean addRectangle(Rectangle objRectangle) {
        if (numberOfRectangle < rectangleList.length) { // Kiểm tra danh sách có chỗ trống không
            rectangleList[numberOfRectangle] = objRectangle; // Thêm hình chữ nhật vào mảng
            numberOfRectangle++; // Tăng số lượng hình chữ nhật hiện tại
            return true;
        }
        return false; // Nếu không thể thêm
    }

    // 3.3 Phương thức lưu một hình chữ nhật vào file
    public boolean addRectangleToFile(Rectangle objRectangle, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(objRectangle); // Ghi đối tượng vào file
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false; // Nếu có lỗi xảy ra
        }
    }

    // 3.4 Phương thức trả về đối tượng hình chữ nhật từ file
    public Rectangle getRectangleFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (Rectangle) ois.readObject(); // Đọc đối tượng từ file và trả về
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null; // Nếu có lỗi xảy ra
        }
    }

    // 3.5 Phương thức lưu danh sách hình chữ nhật vào file
    public boolean addRectangleListToFile(Rectangle[] listRectangle, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(listRectangle); // Ghi mảng đối tượng vào file
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false; // Nếu có lỗi xảy ra
        }
    }

    // 3.5 Phương thức trả về danh sách hình chữ nhật trong file
    public Rectangle[] getAllRectangleFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (Rectangle[]) ois.readObject(); // Đọc mảng đối tượng từ file và trả về
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null; // Nếu có lỗi xảy ra
        }
    }
}

