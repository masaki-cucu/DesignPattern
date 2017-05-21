package iteratorClasses;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author masaki-kibashi
 */
public class StudentList implements Aggregate {
//    protected Student[] students;
    protected ArrayList students;
//    private int last = 0;
    
    public StudentList(){}
    public StudentList(int studentCount) {
//        this.students = new Student[studentCount];
        this.students = new ArrayList(studentCount);
    }
    
    public void add(Student student) {
//        students[last] = student;
//        last++;
        students.add(student);
    }
    
    public Student getStudentAt(int index) {
//        return students[index];
        return (Student)students.get(index);
    }
    
    public int getLastNum() {
//        return last;
        return students.size();
    }
    
    @Override
    public Iterator iterator() {
        return new StudentListIterator(this);
    }
    
}
