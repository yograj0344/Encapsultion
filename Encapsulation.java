class sim  // Encapsulation:-Encapsulation in Java is a powerful mechanism for storing the data members and data methods of a class together
{
    private String serviceprovider; //  Access modifiers
    private long simNo;             //  1 public :- any  access  
    private double balance;         //  2 default :- only access for package name
    String color;                    // 3 protected :-  only access sub class
                                    //  4  private :- only access for class  but help to the getter and setter method
     
    sim(String serviceprovider,long simNo, double balance,String color)  // constructor is a special method that is used to initialize to object  three type of constructor 
    {
        this.serviceprovider=serviceprovider;  // this keyword  refers to the current object in a  method or constructor
        this.simNo=simNo;
        this.balance=balance;
        this.color=color;

    }
    public String getserviceprovider()  // getter method   returns the valus of the attribute
    {
        return serviceprovider;

    }
    public void setserviceprovider(String serviceprovider) //  setter  method to use  sets the value.
    {
        this.serviceprovider=serviceprovider;
    }
    public long getsimNo()
    {
        return simNo;
    }
    public void setsimNo(long simNo)
    {
        this.simNo=simNo;
    }
    public double getbalance()
    {
        return balance;
    }
    public void setbalance(double balance)
    {
        this.balance=balance;
    }
    public void sinDetails()  // method
    {
        System.out.println(serviceprovider);
        System.out.println(balance);
        System.out.println(simNo);
        System.out.println(color);
    }
}
 public class Encapsulation
 {
    public static  void main(String[] args) // main method
    {
        sim s1=new sim("airtel",7709187351L,499,"red"); // creat object
        System.out.println(s1.getserviceprovider());
        System.out.println(" Sim NO="+s1.getsimNo());
        s1.setserviceprovider("jio");
        System.out.println("serviceprovider="+s1.getserviceprovider());
        System.out.println("sim color="+s1.color);
        System.out.println(" balance="+s1.getbalance());
        // s1.sinDetails();
    }
 }