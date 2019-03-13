public class HeroRunner{
     
     public static void main(String[] args){
        // Hero LittleTimmy = new Hero();
         //LittleTimmy.jump();
         
         Mercy tracer = new Mercy();
         tracer.jump();
         System.out.println( tracer.weapon );
         tracer.rez();
        
         /*
         //use a super class reference variable to refer to a sub class object
         Hero brian = new Mercy();
         brian.jump();
         System.out.println( brian.weapon );
         //brian.rez();      will not run because rez() isn't defined in 
         */
     }
}