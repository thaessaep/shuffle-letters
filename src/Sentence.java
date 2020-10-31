
import java.util.Scanner;

public class Sentence {
    public Sentence() {
    }

    public StringBuilder splittingWord() {
        int j = 0;
        char punctuationMarks;
        System.out.println("Input sentence:");
        Scanner scanner = new Scanner(System.in);
        String startString = scanner.nextLine();
        StringBuilder word = new StringBuilder();
        Word passWord = new Word();

        for(int i = 0; i < startString.length(); ++i) {
            if (startString.charAt(i) == '.') {
                punctuationMarks = '.';
                passWord.shuffle(word, punctuationMarks);
                passWord.insertPunctuationMarks(punctuationMarks);
                break;
            }

            if (startString.charAt(i) != ' ' && startString.charAt(i) != ',') {
                word.insert(j, startString.charAt(i));
                ++j;
            } else {
                if (startString.charAt(i) == ',') {
                    punctuationMarks = ',';
                } else {
                    punctuationMarks = '-';
                }

                passWord.shuffle(word, punctuationMarks);
                passWord.insertPunctuationMarks(punctuationMarks);
                word = new StringBuilder();
                j = 0;
            }
        }

        return passWord.getFinalString();
    }
}
