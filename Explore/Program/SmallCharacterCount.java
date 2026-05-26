public class SmallCharacterCount{
public static void main(String[] args){

String name="DataBaSe";

int smallCharacter=0;
for(int i=0;i<name.length();i++){
int charN=name.charAt(i)-0;
if(charN>=97 && charN<=122){
smallCharacter++;
}

}
System.out.println("Count SmallLetter :"+smallCharacter);
}
}