package homework7;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Settings extends JFrame {     // класс настройки игры
    private static final int WINDOW_WIDTH = 350;  //ширина окна с настройками
    private static final int WINDOW_HEIGHT = 270; //высота окна с настройками
    private GameWindow gameWindow;  // ссылка на родительский gameWindow

    private JRadioButton jrbHumVsAi;  // выбор опции
    private JRadioButton jrbHumVsHum;  // выбор опции
    private JSlider jsFieldSize;  // ползунок длина
    private JSlider jsWinLength;  // ползунок победа
    private static final String FIELD_SIZE_PREFIX = "Field size is: ";   // выбранный размер поля
    private static final String WIN_LENGTH_PREFIX = "Winning length is: ";  // выбранное условие победы
    private static final int MIN_FIELD_SIZE = 3;   // минимальный размер поля
    private static final int MAX_FIELD_SIZE = 10;  // максимальный размер поля
    private static final int MIN_WIN_LENGTH = 3;  // минимальное условие победы

    Settings(GameWindow gameWindow) {  // конструктор окна настройки
        this.gameWindow = gameWindow;  // принимаем родителя
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);  // установили размеры settings
        Rectangle gameWindowBounds = gameWindow.getBounds();  // класс символизирующий прямоугольник
        int posX = (int) gameWindowBounds.getCenterX() - WINDOW_WIDTH / 2;  // считаем x для settings (делим ширину gameWindow на 2)
        int posY = (int) gameWindowBounds.getCenterY() - WINDOW_HEIGHT / 2; // считаем y для settings (делим высоту gameWindow на 2)
        setLocation(posX, posY);  // устанавливаем поле settings по координатам
        setResizable(false);  // не изменять размеры
        setTitle("Creating a new game");  // заголовок
        setLayout(new GridLayout(10, 1));  // сетка 10 строк и 1 столбец
        addGameModeControls(); //вызов метода
        addFieldControls();  //вызов метода
        JButton btnStart = new JButton("Start a game");  // кнопка старта с подписью "Start a game"
        btnStart.addActionListener(new ActionListener() {  //слушатель
            @Override
            public void actionPerformed(ActionEvent e) {
                startGame();
            }  // метод начала игры
        });
        add(btnStart); //добавили кнопку start
    }

    private void addGameModeControls() {  //метод для режимов игры
        add(new JLabel("Choose game mode"));  // подпись
        jrbHumVsAi = new JRadioButton("Human vs. AI", true);  //пункт "Human vs. AI", установили как выбранный пункт
        jrbHumVsHum = new JRadioButton("Human vs Human");  // пункт "Human vs Human"
        ButtonGroup mode = new ButtonGroup();  // объеденили в группу
        mode.add(jrbHumVsAi);
        mode.add(jrbHumVsHum);
        add(jrbHumVsAi);  // добавили пункт "Human vs. AI"
        add(jrbHumVsHum);  // добавили пункт "Human vs Human"
    }

    private void addFieldControls() {  //метод для ползунков
        JLabel jlFieldSize = new JLabel(FIELD_SIZE_PREFIX + MIN_FIELD_SIZE);  // для размера поля
        JLabel jlWinLength = new JLabel(WIN_LENGTH_PREFIX + MIN_WIN_LENGTH);  // для размера победы
        jsFieldSize = new JSlider(MIN_FIELD_SIZE, MAX_FIELD_SIZE, MIN_FIELD_SIZE);  // сам ползунок с установленным значением на min размере поля
        jsWinLength = new JSlider(MIN_WIN_LENGTH, MIN_FIELD_SIZE, MIN_WIN_LENGTH);  // сам ползунок с установленным значением на min размере победы
        jsFieldSize.addChangeListener(new ChangeListener() {  // добавить слушателя. каждый раз когда будет меняться значение ползунка надо обновлять лэйбл
            @Override
            public void stateChanged(ChangeEvent e) {
                int currentValue = jsFieldSize.getValue();  // текущее значение
                jlFieldSize.setText(FIELD_SIZE_PREFIX + currentValue);  // установить текст prefix+ текущее значение
                jsWinLength.setMaximum(currentValue); // максимальное значение побенды равно текущему значение размеров поля
            }
        });
        jsWinLength.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                jlWinLength.setText(WIN_LENGTH_PREFIX + jsWinLength.getValue());
            }
        });
        add(new JLabel("Choose field size"));  //подпись для размера поля
        add(jlFieldSize);
        add(jsFieldSize);
        add(new JLabel("Choose winning length"));  //подпись для размера победы
        add(jlWinLength);
        add(jsWinLength);
    }

    private void startGame() {
        int gameMode;
        if (jrbHumVsAi.isSelected()) {  //если выбрано HvAI
            gameMode = Map.GAME_MODE_HVA;  //игра для HvAI, из map
        } else if (jrbHumVsHum.isSelected()) { //если выбрано HvH
            gameMode = Map.GAME_MODE_HVH;  //игра для HvH из map
        } else {
            throw new RuntimeException("Unexpected game mode"); // новое исключение: неожиданный выбор  режима (придание гибкости для будующих режимов)
        }

        int fieldSize = jsFieldSize.getValue();  //значения поля
        int winLength = jsWinLength.getValue();  //значения победы

        gameWindow.start(gameMode, fieldSize, fieldSize, winLength);  // старт новой игры
        setVisible(false);
    }
}
