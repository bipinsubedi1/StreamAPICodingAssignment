import java.util.*;  
import java.util.stream.Collectors;  
class Employee{  
    int salary;  
    String name;  
    int age;  
    public Employee(int salary, String name, int age) {  
        this.salary = salary;  
        this.name = name;  
        this.age = age;  
    }  
}  
public class PartOne {
	public static void main(String[] args) {  
        List<Employee> employeeList = new ArrayList<Employee>();  
        //Adding Employee 
        employeeList.add(new Employee(1000,"Harry",25));  
        employeeList.add(new Employee(2000,"Dave",30));  
        employeeList.add(new Employee(3000,"Larry",28));  
        employeeList.add(new Employee(4000,"Sam",28));  
        employeeList.add(new Employee(5000,"Alex",90)); 
        List<Integer> employeeSalaryList2 = employeeList.stream()  
                .filter(s -> s.salary > 1000)// filtering data  
                .map(s->s.salary)        // fetching salary  
                .collect(Collectors.toList()); // collecting as list  
System.out.println(employeeSalaryList2);

List<String> employeeNameList2 = employeeList.stream()  
.filter(n -> n.name.startsWith("B") || n.name.startsWith("D"))// filtering data  
.map(n->n.name)        // fetching name  
.collect(Collectors.toList()); // collecting as list  
System.out.println(employeeNameList2);

        List<Integer> employeeAgeList2 = employeeList.stream()  
                                     .filter(a -> a.age > 30)// filtering data  
                                     .map(a->a.age)        // fetching age  
                                     .collect(Collectors.toList()); // collecting as list  
        System.out.println(employeeAgeList2);  
    }  
}
