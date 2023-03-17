import javax.swing.*;
import java.awt.*;

public class CookieClickerGame {
    final public JFrame mainWindow = new JFrame("Cookie Clicker");

    public CookieClickerGame() {
        mainWindow.setLayout(new BorderLayout());
        mainWindow.setSize(500,500);
        mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        CookieClickerPage cookieClickerPage = new CookieClickerPage(mainWindow);
    }

    public static void main(String[] args) {
        new CookieClickerGame();
    }
}
