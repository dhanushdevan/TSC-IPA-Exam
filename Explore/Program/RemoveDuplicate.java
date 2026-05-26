import java.util.*;
public class RemoveDuplicate{

public static void main(String[] args){

String str="experience";
String set="";
for(int i=0;i<str.length();i++){
if(set.indexOf(str.charAt(i))==-1){
set+=str.charAt(i);
}
}
System.out.println(set);
}

}