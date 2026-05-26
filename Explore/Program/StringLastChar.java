public class StringLastChar{

public static void main(String[] args){

String names="Hay3 java learns";
String[] s=names.split(" ");
String output="";
for(int i=0;i<s.length;i++){
String iterator=s[i];
int charN=iterator.charAt(iterator.length()-1)-0;
if(charN>=48 && charN<=57){}
else{
System.out.println("Char" +charN);
output+=iterator.charAt(iterator.length()-1);}
}
System.out.println(output);
}

}