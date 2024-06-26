package Week4;

public class breakLabaledTask {
    public static void main(String[] args) {
        /*
         * Loop from -5 to 5 break the loop if possible
         */
        int counter=-5;
        while (true) {
            System.out.println(counter);
            counter++;
            if(counter>5){
                break;
            }
        }
        /*
         * loop from 1-20 and print even nonly use continue to complete
         */
        counter=0;
        while (counter<21) {
            counter++;
            if(counter%2!=0){
                continue;
            }            
            System.out.println(counter);
        }
    }
}
