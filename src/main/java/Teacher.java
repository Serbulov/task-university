import java.io.Serializable;

public class Teacher implements Speciality, Serializable {

    @Override
    public void doWork(String concreteWork) {
        System.out.println("Преподаватель проводит " + concreteWork);
    }
}