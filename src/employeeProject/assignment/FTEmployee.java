
package employeeProject.assignment;


public class FTEmployee extends Employee{

    public FTEmployee(){
        super();
    }
    
    //complete getPay
    @Override
    public double getPay() {
        //update totalPay
        //over 40 hours is double rate
        if (hours <=40 && hours >= 1){
            totalPay += rate*hours; //change this
            return hours * rate;
        }
        else if(hours >= 41 && hours <= 60){
            totalPay += (hours - 40) * (2 *rate) + (40 * rate);
            return (hours - 40) * (2 *rate) + (40 * rate);
        }
                     
        return 0.0;
    }
    
}
