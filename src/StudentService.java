public interface StudentService {
    void addStudent(Student student);
    Student getStudent(int id);
    void updateStudent (int id, int age);
    void deleteStudent (int id);
}
