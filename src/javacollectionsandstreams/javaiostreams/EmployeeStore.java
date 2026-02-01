package javacollectionsandstreams.javaiostreams;

import java.io.*;
import java.util.*;

class Employee implements Serializable {
    int id; String name, dept; double salary;
    Employee(int i,String n,String d,double s){id=i;name=n;dept=d;salary=s;}
}

public class EmployeeStore {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"A","IT",50000));
        list.add(new Employee(2,"B","HR",40000));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emp.dat"))) {
            oos.writeObject(list);
        } catch (IOException e) { e.printStackTrace(); }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("emp.dat"))) {
            List<Employee> read = (List<Employee>) ois.readObject();
            for (Employee e : read)
                System.out.println(e.id+" "+e.name+" "+e.dept+" "+e.salary);
        } catch (IOException | ClassNotFoundException e) { e.printStackTrace(); }
    }
}