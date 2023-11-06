/**
 * 课后练习
 * Student类（和课上类似 不需要密码）
 * 主类：写一个方法  findY(Student...s)(可变参数)
 *        该方法接收若干个学生 输出年龄最小的学生信息
 * 主方法：新建若干个学生对象；调用findY方法.
 *
 * @Author: FoskyM
 * @Date: 2023/11/06 22:10
 */
package Work6;

class Student {
    String school;
    String name;
    int age;
    public void set(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }
}
public class Main {
    public static void findY(Student...s) {
        Student y = null;

        for (Student student : s) {
            if (y == null || student.age < y.age) {
                y = student;
            }
        }
        System.out.println("年龄最小的学生信息");
        System.out.println("姓名：" + y.name);
        System.out.println("年龄：" + y.age);
        System.out.println("学校：" + y.school);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.set("张三", 18, "中国计量大学");
        s2.set("李四", 19, "中国计量大学");
        s3.set("王五", 20, "中国计量大学");

        findY(s1, s2, s3);

    }
}
