package DependencyInversionPrinciple;

public class Employee {

    private EmailNotification emailNotification;

    public Employee(EmailNotification emailNotification){
        this.emailNotification = emailNotification;
    }

    public void notifyUser(){
        emailNotification.notifyUser();
    }

}

//  Here the main fault is dependency of high module class over low module class.
// To fix this we have to depend on abstraction principles over class inheritance.
