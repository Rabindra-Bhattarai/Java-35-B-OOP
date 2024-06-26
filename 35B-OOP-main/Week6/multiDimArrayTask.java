package Week6;

public class multiDimArrayTask {
    public static void main(String[] args) {
        String[][] n=new String[3][3];
        String index="";
        n[0][0]="Sarjak";
        n[0][1]="Ayush";
        n[0][2]="Rabi";
        n[1][0]="Yudip";
        n[1][1]="Utsav";
        n[1][2]="Bibek";
        n[2][0]="Rabina";
        n[2][1]="Kimti";
        n[2][2]="Sneha";
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(n[i][j]);
                if(n[i][j]=="Kimti"){
                    index= "["+i+"]"+"["+j+"]";
                }
            }
        }
        System.out.println("Kimti is in index "+index);
    }


}
