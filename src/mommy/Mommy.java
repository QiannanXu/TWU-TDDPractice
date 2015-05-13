package mommy;

public class Mommy {
    public String convertString(String word) {
        String result = "";
        int counter = 0;

        for(int i=0; i<word.length(); i++){

            char character = word.charAt(i);

            if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'){
                counter ++;
            }
        }

        if(counter * 100 / word.length() > 30){
            for(int i=0; i<word.length(); i++){
                result += convertSingleCharacter(word.charAt(i)+"");
            }
        }else{
            result = word;
        }
        return result;
    }

    private String convertSingleCharacter(String character) {
        String result = "";
        if(character.isEmpty()){
            result = "";
        }

        if(character.equals("a") || character.equals("e") || character.equals("i") || character.equals("o") || character.equals("u")){
           result = "mommy";
        }else{
            result = character;
        }
        return result;
    }
}
