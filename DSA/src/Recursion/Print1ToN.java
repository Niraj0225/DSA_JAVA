package Recursion;

public class Print1ToN {

    static void printNNumber(int n,int count){

        if (count> n){
            return;
        }
        System.out.println(count);

        printNNumber(n, count+1);

    }

    static void numberPrint(int n){
        if (n==0){
            return;
        }
        numberPrint(n-1);
        System.out.println(n + " ");
    }
    static void main() {
//        printNNumber(5,1);
        numberPrint(5);
    }
}
