import java.util.*;

public class AmstrongNumber{

public static void main(String[] args){
Scanner s= new Scanner(System.in);
int number=s.nextInt();
int tempN=number;
int amNum=0;
String st=""+number;
int pow=st.length();
while(tempN!=0){
int currentNum=tempN%10;
int count=currentNum;
amNum+=Math.pow(currentNum,pow);
System.out.println("Current Number"+currentNum+"amNum"+amNum);
tempN=tempN/10;
}
if(number==amNum){
System.out.println("Amstrong"+amNum);
}
else{
System.out.println("Not Amstrong"+amNum);

}
}

}