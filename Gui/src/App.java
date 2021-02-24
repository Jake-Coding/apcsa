import javax.swing.*;
import java.awt.*;

public class App extends JFrame{
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.setVisible(true);
    }

    public App() {
        setTitle("Example app :)");
        setSize(500,500);
        setLocationRelativeTo(null); // centers
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        add(panel);

        JLabel text = new JLabel("Hello world", SwingConstants.CENTER);
        text.setFont(new Font("Serif", Font.BOLD, 20));
        text.setBounds(0,20,getBounds().width, 100);
        panel.add(text);

    }
}
