import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CookieClickerPage {
    private JLabel cookieClickerTitle;
    private JLabel cookieClickerValue;
    private JButton cookieClickerButton;
    private JPanel mainPanel;

    public CookieClickerPage(JFrame window) {
        window.setContentPane(mainPanel);
        window.setVisible(true);

        cookieClickerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int value = Integer.parseInt(cookieClickerValue.getText());
                value++;
                cookieClickerValue.setText(String.valueOf(value));
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
