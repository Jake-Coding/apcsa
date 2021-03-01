import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class App extends JFrame{

    private JLabel output;


    public static void main(String[] args) throws Exception {
        EventQueue.invokeLater(()-> {
            App calculator = new App();
            calculator.setVisible(true);
        });;
    }


    public App() {
        output = new JLabel("Welcome to da calculator");
        ArrayList<JComponent> components = new ArrayList<JComponent>();
        components.add(output);
        for (JComponent j : getNumButtons()) {
            components.add(j);
        }
        JComponent[] componentArr = new JComponent[components.size()];
        components.toArray(componentArr);
        createLayout(componentArr);
        setTitle("Calculator");
        setSize(640, 480);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createLayout(JComponent... arg) {

        var pane = getContentPane();
        var gl = new GroupLayout(pane);
        pane.setLayout(gl);

        gl.setAutoCreateContainerGaps(true);
        var horizGroup = gl.createSequentialGroup();
        for (int i = 0; i < arg.length; i++) {
            JComponent ar = arg[i];
            horizGroup.addComponent(ar);
        }
        gl.setHorizontalGroup(horizGroup);
     
        var vertGroup = gl.createSequentialGroup();
        for (int i = 0; i < arg.length; i++) {
            JComponent ar = arg[i];
            vertGroup.addComponent(ar);
        }

        gl.setVerticalGroup(vertGroup);
       
    }


    public JButton[] getNumButtons() {
        JButton[] buttons = new JButton[10];
        for (int i = 0; i<10; i++) {
            JButton button = new JButton(String.valueOf(i));
            final int j = i;
            button.addActionListener((event)-> {
                updateOutput(String.valueOf(j));
            });
            buttons[i] = button;
        }
        return buttons;
    }
    public void updateOutput(String s) {
        output.setText(s);
    }
}
