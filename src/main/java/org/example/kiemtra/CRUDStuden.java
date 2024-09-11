package org.example.kiemtra;

import java.io.*;

public class CRUDStuden {
    private Student[] studentList;
    private static int numberOfStudent;

    // Constructor
    public CRUDStuden() {
        this.studentList = new Student[100];  // Khởi tạo mảng chứa tối đa 100 sinh viên
        numberOfStudent = 0;  // Số sinh viên hiện tại trong danh sách là 0
    }

    // Thêm một sinh viên vào danh sách
    public boolean addStudent(Student objStudent) {
        if (numberOfStudent < studentList.length) {
            studentList[numberOfStudent++] = objStudent;
            return true;
        }
        return false;
    }

    // Lưu một sinh viên vào file
    public boolean addStudentToFile(Student objStudent, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(objStudent);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Đọc một sinh viên từ file
    public Student getStudentFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (Student) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Lưu danh sách sinh viên vào file
    public boolean addStudentListToFile(Student[] listStudent, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(listStudent);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Đọc danh sách sinh viên từ file
    public Student[] getAllStudentFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (Student[]) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}