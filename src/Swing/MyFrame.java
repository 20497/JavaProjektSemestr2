package Swing;
import Morse.DecodingFromMorse;
import Swing.Buttons.ConvertIntoMorseButton;
import Swing.Buttons.DecodeFromMorseButton;
import Swing.Buttons.SaveFileButton;

import javax.swing.*;
import java.awt.*;


public class MyFrame extends JFrame {

    private JTextField input = new JTextField();
    private JLabel output = new JLabel();
    private ConvertIntoMorseButton convertIntoMorseButton = new ConvertIntoMorseButton();
    private DecodeFromMorseButton decodeFromMorseButton = new DecodeFromMorseButton();
    private SaveFileButton saveIntoFile = new SaveFileButton();
    public MyFrame() {
        super("Morse");
        output.setFont(output.getFont ().deriveFont (34.0f));
        convertIntoMorseButton.setIO(input, output);
        decodeFromMorseButton.setIO(input, output);
        saveIntoFile.setO(output);
        add(BorderLayout.CENTER, saveIntoFile);
        add(BorderLayout.EAST, convertIntoMorseButton);
        add(BorderLayout.WEST, decodeFromMorseButton);
        add(BorderLayout.NORTH, input);
        add(BorderLayout.SOUTH, output);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(1000,700);
        setVisible(true);
    }
}

//Klasa łącząca wszystkie komponenty i scalająca je w ramkę aplikacji, implementuje wszystkie buttony z pakietu Buttons
// oraz wywołuje metody do odczytu inputu oraz outputu. Do rozstawienia ich w ramce użyłem metod obiektu BorderLayout
// oraz metody z klasy JFrame po której klasa MyFrame dziedziczy