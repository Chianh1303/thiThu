package org.example.kiemtra;

import java.io.FileNotFoundException;

public class AppStudent {
    public static void main(String[] args) {
        // Tạo đối tượng CRUDStudent
        CRUDStuden crudStudent = new CRUDStuden();

        // 1. Tạo 3 đối tượng sinh viên
        Student student1 = new Student(1, "Chí Anh", "13/3/2005",9.0);
        Student student2 = new Student(2, "Chí Anh", "13/3/2005",9.8);
        Student student3 = new Student(1, "Chí Anh", "13/3/2005",9.9);


        // 2. Lưu từng đối tượng vào mảng danh sách sinh viên sử dụng phương thức addStudent()
        crudStudent.addStudent(student1);
        crudStudent.addStudent(student2);
        crudStudent.addStudent(student3);

        // 3. Lưu từng đối tượng vào file sử dụng phương thức addStudentToFile()
        crudStudent.addStudentToFile(student1, "student1.dat");
        crudStudent.addStudentToFile(student2, "student2.dat");
        crudStudent.addStudentToFile(student3, "student3.dat");

        // 4. Hiển thị tất cả thông tin của file sử dụng phương thức getStudentFromFile()
        Student studentFromFile1 = crudStudent.getStudentFromFile("student1.dat");
        System.out.println(studentFromFile1);

        Student studentFromFile2 = crudStudent.getStudentFromFile("student2.dat");
        System.out.println(studentFromFile2);

        Student studentFromFile3 = crudStudent.getStudentFromFile("student3.dat");
        System.out.println(studentFromFile3);

        // 5. Lưu mảng đối tượng sinh viên vào file sử dụng phương thức addStudentListToFile()
        Student[] students = {student1, student2, student3};
        crudStudent.addStudentListToFile(students, "students.dat");

        // 6. Hiển thị tất cả thông tin của file sử dụng phương thức getAllStudentFromFile()
        Student[] allStudentsFromFile = crudStudent.getAllStudentFromFile("students.dat");
        if (allStudentsFromFile != null) {
            for (Student student : allStudentsFromFile) {
                System.out.println(student);
            }
        }
    }
}

