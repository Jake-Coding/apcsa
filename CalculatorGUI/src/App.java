import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.GroupLayout.*;


public class App extends JFrame{

    private JLabel output;
    private String value1, op, value2;


    public static void main(String[] args) throws Exception {
        EventQueue.invokeLater(()-> {
            App calculator = new App();
            calculator.setVisible(true);
        });;
    }

public void clear() {
    value1 = "0";
    op = "+";
    value2 = "0";
    doMath();
    op = "+";
    updateOutput();
}
    public App() {
        output = new JLabel("");
        output.setPreferredSize(new Dimension(200, 30));
        ArrayList<JComponent> components = new ArrayList<JComponent>();
        components.add(output);
        for (JComponent j : getNumButtons()) {
            components.add(j);
        }
        JButton sqrtButton = new JButton("sqrt");
        sqrtButton.addActionListener((event)-> {
            setOp("sqrt");
            doMath();
            updateOutput();
        });
        components.add(sqrtButton);
        JButton clearButton = new JButton("C");
        clearButton.addActionListener((event)-> {
            clear();
            updateOutput();
        });
        JButton negateButton = new JButton("(-)");
        negateButton.addActionListener((event)-> {
            if (op == "") {
                if (value1.charAt(0) == '-') {
                    value1 = (value1.substring(1));
                }
                else {
                    value1 = ("-" + value1);
                }
            } else {
                if (value2.charAt(0) == '-') {
                    setVal2(value2.substring(1));
                }
                else {
                    setVal2("-" + value2);
                }
            }
            updateOutput();
            
        });
        components.add(negateButton);
        components.add(clearButton);
        for (String s : new String[] {"*", "+", "-", "/" }) {
            JButton opButton = new JButton(s);
            final String sf = s;
            opButton.addActionListener((event)-> {
                setOp(sf);
                updateOutput();
                // doMath();

            });
            components.add(opButton);
        }
        JButton equalsButton = new JButton("=");
        equalsButton.addActionListener((event)-> {
            doMath();
            updateOutput();
        });
        components.add(equalsButton);
    
        for (int i = 0; i < components.size(); i++) {
            JComponent comp = components.get(i);
            comp.setPreferredSize(new Dimension(50, 50));
            comp.setSize(new Dimension(50, 50));
            comp.setToolTipText(comp.getPreferredSize().toString() + comp.getSize().toString());
            // comp.setPreferredSize(new Dimension(50,20));
            components.set(i, comp);
        }
        JComponent[] componentArr = new JComponent[components.size()];
        components.toArray(componentArr);
        
        createLayout(componentArr);
        setTitle("Calculator");
        setSize(1000,1000);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        clear();
    }

    private void createLayout(JComponent... arg) {

        var pane = getContentPane();
        var gl = new GroupLayout(pane);
        pane.setLayout(gl);

        JComponent[] allArgsButOne = new JComponent[arg.length-1];
        for (int i = 1; i < arg.length; i++) {
            allArgsButOne[i-1] = arg[i];
        }
        gl.linkSize(allArgsButOne);
        gl.setAutoCreateContainerGaps(true);
        gl.setAutoCreateGaps(true);
        ParallelGroup[] horizGroups = new ParallelGroup[] {gl.createParallelGroup(), gl.createParallelGroup(), gl.createParallelGroup()};
        
        for (int i = 1; i < arg.length; i++) {
            JComponent ar = arg[i];
            horizGroups[(i-1) % (horizGroups.length)].addComponent(ar); 
        }
        
        SequentialGroup seqGroup = gl.createSequentialGroup();
        seqGroup.addComponent(arg[0]);
        for (ParallelGroup para : horizGroups) {
            seqGroup.addGroup(para);
        }
        gl.setHorizontalGroup(seqGroup);
     
        SequentialGroup[] vertGroups = new SequentialGroup[] {gl.createSequentialGroup(), gl.createSequentialGroup(), gl.createSequentialGroup()};
        
        for (int i = 1; i < arg.length; i++) {
            JComponent ar = arg[i];
            vertGroups[(i-1) % vertGroups.length].addComponent(ar);
        }
        ParallelGroup seqGroupV = gl.createParallelGroup();
        seqGroupV.addComponent(arg[0]);
        for (SequentialGroup para : vertGroups) {
            seqGroupV.addGroup(para);
        }
        

        gl.setVerticalGroup(seqGroupV);
       
    }


    public JButton[] getNumButtons() {
        JButton[] buttons = new JButton[11];
        for (int i = 0; i<10; i++) {
            JButton button = new JButton(String.valueOf(i));
            final int j = i;
            button.addActionListener((event)-> {
                if (op != "") {
                    setVal2(value2 + String.valueOf(j));
                    updateOutput();
                }
            });
            buttons[i] = button;
        }
        JButton decimalButton = new JButton(".");
        decimalButton.addActionListener((event)-> {
            if (op != "" && !value2.contains(".")) {

                setVal2(value2 + ".");
                updateOutput();

            }
        });
        buttons[10] = decimalButton;
        return buttons;
    }
    public void updateOutput() {
        // doMath();
        output.setText(value1 + " " + op + " " + value2);

    }
    private void setVal2(String s) {
        value2 = s;
    }
    private void setOp(String s) {
        op = s;
    }
    public void doMath() {
        if (value1.equals("NaN")) clear();
        Double value1_d = Double.valueOf(0);
        Double value2_d = Double.valueOf(0);
        if (value2 != "") {
            value2_d= Double.parseDouble(value2);
        }
        if (value1 != "") {
            value1_d = Double.parseDouble(value1);
        }
    //    if (op == "") {
    //        op = "c";
    //    } 
        switch (op) {
            case ("+"): 
                value1 = String.valueOf(value1_d+value2_d);
                break;
            case ("-"):
                value1 = String.valueOf(value1_d-value2_d);
                break;
            case ("*"):
                value1 = String.valueOf(value1_d * value2_d);
                break;
            case ("/"):
                value1 = String.valueOf(value1_d / value2_d);
                break;
            case ("sqrt"):
                value1 = String.valueOf(Math.sqrt(value1_d));
                break;
            case ("c"):
                value1 = "0";
                break;
            default:
                break;

        }
        op = "";
        value2 = "";
        // System.out.println(value1);
    }
}
