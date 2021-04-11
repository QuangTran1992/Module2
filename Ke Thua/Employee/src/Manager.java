public class Manager extends Employee {
    private int bonus;

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

//    @Override
//    public void display() {
//        super.display();
//        System.out.println("bonus:" + bonus);
//    }

//    @Override
//    public String toString() {
//        return "Manager{" +
//                "bonus=" + bonus +
//                '}';
//    }

    @Override
    public void display() {
        super.display();
        System.out.println("bonus: "+this.bonus);
//        System.out.println("Name: " + this.name);
//        System.out.println("salary: " + this.salary);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + bonus +
                '}';
    }
}

