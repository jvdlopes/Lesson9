
package interfaceEx1;


public class Werewolf implements Monster{
    
    private String name;
    
    public Werewolf(String n){
        name = n;
    }

    @Override
    public void attack() {
        System.out.println("Werewolf is clawing up your back!");
    }

    @Override
    public void identify() {
        System.out.println("I am " + name + " the Werewolf.");
    }
    
}
