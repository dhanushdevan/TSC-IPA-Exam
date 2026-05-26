public class SpaceCharacterCount {

    public static void main(String[] args) {

        String sentence = "Hi I am a Student";
        int spaceCount = 0;
        int wordCount = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ')
                spaceCount++;
            else {
                int charN = sentence.charAt(i) - 0;
                if ((charN >= 65 && charN <= 90) || (charN >= 97 && charN <= 122)) {
                    wordCount++;
                }
            }
        }
        System.out.println(spaceCount + " " + wordCount);
    }
}