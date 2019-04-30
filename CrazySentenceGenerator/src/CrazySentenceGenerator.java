import java.util.ArrayList;

public class CrazySentenceGenerator {

    /*
    72,   now,adv,605997,0.94
    73,   than,conj,579757,0.97
    74,   like,prep,568850,0.96
    75,   other,adj,547799,0.97
     */

    ArrayList<Word> dictionary = new ArrayList<>();

    // read file and add words to dictionary
    public void parseDictionaryFromFile(String filePath) {



    }

    public String getCrazySentence(String pattern) {

        // parse the pattern\

        // split the pattern by '+'
        // for each token in the pattern
        // find the part of speech (enum value) for that code
        // save part of speech to data structure ( ArrayList<PartOfSpeech> )

        // foreach part of speech in pattern
            // find a random word from the dictionary of that part of speech.
            // add that word to the crazy sentence

        return "";
    }


    /***
     *
     * @param partOfSpeech the part of speech enum value
     * @return Word object from dictionary
     */

    public Word getRandomWord(Word.PartOfSpeech partOfSpeech) {



        return null;
    }

    public double crazinessScore(String sentence){

        return 0;
    }


}
