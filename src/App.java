import Swing.MyFrame;
import java.awt.*;

public class App  {
    public static void main(String args[]){
        EventQueue.invokeLater(() -> new MyFrame());
    }
}

//Główna klasa aplikacji, poprzez lambdę wywołuję okno aplikacji z klasy MyFrame