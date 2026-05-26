import java.util.*;
public class StackParanthesis{

public static void main(String[] args){
String s="([]){}((";
System.out.println("Paranthesius"+stackCheck(s));
}
static boolean stackCheck(String s){
Stack<Character> stack= new Stack<Character>();

if(s.length()%2==1){
return false;
}
for(int i=0; i<s.length();i++){
char c=s.charAt(i);
if("({[".indexOf(c)!=-1){
stack.push(c);
}else{
char c1=stack.pop();
System.out.println("Current value = "+c+" Pop value = "+c1);
if( (c==')' && c1=='(') ||  (c==']' && c1=='[') || (c=='}' && c1=='{')){
}else{
return false;
}
}
}
return stack.isEmpty();
}
}