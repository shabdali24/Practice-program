package Collection.List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//class Employee{
//    private String name;
//    private int salary;
//
//    public String getName() {
//        return name;
//    }
//
//    public int getSalary() {
//        return salary;
//    }
//    public Employee(String name, int salary) {
//        this.name = name;
//        this.salary = salary;
//    }
//    public String toString(){
//        return "Name : "+name +", Salary :"+salary;
//    }
//
//}

public class Employee1 {

    public static void main(String[] args) {

//        List <Employee> employee = new ArrayList<Employee>();
//        employee.add(new Employee("Rajesh",30000));
//        employee.add(new Employee("Shabdali",50000));
//
//        List<Employee> emp = employee.stream().filter(s-> s.getSalary()>40000).collect(Collectors.toList());
//        System.out.println(emp);

        Map<String, Integer> map = new HashMap<>();
        map.put("Rajesh",10000);
        map.put("Shabdali",20000);

        Map<String, Integer> map1 = map.entrySet().stream()
                .filter(s-> s.getValue()>15000)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        map1.forEach((name, salary)-> System.out.println("Name : "+name + ", Salary : "+salary));

    }
}
