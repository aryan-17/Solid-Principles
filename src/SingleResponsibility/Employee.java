package SingleResponsibility;



public class Employee {

    private String name;
    private int salary;

    public void updateSalary(int salary){ /* Update salary in Database */ }

    public void sendMail(){ /* Mail Service Implementation */ }

}


//    The main flaw here is implementation of both mail service and update in Db
//          ˀ  1. To correct this we have to make a different class of Employee methods and a class for Mail Service.