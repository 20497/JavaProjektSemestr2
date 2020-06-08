package Swing.Buttons;

import Morse.CodingIntoMorse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConvertIntoMorseButton extends JPanel implements ActionListener {

    public static final int HEIGHT = 100;
    public static final int WIDTH = 300;
    private JButton convertMorse;
    private JTextField input;
    private JLabel output;

    public ConvertIntoMorseButton(){
        convertMorse = new JButton("Convert into morse");
        convertMorse.addActionListener(this);
        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        add(convertMorse);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source==convertMorse){
            CodingIntoMorse c = new CodingIntoMorse();
            output.setText(c.code(input.getText()));
        }
    }

    public void setIO(JTextField input, JLabel output){
        this.input = input;
        this.output = output;
    }

}

//Klasa z buttonem od kodowania inputa w standardzie morsa - posiada konstruktor który tworzy button, metode
// actionPerformed z interfejsu ActionListener która po wciśnięciu buttona wywołuje metode kodowania z klasy CodingIntoMorse
// i zwraca już zakodowany output, oraz metodę setIO która po prostu pobiera aktualny input i output