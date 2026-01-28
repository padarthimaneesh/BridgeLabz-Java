package javacollectionsandstreams.javagenerics;

abstract class CourseType {
    String courseName;

    CourseType(String name) {
        courseName = name;
    }

    abstract void evaluate();
}

class ExamCourse extends CourseType {
    ExamCourse(String name) {
        super(name);
    }

    void evaluate() {
        System.out.println(courseName + " evaluated by exam");
    }
}

class Course<T extends CourseType> {
    T course;

    Course(T course) {
        this.course = course;
    }

    void showEvaluation() {
        course.evaluate();
    }
}

public class UniversityCourse {
    public static void main(String[] args) {
        Course<ExamCourse> c = new Course<>(new ExamCourse("Maths"));
        c.showEvaluation();
    }
}