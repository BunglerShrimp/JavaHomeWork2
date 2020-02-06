package homework7;

import javax.swing.*;  // подключение библтотеки swing
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {   // класс игрового окна

    private static final int WIN_WIDTH = 507;  // ширина окна
    private static final int WIN_HEIGHT = 555; // высота окна
    private static final int WIN_POSX = 650;  // позиция окна по x относительно верхнего левого угла экрана
    private static final int WIN_POSY = 250;  // позиция окна по y относительно верхнего левого угла экрана

    private Map map;
    private Settings settings;  // setting не может упралять игровым окном

    GameWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  // опреация закрытия по умолчанию. параметры закрытия окна (выйти при закрытии)
        setTitle("Tic tac toe game");  // заголвок
        setLocation(WIN_POSX, WIN_POSY);  // местоположение окна
        setSize(WIN_WIDTH, WIN_HEIGHT);  // размеры окна

        JButton btnStart = new JButton("Start"); // создание кнопки "Start"
        JButton btnExit = new JButton("Exit");   // создание кнопки "Exit"
        JPanel panelButtons = new JPanel(new GridLayout(1, 2));  // панель для кнопок. GridLayout - сетка, состоящая из одной строки и 2-х столбцов
        panelButtons.add(btnStart); // добавляем кнопку start на панель
        panelButtons.add(btnExit);  // добавляем кнопку Exit на панель
        btnExit.addActionListener(new ActionListener() {  // добавляет "слушателя" действия
            @Override  // переопределение метода
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }  // выходим из приложения в лучае exit
        });
        btnStart.addActionListener(new ActionListener() {  // добавляет "слушателя" действия
            @Override  // переопределение метода
            public void actionPerformed(ActionEvent e) {
                settings.setVisible(true);
            }  // окно settings станет видимым
        });
        map = new Map();  // создаем map
        settings = new Settings(this); // создаем settings, передаем ссылку на gameWindow, чтобы settings смог отцентрироваться

        add(map, BorderLayout.CENTER); // добавление игрового пля в центр окна
        add(panelButtons, BorderLayout.SOUTH);  // метод добавления панели; BorderLayout - компановщик (форматирует панель с кнопками под размер окна) и отвечает за расположение панели с копками (south - внизу окна)
        setVisible(true);  // визуализация окна
    }

    void start(int gameMode, int fieldSizeX, int fieldSizeY, int winLength) {  // метод начинающий игру
        map.startNewGame(gameMode, fieldSizeX, fieldSizeY, winLength);  // передача map команды на старт с заданнами прарметрами
    }
}
