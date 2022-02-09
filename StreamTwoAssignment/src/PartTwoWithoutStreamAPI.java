import java.util.*;  
class Employees{  
    int salary;  
    String name;  
    int age;  
    public Employees(int salary, String name, int age) {  
        this.salary = salary;  
        this.name = name;  
        this.age = age;  
    }  
}  
public class PartTwoWithoutStreamAPI {
	public static void main(String[] args) {  
        List<Employees> employeeList = new ArrayList<Employees>();  
        //Adding Employee  
        employeeList.add(new Employees(1000,"Harry",25));  
        employeeList.add(new Employees(2000,"Dave",30));  
        employeeList.add(new Employees(3000,"Larry",28));  
        employeeList.add(new Employees(4000,"Sam",28));  
        employeeList.add(new Employees(5000,"Alex",90));  
        List<Integer> employeeSalaryList = new ArrayList<Integer>();  
        for(Employees employee: employeeList){  
              
            // filtering data of list  
            if(employee.salary>1000){  
                employeeSalaryList.add(employee.salary);    // adding salary to a employeeSalaryList  
            }  
        }  
        System.out.println(employeeSalaryList);   // displaying data  
        
        List<String> employeeNameList = new ArrayList<String>();  
        for(Employees employee: employeeList){  
              
            // filtering data of list  
            if(employee.name.startsWith ("B") || employee.name.startsWith("D")){  
                employeeNameList.add(employee.name);    // adding name to a employeeNameList  
            }  
        }  
        System.out.println(employeeNameList);   // displaying data  
        
        List<Integer> employeeAgeList = new ArrayList<Integer>();  
        for(Employees employee: employeeList){  
              
            // filtering data of list  
            if(employee.age>30){  
                employeeAgeList.add(employee.age);    // adding salary to a employeeSalaryList  
            }  
        }  
        System.out.println(employeeAgeList);   // displaying data  
    }  
}
