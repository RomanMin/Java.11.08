package lesson07;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
    private  int winWidth=600;
    private  int winHeight=400;
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

    private JPanel playerInfo;
    private JLabel playerHealth;
    private JLabel playerDamage;
    private JLabel playerPosition;

    private JPanel moveDirrection;
    private JButton moveDirrUp;
    private JButton moveDirrDown;
    private JButton moveDirrLeft;
    private JButton moveDirrRight;

    private TextArea gameLogArea;
    private JScrollPane scrollGameLog;


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
        playerInfo();
        moveDirrection();
        setupGameLogArea();

        gui.add(gameControlPanel);
        gui.add(gameInfo);
        gui.add(playerInfo);
        gui.add(moveDirrection);
        gui.add(gameLogArea, BorderLayout.SOUTH);


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
    private void playerInfo() {

        playerInfo = new JPanel();
        playerInfo.setLayout(new GridLayout(4, 1));

        playerHealth = new JLabel("HEALTH: - ");
        playerDamage = new JLabel("DAMAGE: - ");
        playerPosition = new JLabel("POSITION: y : x ");

        playerInfo.add(new JLabel("+++ PLAYER INFO +++"));
        playerInfo.add(playerHealth);
        playerInfo.add(playerDamage);
        playerInfo.add(playerPosition);
    }
    private void moveDirrection() {
        moveDirrection = new JPanel();
        moveDirrection.setLayout(new GridLayout(2, 3));

        moveDirrUp = new JButton("\uD83E\uDC45");
        moveDirrDown = new JButton("\uD83E\uDC47");
        moveDirrLeft = new JButton("\uD83E\uDC44");
        moveDirrRight = new JButton("\uD83E\uDC46");


        moveDirrection.add(new JPanel());
        moveDirrection.add(moveDirrUp);
        moveDirrection.add(new JPanel());
        moveDirrection.add(moveDirrLeft);
        moveDirrection.add(moveDirrDown);
        moveDirrection.add(moveDirrRight);


    }
    private void setupGameLogArea() {
        gameLogArea = new TextArea();
        scrollGameLog = new JScrollPane(gameLogArea);

    }

}
