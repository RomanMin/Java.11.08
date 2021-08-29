package lesson04;
import java.util.Random;

public class Homework04 {

    public static Random random = new Random();

    public static char[][] map;
    public static char[][] invMap;
    public static int mapWidth;
    public static int mapHeight;
    public static int mapSizeMin = 3;
    public static int mapSizeMax = 6;

    private static char usedCell = '*';
    private static char readyCell = '_';

    private static char player = '@';
    private static int playerHealth = 100;
    private static int playerDamage = 10;
    private static int playerPositionX;
    private static int playerPositionY;
    private static int playerMoveUp = 8;
    private static int playerMoveDown = 2;
    private static int playerMoveLeft = 4;
    private static int playerMoveRight = 6;

    private static char enemy = 'E';
    private static int enemyHealth ;
    private static int enemyDamage ;
    private static int enemyPositionX;
    private static int enemyPositionY;

    public static void main(String[] args) {

        createMap();

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
        public static int randomRange( int min, int max ) {
            return min + random.nextInt(max - min + 1 );
        }

    }



