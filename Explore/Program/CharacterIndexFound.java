import java.util.*;

public class CharacterIndexFound {

    public static void main(String[] arg) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = s.nextLine();
        System.out.println("Enter Char to find : ");
        char c = s.next().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                System.out.println(i);
                break;
            }

        }

    }

}