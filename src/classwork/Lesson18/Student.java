//package classwork.Lesson18;
//
//import javax.xml.bind.annotation.*;
//
//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlRootElement   // первое, что будет записано в xml
//public class Student {
//     private int id;
//    @XmlElement(name = "nick")
//    private String name;
//    private String gender;
//    private Course course;
//
//    public Student() {
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public Course getCourse() {
//        return course;
//    }
//
//    public Student(int id, String name, String gender, Course course) {
//        this.id = id;
//        this.name = name;
//        this.gender = gender;
//        this.course = course;
//    }
//
//    public void setId(int id) {
//
//        this.id = id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public void setCourse(Course course) {
//        this.course = course;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", gender='" + gender + '\'' +
//                ", course=" + course +
//                '}';
//    }
//}
