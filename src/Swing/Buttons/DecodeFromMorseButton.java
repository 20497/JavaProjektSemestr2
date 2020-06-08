package Swing.Buttons;

import Morse.DecodingFromMorse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DecodeFromMorseButton extends JPanel implements ActionListener {

    public static final int HEIGHT = 100;
    public static final int WIDTH = 300;
    private JButton decodeMorse;
    private JTextField input;
    private JLabel output;

    public DecodeFromMorseButton(){
        decodeMorse = new JButton("Decode from morse");
        decodeMorse.addActionListener(this);
        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        add(decodeMorse);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source==decodeMorse){
            DecodingFromMorse c = new DecodingFromMorse();
            output.setText(c.decode(input.getText()));
        }
    }

    public void setIO(JTextField input, JLabel output){
        this.input = input;
        this.output = output;
    }
}

//Klasa z buttonem do odkodowania inputa ze standardu morsa - posiada konstruktor który tworzy button, metode
// actionPerformed z interfejsu ActionListener która po wciśnięciu buttona wywołuje metode dekodowania z klasy DecodingFromMorse
// i zwraca już odkodowany output, oraz metodę setIO która po prostu pobiera aktualny input i output