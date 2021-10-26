import java.io.Serializable;

public class Employee implements Serializable {
    private Speciality speciality;
    private String name;

    public Employee(Speciality speciality, String NAME) {
        this.speciality = speciality;
        this.name = NAME;
    }

    public Speciality getDoWork() {
        return speciality;
    }

    public String getName() {
        return name;
    }

    public void setDoWork(Speciality doSpeciality) {
        this.speciality = doSpeciality;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "speciality=" + speciality.getClass().getSimpleName() +
                ", name='" + name + '\'' +
                '}';
    }

    //----------------------------------------------------------------------------------------------------------------------

    public void doWork(String concreteWork) {
        speciality.doWork(concreteWork);
    }

}
