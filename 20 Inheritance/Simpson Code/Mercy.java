// Hero is called the super class
//Mercy is a subclass of Hero

public class Mercy extends Hero { 
     
     public String weapon;
     
     public Mercy(){
          super();      //super() keyword refers to the superclass constructor
                        // super() must be on the first line of the constructor
          System.out.println(super.weapon);
          this.weapon = "staff";
          
     }
     
     public void jump(){  //method overriding
          System.out.println("Your Mercy has jumped and is now falling like a feather.");
     }
     
     public void rez(){
          System.out.println("Heroes Never Die!, except me");
     }
     
     
}