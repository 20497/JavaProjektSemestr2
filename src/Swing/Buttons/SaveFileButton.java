package Swing.Buttons;

import Files.SaveFile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SaveFileButton extends JPanel implements ActionListener {

    public static final int HEIGHT = 100;
    public static final int WIDTH = 300;
    private JButton saveFile;
    private JLabel output;

    public SaveFileButton(){
        saveFile = new JButton("Save output in lastOutput.txt");
        saveFile.addActionListener(this);
        setLayout(new FlowLayout());
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        add(saveFile);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source==saveFile){
            SaveFile c = new SaveFile();
            c.savingFile(output.toString().substring(237));
        }
    }

    public void setO(JLabel output){
        this.output = output;
    }
}

//Klasa z buttonem od zapisywania outputu w pliku tekstowym - posiada konstruktor który tworzy button, metode
// actionPerformed z interfejsu ActionListener która po wciśnięciu buttona wywołuje metode zapisu pliku z klasy SaveFile
// i zapisuje aktualny output, który pobiera z metody setO