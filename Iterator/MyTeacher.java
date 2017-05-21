package iteratorClasses;

import java.util.Iterator;

/**
 *
 * @author masaki-kibashi
 */
public class MyTeacher extends Teacher {
    
    private StudentList studentList;
    
    @Override
    public void createStudentList() {
        
        studentList = new StudentList(5);
        studentList.add(new Student("akai", 1));
        studentList.add(new Student("akaba", 2));
        studentList.add(new Student("okada", 2));
        studentList.add(new Student("nishimori", 1));
        studentList.add(new Student("nakanomori", 2));
    }
    
    @Override
    public void callStudents() {
//        int size = studentList.getLastNum();
//        for (int i = 0; i < size; i++) {
//            System.out.println(studentList.getStudentAt(i).getName());
//        }        
        Iterator iterator = studentList.iterator();
        while (iterator.hasNext()) {
            System.out.println(((Student)iterator.next()).getName());
        }
    }
}
