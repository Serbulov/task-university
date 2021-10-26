import java.io.Serializable;

public class Assistant implements Speciality, Serializable {
    @Override
    public void doWork(String concreteWork) {
        System.out.println("Лаборант проводит " + concreteWork);
    }
}
