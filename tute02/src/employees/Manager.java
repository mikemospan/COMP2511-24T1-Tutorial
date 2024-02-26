package employees;

import java.time.LocalDateTime;
import java.util.Objects;

public class Manager extends Employee {
    private LocalDateTime hireDate;

    public Manager(String name, int salary, LocalDateTime hireDate) {
        super(name, salary);
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return super.toString() + " Hire date: " + hireDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Manager manager = (Manager) obj;
        if (Objects.equals(hireDate, manager.hireDate)) return true;
        return false;
    }
}
