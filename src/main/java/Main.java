import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Реализация фундаментальных паттернов:
        //      Immutable -
        //      Interface +
        //      Abstract Superclass -
        //      Marker Interface + (Serializable объекты)
        //      Functional Design +
        //      Delegation pattern +

        Employee employee1 = new Employee(new Teacher(), "Victor");
        Employee employee2 = new Employee(new Assistant(), "Dmitriy");
        Employee employee3 = new Employee(new Student(), "Katya");

        employee1.doWork("практическое занятие по ООП");
        employee2.doWork("ремонт ПК");
        employee3.doWork("посещение лекционного занятия");


        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);


    //------------------Часть просто для примера сериализации. Понятно, что лучше использовать Memento------------------
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employees.dat"))) {
            oos.writeObject(employees);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employees.dat"))) {
            List<Employee> e = (List<Employee>) ois.readObject();
            System.out.println(e);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    //------------------------------------------------------------------------------------------------------------------
    }
}
