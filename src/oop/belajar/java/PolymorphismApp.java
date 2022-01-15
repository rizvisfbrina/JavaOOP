package oop.belajar.java;

public class PolymorphismApp {
    public static void main(String[] args) {

        Employee employee = new Employee("Opi");
        employee.sayHello("pii");

        //perubahan bentuk dari employee menjadi Manager
        //penggunaan method tetap sesuai dengan bentuk yg pertama/class parent
        employee = new Manager("Opi");
        employee.sayHello("ooo");

        //perubahan bentuk dari employee menjadi VP
        employee = new VicePresident("Opi");
        employee.sayHello("iii");

        sayHello(new Employee("Opi"));
        sayHello(new Manager("Pii"));
        sayHello(new VicePresident("OOo"));
    }

    static void sayHello(Employee employee){
        //instanceof untuk check tipe data
        if(employee instanceof VicePresident){
            //type casts (konversi tipe data)
            VicePresident vp = (VicePresident) employee;
            System.out.println("Hello VP " + vp.name);
        }else if (employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        }else{
            System.out.println("Hello " + employee.name);
        }
    }

}
