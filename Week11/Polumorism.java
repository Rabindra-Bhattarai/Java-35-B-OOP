package Week11;

public class Polumorism {
    public static void main(String[] args) {
    
}
//method overriding -compiletime POLUYMIRISM    
//mAKE SAME functions multiple times with diff parameter

class MathOperation{
    int add(int num1, int num2){
        return num1+ num2;

}
//1. changing the numbre of the parameter
int add(int num1, int num2, int num3){
    return num1+ num2+ num3;
}

//2. changing the data type of paramtere
double add(double num1, double num2){
    return num1+ num2;
}

//note:
void add(){
    System.out.println("Invalid Opearation");
    }
}

