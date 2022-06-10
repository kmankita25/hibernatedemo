package org.example;

public class pojo {
    private String name;
    private int Id;
    private float salary;
    private String company;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public pojo(String name, int id, float salary, String company) {
        this.name = name;
        Id = id;
        this.salary = salary;
        this.company = company;
    }

    public pojo() {
    }

    @Override
    public String toString() {
        return "pojo{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                '}';
    }
}
