class employee implements Comparable<employee>
{
    int age, salary;
    String name;

    public employee(int age, int salary, String name)
    {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;

    }

    @Override
    public String toString() {
        return "employee{" +
                "age=" + age +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }



    @Override
    public int compareTo(employee o)
    {
        return this.age - o.age;
    }
}

