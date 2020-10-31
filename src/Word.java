
public class Word {
    private StringBuilder finalString = new StringBuilder();

    public Word() {
    }

    public void shuffle(StringBuilder wordOfString, char punctuationMarks) {
        new StringBuilder();

        for(int j = 0; j < wordOfString.length() / 2; ++j) {
            if (j != 0 && j != wordOfString.length() - 1) {
                char reserve = wordOfString.charAt(j);
                wordOfString.setCharAt(j, wordOfString.charAt(wordOfString.length() - j - 1));
                wordOfString.setCharAt(wordOfString.length() - j - 1, reserve);
            }
        }

        this.finalString.append(wordOfString);
    }

    public StringBuilder getFinalString() {
        return this.finalString;
    }

    public void insertPunctuationMarks(char punctuationMarks) {
        if (punctuationMarks != ',' && punctuationMarks != '.') {
            this.finalString.append(' ');
        } else {
            this.finalString.append(punctuationMarks);
        }

    }
}
