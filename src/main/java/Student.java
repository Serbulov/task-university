import java.io.Serializable;

public class Student implements Speciality, Serializable {

    @Override
    public void doWork(String concreteWork) {
        System.out.println("Студент выполняет " + concreteWork);
    }
}
