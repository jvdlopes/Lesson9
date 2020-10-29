
package employeeProject.assignment;

public class PTEmployee extends Employee{
    public PTEmployee(){
        super();
    }
    
    //complete getPay
    @Override
    public double getPay() {
        //update totalPay
        //over 40 hours is double rate
        totalPay += rate*hours; //change this
        return hours * rate;
    }
    
}
