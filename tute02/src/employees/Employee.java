package employees;

import java.util.Objects;

public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    /**
     * Gets the name of the employee
     * @return String: name of employee
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the employee's salary
     * @return int: salary of employee
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Sets the employee's name
     * @param name String: new name of employee
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the employee's salary
     * @param name String: new salary of employee
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Class: " + getClass().getName() + " Name: " + name + " Salary: "
            + salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Employee other = (Employee) obj;
        if (other.salary == salary && Objects.equals(name, other.name)) return true;
        return false;
    }
}
