package lesson04;
import java.util.Random;
import java.util.Scanner;

public class Homework04 {

    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static char[][] map;
    public static char[][] invMap;
    public static int mapWidth;
    public static int mapHeight;
    public static int mapSizeMin = 3;
    public static int mapSizeMax = 6;

    public static char usedCell = '*';
    public static char readyCell = '_';

    public static char player = '@';
    public static int playerHealth = 100;
    public static int playerDamage = 10;
    public static int playerPositionX;
    public static int playerPositionY;
    public static final int playerMoveUp = 8;
    public static final int playerMoveDown = 2;
    public static final int playerMoveLeft = 4;
    public static final int playerMoveRight = 6;

    public static char enemy = 'E';
    public static int enemyHealth;
    public static int enemyDamage;
    public static int enemyPositionX;
    public static int enemyPositionY;
    public static int enemyValueMin = 10;
    public static int enemyValueMax = 30;


    public static void main(String[] args) {

        createMap();
        createPlayer();
        createEnemies();
        while (true) {
            showMap();
            changePlayerPos();
            if (!isPlayerAlive()) {
                System.out.println("GAME OVER");
                break;
            }
            if (isMapOver()) {
                System.out.println("YOU WIN");
                break;
            }
        }


    }
        public static void createPlayer () {

            playerPositionX = randomRange(0, mapWidth-1);
            playerPositionY = randomRange(0, mapHeight-1);
            map[playerPositionY][playerPositionX] = player;

        }
        public static void changePlayerPos () {
            int currentPosX = playerPositionX;
            int currentPosY = playerPositionY;
            int playerMove;
            do {
                System.out.print("Plese, make you turn: UP=" + playerMoveUp +
                        ", Down=" + playerMoveDown +
                        ", Left=" + playerMoveLeft +
                        ", Righ=" + playerMoveRight +
                        ". >>>");


            playerMove = scanner.nextInt();
            switch (playerMove) {
                case playerMoveUp:
                    playerPositionY -= 1;
                    break;
                case playerMoveDown:
                    playerPositionY += 1;
                    break;
                case playerMoveLeft:
                    playerPositionX -= 1;
                    break;
                case playerMoveRight:
                    playerPositionX += 1;
                    break;
            }
            }   while (!isPlayerPosCorrect(currentPosY, currentPosX, playerPositionY, playerPositionX ));
            playerAction(currentPosY, currentPosX, playerPositionY, playerPositionX );
        }
        public static boolean isPlayerPosCorrect( int currentPosY, int currentPosX,  int nextY, int nextX) {

        if (nextY >= 0 && nextY < mapHeight && nextX >= 0 && nextX < mapWidth){
            System.out.println("Player move to [" + (nextY + 1) + ":" + (nextX + 1) + "] Success!!!");
            return true;
        }  else {
            playerPositionY = currentPosY;
            playerPositionX = currentPosX;
            System.out.println("Wrong move. Try another dirrection !!!");
            return false;

        }
        }
        public static void playerAction ( int currentPosY, int currentPosX,  int nextY, int nextX) {
        if (map[nextY][nextX] == enemy) {
            playerHealth -= enemyDamage;
            System.out.println("ALarRM!!!  You get damage " + enemyDamage + ". Player health now: " + playerHealth);
        }
            map[currentPosY][currentPosX] = usedCell;
            map[nextY][nextX] = player;

        }
        public static void createEnemies() {
            int enemyHealth = randomRange(enemyValueMin, enemyValueMax );
            int enemyDamage= randomRange(enemyValueMin, enemyValueMax );
            int enemyCount = (mapWidth + mapHeight) / 4;


            for (int i=0; i<enemyCount; i++) {
                do {
                    enemyPositionX = random.nextInt(mapWidth);
                    enemyPositionY = random.nextInt(mapHeight);
                } while (enemyPositionX == playerPositionX && enemyPositionY == playerPositionY);

                map[enemyPositionY][enemyPositionX] = enemy;
            }


            System.out.println("Enemy Count: " + enemyCount + " Enemy Power: " + enemyDamage  + " Enemy Health: " + enemyHealth);
        }
        public static void createMap() {
            mapHeight = randomRange(mapSizeMin, mapSizeMax);
            mapWidth = randomRange(mapSizeMin, mapSizeMax);
            map = new char[mapHeight][mapWidth];
            invMap = new char[mapHeight][mapWidth];

            for (int y = 0; y < mapHeight; y++) {
                for (int x = 0; x < mapWidth; x++) {
                    map[y][x] = readyCell;
                }
            }
System.out.println("Create Map. Size " + mapHeight + " x " + mapWidth);

        }
        public static void showMap() {
            System.out.println( "==== MAP ====" );
            for (int y = 0; y < mapHeight; y++) {
                for (int x = 0; x < mapWidth; x++) {
                    System.out.print(map[y][x] +  "|");
                }
                System.out.println();
            }
            System.out.println("=============");
        }
        public static boolean isMapOver() {
            for (int y = 0; y < mapHeight; y++) {
                for (int x = 0; x < mapWidth; x++) {
                   if (map[y][x] == usedCell);
                   return false;
                }
            }
            return false;
        }
        public static boolean isPlayerAlive() {
        return playerHealth > 0;


        }
        public static int randomRange( int min, int max ) {
            return min + random.nextInt(max - min + 1 );
        }

    }



