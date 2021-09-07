package lesson07;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
    private  int winWidth=400;
    private  int winHeight=300;
    private  int winPosX=200;
    private  int winPosY=100;

    private JButton btnStartGame;
    private JButton btnExitGame;

    private JPanel gui;
    private JPanel gameControlPanel;
    private GameMap map;

    private JPanel gameInfo;
    private JLabel currentLevel;
    private JLabel currentMapSize;
    private JLabel countEnemies;

    GameWindow() {

        setupWindow();


        setUpGui();
        add (gui, BorderLayout.EAST);

        map = new GameMap();
        add (map);


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);



    }

    private void setupWindow() {
        setSize(winWidth, winHeight);
        setLocation(winPosX, winPosY);
        setResizable(false);
        setTitle("The Little GAME");


    }
    private void setUpGui() {

        gui = new JPanel();
        gui.setLayout(new GridLayout(5, 1));

        gameControl();
        gameInfo();

        gui.add(gameControlPanel);
        gui.add(gameInfo);

        }

    private void gameControl() {

        gameControlPanel = new JPanel();
        gameControlPanel.setLayout(new GridLayout(5, 1));

        gameControlPanel.add(new JLabel("+++ GAME MENU +++"));

        btnStartGame = new JButton( "START");
        btnExitGame = new JButton( "EXIT");

        gameControlPanel.add(btnStartGame);
        gameControlPanel.add(btnExitGame);


    }

    private void gameInfo() {
        gameInfo = new JPanel();
        gameInfo.setLayout(new GridLayout(4, 1));

        currentLevel = new JLabel("LEVEL: - ");
        currentMapSize = new JLabel("MAP: - ");
        countEnemies = new JLabel("ENEMIES: - ");

        gameInfo.add(new JLabel("+++ GAME INFO +++"));
        gameInfo.add(currentLevel);
        gameInfo.add(currentMapSize);
        gameInfo.add(countEnemies);

    }

}
