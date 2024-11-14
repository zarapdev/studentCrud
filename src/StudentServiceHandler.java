public class StudentServiceHandler implements StudentService {
    Student[] studentArr = new Student[100];
    int count = 0;

    @Override
    public void addStudent(Student student) {
        if (studentArr.length > count) {
            studentArr[count] = student;
            count++;
            System.out.println("Telebe elave olundu");
        } else {
            System.out.println("Bosh yer movcud deyil");
        }

    }

    @Override
    public Student getStudent(int id) {
        for (int i=0; i<studentArr.length; i++){
            if (studentArr[i]!=null && studentArr[i].getId()==id){
                return studentArr[i];

            }
        }
        return null;
    }

    @Override
    public void updateStudent(int id, int age) {
        for (int i=0; i<studentArr.length; i++){
            if (studentArr[i]!=null && studentArr[i].getId()==id){
                studentArr[i].setAge(age);
                System.out.println(" Telebe update olundu");
            }
        }

    }

    @Override
    public void deleteStudent(int id) {
        for (int i=0; i<studentArr.length; i++){
            if (studentArr[i]!=null && studentArr[i].getId()==id){
               studentArr[i]=null;
                System.out.println(id + " id-li telebe silindi");

            }
        }

    }

    // git add .
    // git commit --amend --no-edit
    // git push -f


}
