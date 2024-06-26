package Week3.Tasks;

import java.util.Scanner;

public class Task6 {
//Write a JAVA program to input any alphabet and check whether it is vowel or consonant.
public static void main(String[] args) {
    char a;
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter alphabet");
    a=scan.next().charAt(0);
    System.out.print(a);
    if(a=='a' || a=='A' || a=='e' || a=='E' ||a=='o' || a=='O' ||a=='i' || a=='I' ||a=='u' || a=='U' ){
        System.out.println(" is vowel");
    }
    else{
        System.out.println(" is consonant");
    }
    scan.close();
}
}
