package Week3;

public class task1 {
    public static void main(String[] args) {
        /*
         * Task
         * Coonsider the ffollowing marking
         * calculate the total and avg in a variable 
         * if any of the marking is less than 35, print fail 
         * if avg is less than 60, print third div
         * if avg is less than 70, print second dic 
         * if avg is les than 80, print first division
         * if avg is equal and greater than 80, print distinction
         * if avg is less than 0 or more than 100,print invalid
         */
        int science=35,english=55,math=89,total=0,avg=0;
        total= science+english+math;
        avg= total/3;
        if(avg > 0 || avg<100){
            if(math<25 || science <35 || english< 35){
                System.out.println("Fail");               
            }
            else{
                if(avg<60){
                    System.out.println("third division");               
                }   
                else if(avg<70){
                    System.out.println("second division");               
                }
                else if(avg<80){
                    System.out.println("first division");               
                }                
                else{
                    System.out.println("distinction");
                }
            }
        }        
        else{
            System.out.println("Invalid input");
        }
    }
}