import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentServiceHandler();
        while (true) {

            System.out.println("1.Telebeni add etmek");
            System.out.println("2.Telebeni get etmek");
            System.out.println("3.Telebeni update etmek");
            System.out.println("4.Telebeni delete etmek");
            int a = scanner.nextInt();

            switch (a){
                case 1:
                    System.out.println("Id daxil et");
                    int id=scanner.nextInt();
                    System.out.println("Adi daxil edin");
                    String name = scanner.next();
                    System.out.println("Yashini daxil edin");
                    int age = scanner.nextInt();
                    studentService.addStudent(new Student(id,name,age));
                    break;

                case 2:
                    System.out.println("Id daxil edin");
                    id = scanner.nextInt();
                    System.out.println(studentService.getStudent(id));
                    break;
                case 3:
                    System.out.println("Id daxil edin");
                    id = scanner.nextInt();
                    System.out.println("Age daxil et");
                    age = scanner.nextInt();
                    studentService.updateStudent(id,age);
                    break;

                case 4:
                    System.out.println("Id daxil edin");
                    id = scanner.nextInt();
                    studentService.deleteStudent(id);
                    break;
                default:
                    System.out.println(" Yalnish daxil etdiniz");
            }
        }

    }
}