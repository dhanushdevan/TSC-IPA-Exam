public class DecimalBinary{

public static void main(String[] args){
 int number=10;
String s="";
while(number>0){
s+=number%2;
number=number/2;
}
System.out.println(s);

int result=0;
for(int i=0;i<s.length();i++){
int dig=s.charAt(i)-'0';
result=result*2+dig;
}
System.out.println(result);
}
}