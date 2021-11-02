package com.example.btl1_6;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryCommandLine {
    private final DictionaryManagement dictionary_commandline = new DictionaryManagement();

    public DictionaryManagement getDictionary_commandline() {
        return dictionary_commandline;
    }

    Scanner scanner = new Scanner(System.in);

    public void showALlWord() {
        ArrayList<Word> one_dictionary = dictionary_commandline.getDictionary_management().getDictionary();
        System.out.println("No  " + "|English           " + "|Vietnamese");
        for (int i = 0; i < one_dictionary.size(); i++) {
            System.out.println(i + 1 + "   "
                    + String.format("|%-20s|", one_dictionary.get(i).getWord_target())
                    + one_dictionary.get(i).getWord_explain());
        }
    }

    public void dictionaryBasic() {
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String eng_word = scanner.nextLine();
            String viet_word = scanner.nextLine();
            dictionary_commandline.insertFromCommandLine(eng_word, viet_word);
        }
        //dictionarySearcher();
        //dictionary_commandline.dictionaryLookup();
        //dictionary_commandline.deleteWord();
        showALlWord();

    }


    public void dictionarySearcher() {
        System.out.println("Please type the word you want to search: ");
        String s = scanner.nextLine();
        ArrayList<Word> one_dictionary = dictionary_commandline.getDictionary_management().getDictionary();
        Dictionary words_list = new Dictionary();
        for (Word word : one_dictionary) {
            if (word.getWord_target().startsWith(s.toLowerCase()) || word.getWord_target().startsWith(s.toUpperCase())) {
                words_list.addWord(word);
            }
        }
        for (int i = 0; i < words_list.getDictionary().size(); i++) {
            System.out.println(words_list.getDictionary().get(i).getWord_target());
        }

    }

    public void dictionaryAdvanced() throws IOException {
        this.dictionary_commandline.insertfromFile();
        //showALlWord();
        dictionarySearcher();

    }

}
