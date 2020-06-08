package Morse;

import Interfaces.Coding;

import java.util.ArrayList;
import java.util.HashMap;

public class CodingIntoMorse implements Coding {

    @Override
    public String code(String sentence) {

        HashMap<Character, String> morse = new HashMap<Character, String>();
        morse.put('a', ".-");
        morse.put('b', "-...");
        morse.put('c', "-.-.");
        morse.put('d', "-..");
        morse.put('e', ".");
        morse.put('f', "..-.");
        morse.put('g', "--.");
        morse.put('h', "....");
        morse.put('i', "..");
        morse.put('j', ".---");
        morse.put('k', "-.-");
        morse.put('l', ".-..");
        morse.put('m', "--");
        morse.put('n', "-.");
        morse.put('o', "---");
        morse.put('p', ".--.");
        morse.put('q', "--.-");
        morse.put('r', ".-.");
        morse.put('s', "...");
        morse.put('t', "-");
        morse.put('u', "..-");
        morse.put('v', "...-");
        morse.put('w', ".--");
        morse.put('x', "-..-");
        morse.put('y', "-.--");
        morse.put('z', "--..");
        morse.put('1', ".----");
        morse.put('2', "..---");
        morse.put('3', "...--");
        morse.put('4', "....-");
        morse.put('5', ".....");
        morse.put('6', "-....");
        morse.put('7', "--...");
        morse.put('8', "---..");
        morse.put('9', "----.");
        morse.put('0', "-----");

        String[] splited = sentence.split("\\s");
        ArrayList<String> coded = new ArrayList<>();
        int length = splited.length;
        int n = 0;
        while(length != 0){
            for(int i=0; i<splited[n].length(); i++){
                coded.add(morse.get(splited[n].charAt(i)));
            }
            if(length != 1)
                coded.add("    ");
            n++;
            length--;
        }
        return (coded.toString().replace("[","").replace("]", "").replace(",", ""));
    }
}


//Tutaj mam klasę implenetującą interfejs Coding, którego metoda wykorzystana tutaj koduje podany String w standardzie morsa.
//Do tego użyłem HashMapy i wbudowanej metody Stringa charAt żeby wszystkie chary zamienić zgodnie z indeksami w HashMapie