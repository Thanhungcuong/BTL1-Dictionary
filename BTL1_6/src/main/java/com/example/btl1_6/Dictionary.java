package com.example.btl1_6;

import java.util.ArrayList;

public class Dictionary {
    ArrayList<Word> dictionary = new ArrayList<>();

    public ArrayList<Word> getDictionary() {
        return dictionary;
    }

    public void addWord(Word newWord) {
        dictionary.add(newWord);
    }

    public void deleteWord(int i) {
        dictionary.remove(i);
    }

}
