package homework7;

import javax.swing.*;
import java.awt.*;

public class Map extends JPanel {                   // класс игровое поле только map может с нами играть, поэтому и game mod здесь
    public static final int GAME_MODE_HVH = 0;  // режим игры
    public static final int GAME_MODE_HVA = 1;  // режим игры

    Map() {
        setBackground(Color.BLACK);
    }  // установщик цвета игрового поля

    void startNewGame(int gameMode, int fieldSizeX, int fieldSizeY, int winLength) {  // метод для начала игры с параметрами: игровой режим, размер поля, условия победы
        System.out.printf("game mode: %d\nfieldSize: %d\nwinLength: %d",
                gameMode, fieldSizeX, winLength);
    }
}
