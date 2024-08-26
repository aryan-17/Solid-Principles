import DependencyInversionPrinciple.Efficient.Employee;
import DependencyInversionPrinciple.Efficient.Notification;

public class EmailNotification implements Notification {
    public void notifyUser(){
        //implement notification via email
    }
}

public void main(String[] args) {
    Notification notification = new EmailNotification();
    Employee employee = new Employee(notification);
    employee.notifyUser();
}

//  Here Employee doesn't directly depend on Email Notification but depends on abstraction through notification interface.

//  Employee is not dependent on any concrete implementation, rather, it depends only on the abstraction (notification interface).

//  If we need to change the notification mode, we can create a new implementation and pass it to the Employee.