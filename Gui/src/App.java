import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class App extends JFrame {

    private JPanel panel;
    private JLabel text;
    private JButton button;
    private JButton numButton;
    private JLabel numText;
    private int num;

    public static void main(String[] args) throws Exception {
        ArrayList<String> food = new ArrayList<String>();
        food.add("apple");
        food.add("pear");
        food.add("cheese");

        food.forEach(f-> System.out.println(f));

        var t = new String("Hello"); // var!
        t = t.toLowerCase();


        EventQueue.invokeLater(()-> {
            App app = new App();
            app.setVisible(true);
        });
    }


    public static int sum(int... args) { // args!
        int t = 0;
        for (int i : args) {
            t+=i;
        }
        return t;
    }


    public App() {
        setTitle("Example app :)");
        setSize(640,480);
        setLocationRelativeTo(null); // centers
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);
        add(panel);

        text = new JLabel("Hello world", SwingConstants.CENTER);
        text.setFont(new Font("Serif", Font.BOLD, 20));
        text.setBounds(0,20,getBounds().width, 100);
        panel.add(text);

        button = new JButton("Click me");
        button.setBounds((int) getBounds().getWidth() / 2 - 100, 100, 200, 40);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("get clicked lmao");
            }
        }); 
        panel.add(button);

        num = 0;
        numText = new JLabel(String.valueOf(num), SwingConstants.CENTER);
        numText.setFont(new Font("Serif", Font.BOLD, 20));
        numText.setBounds(0, 100, getBounds().width, 100);

        numButton = new JButton("increment");
        numButton.setBounds(getBounds().width / 2-100, 200, 200, 40);
        numButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num++;
                numText.setText(String.valueOf(num));
            }
        });
        panel.add(numText);
        panel.add(numButton);
    }

}
