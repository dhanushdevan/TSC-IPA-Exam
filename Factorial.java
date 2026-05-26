import java.util.*;

public class Factorial{
public static void main(String[] args){

Scanner s= new Scanner(System.in);

System.out.print("Enter number: ");
int number=s.nextInt();
for(int i=0;i<number;i++){
System.out.print(" "+fibo(i));
}
System.out.println("FactNum"+fibo(number));
}

public static int fibo(int num){

if(num<=2){
return num;
}

return fibo(num-1)+fibo(num-2);

}
}