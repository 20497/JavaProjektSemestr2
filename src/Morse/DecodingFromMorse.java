package Morse;

import Interfaces.Decoding;

import java.util.ArrayList;
import java.util.HashMap;

public class DecodingFromMorse implements Decoding {
    @Override
    public String decode(String sentence) {
        HashMap<String, String> deMorse = new HashMap<String, String>();
        deMorse.put(".-", "a");
        deMorse.put("-...", "b");
        deMorse.put("-.-.", "c");
        deMorse.put("-..", "d");
        deMorse.put(".", "e");
        deMorse.put("..-.", "f");
        deMorse.put("--.", "g");
        deMorse.put("....", "h");
        deMorse.put("..", "i");
        deMorse.put(".---", "j");
        deMorse.put("-.-", "k");
        deMorse.put(".-..", "l");
        deMorse.put("--", "m");
        deMorse.put("-.", "n");
        deMorse.put("---", "o");
        deMorse.put(".--.", "p");
        deMorse.put("--.-", "q");
        deMorse.put(".-.", "r");
        deMorse.put("...", "s");
        deMorse.put("-", "t");
        deMorse.put("..-", "u");
        deMorse.put("...-", "v");
        deMorse.put(".--", "w");
        deMorse.put("-..-", "x");
        deMorse.put("-.--", "y");
        deMorse.put("--..", "z");
        deMorse.put(".----", "1");
        deMorse.put("..---", "2");
        deMorse.put("...--", "3");
        deMorse.put("....-", "4");
        deMorse.put(".....", "5");
        deMorse.put("-....", "6");
        deMorse.put("--...", "7");
        deMorse.put("---..", "8");
        deMorse.put("----.", "9");
        deMorse.put("-----", "0");
        deMorse.put("     ", " ");

        String[] splited = sentence.split("    ");
        String splitedTwice = new String();
        for(int i=0; i<splited.length; i++){
            splitedTwice= splitedTwice + splited[i];
        }
        String[] splitedSpaces = splitedTwice.split(" ");
        ArrayList<String> decoded = new ArrayList<>();
        for(int j=0; j<splitedSpaces.length; j++){
            decoded.add(deMorse.get(splitedSpaces[j]));
        }
        return decoded.toString().replace("[", "").replace("]", "").replace(",", " ");
    }
}

//Tutaj mam klasę implementującą interfejs Decoding, którego metoda wykorzystana tutaj zamienia szyfr morsa w normalne litery/cyfry.
//Również użyłem HashMapy oraz użyłem 2 razy metody split w Stringu aby pozbyć się nadmiernych spacji