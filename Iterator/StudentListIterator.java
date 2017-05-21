package iteratorClasses;

import java.util.Iterator;

/**
 *
 * @author masaki-kibashi
 */
public class StudentListIterator implements Iterator {
    private StudentList studentList;
    private int index;
    
    public StudentListIterator(StudentList list) {
        this.studentList = list;
        this.index = 0;
    }
    
    @Override
    public boolean hasNext() {
        if (studentList.getLastNum() > index)
            return true;
        else {
            return false;
        }
    }
    
    @Override
    public Student next() {
        Student s = studentList.getStudentAt(index);
        index++;
        return s;
    }
    
}
