public class Word {

    enum PartOfSpeech{
        art, conj, adj, adv, det, prep, num, noun, verb, pro, inter, not, there, to
    }

    // Rank,  Word,Part of speech,Frequency,Dispersion

    String word;
    int rank;
    PartOfSpeech partOfSpeech;
    int frequency;

    public Word() {
        word = "";
    }

    public Word(String word){
        this.word = word;
    }

    public Word(String word, int rank, PartOfSpeech partOfSpeech, int frequency){
        this.word = word;
        this.rank = rank;
        this.partOfSpeech = partOfSpeech;
        this.frequency = frequency;
    }

    //art, conj, adj, adv, det, prep, num, noun, verb, pro, inter, not, there, to
    public PartOfSpeech partOfSpeechConverter(String partOfSpeechString) {

        switch ( partOfSpeechString.trim() ) {
            case "art":
                return PartOfSpeech.art;

            case "conj":
                return PartOfSpeech.conj;

            case "adj":
                return PartOfSpeech.adj;

            case "adv":
                return PartOfSpeech.adv;

            case "det":
                return PartOfSpeech.det;

            case "prep":
                return PartOfSpeech.prep;

            case "#":
                return PartOfSpeech.num;

            case "n":
                return PartOfSpeech.noun;

            case "v":
                return PartOfSpeech.verb;

            case "pro":
                return PartOfSpeech.pro;

            case "!":
                return PartOfSpeech.inter;

            case "not":
                return PartOfSpeech.not;

            case "there":
                return PartOfSpeech.there;

            case "to":
                return PartOfSpeech.to;

            default:
                System.err.println("Invalid part of speech code "+ partOfSpeechString);
                return null;


        }
    }

}
