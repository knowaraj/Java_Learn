package COLLEGE;

class Employee{
    String name;
    int salary;
    int phone;

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
        System.out.println("Phone: "+phone);
    }
}
class ClassDemo{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name="john";
        e1.phone=99999;
        e1.salary=10000;
        e1.display();
    }
}