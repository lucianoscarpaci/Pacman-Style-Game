package pacman;

import java.awt.Font;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;



public class Model extends JPanel implements ActionListener {

    private Dimension d;
    private final Font smallFont = new Font("Arial", Font.BOLD, 14);
    private boolean gameIsRun = false;
    private boolean isDying = false;
    
    private final int BLOCK_SIZE = 24;
    private final int NUM_BLOCKS = 15;
    private final int SCREEN = NUM_BLOCKS * BLOCK_SIZE;
    private final int MAX_GHOSTS = 12;
    private final int SPEED = 6;

    private int NUM_GHOSTS = 6;
    private int score, lives;
    private int [] dx, dy;
    private int[] xGhost, yGhost, dxGhost, dyGhost, speedGhost;
    
    private Image heart, ghost;
    private Image Up, Down, Left, Right;

    private int pacmanX, pacmanY, pacmanDX, pacmanDY;
    private int reqDX, reqDY;

    private final int validSpeeds[] = {1,2,3,4,6,8};
    private final int maxSpeed = 6;
    private int currentSpeed = 3;
    private short [] screenData;
    private Timer timer;

    private final short levelData[] = {
            19, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 22,
            17, 16, 16, 16, 16, 24,16, 16, 16, 16, 16, 16, 16, 16, 20,
            0, 0, 0, 0, 0, 0, 0, 16, 16, 24, 18, 17, 17, 17, 20, 22,
            16, 18, 18, 18, 18, 18, 17, 17, 17, 17, 22, 22, 22, 22, 22,
            24, 24, 24, 24, 24, 24, 24, 20, 20, 20, 0, 0, 0, 0, 0, 0,
            17, 17, 17, 17, 17, 17, 17, 18, 18, 18, 18, 18, 26, 24, 20,
            20, 20, 20, 20, 20, 20, 16, 16, 16, 16, 16, 25, 24, 22, 20,
            19, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 22,
            17, 16, 16, 16, 16, 24,16, 16, 16, 16, 16, 16, 16, 16, 20,
            0, 0, 0, 0, 0, 0, 0, 16, 16, 24, 18, 17, 17, 17, 20, 22,
            16, 18, 18, 18, 18, 18, 17, 17, 17, 17, 22, 22, 22, 22, 22,
            24, 24, 24, 24, 24, 24, 24, 20, 20, 20, 0, 0, 0, 0, 0, 0,
            17, 17, 17, 17, 17, 17, 17, 18, 18, 18, 18, 18, 26, 24, 20,
            20, 20, 20, 20, 20, 20, 16, 16, 16, 16, 16, 25, 24, 22, 20,

    };
    /* Constructor for the game */
    public Model() {
        loadTheImage();
        loadTheVariables();
        addKeyListener(new TAdapter());
        setFocusable(true);
        loadTheGame();
    }

    private void loadTheImage() {
        Down = new ImageIcon("/src/images/down.gif").getImage();
        Up = new ImageIcon("/src/images/down.gif").getImage();
        Left = new ImageIcon("/src/images/down.gif").getImage();
        Right = new ImageIcon("/src/images/down.gif").getImage();
        heart = new ImageIcon("/src/images/down.gif").getImage();
        ghost = new ImageIcon("/src/images/down.gif").getImage();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
    }

}
