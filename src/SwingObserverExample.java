import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Elif
 */
public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] Args) {
        SwingObserverExample ex = new SwingObserverExample();
        ex.go();
    }

    public void go() {
        frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel();

        JButton button = new JButton("Should I do it?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());

        panel.add(label);
        panel.add(button);

        frame.add(panel);
        frame.setSize(300, 100);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    class AngelListener implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            frame = new JFrame("The Angel");
            JPanel panel = new JPanel();
            panel.setLayout(new FlowLayout());
            JLabel label = new JLabel("Don't do it!!!");
            panel.add(label);

            frame.add(panel);
            frame.setSize(300, 100);
            frame.setLocation(955,155);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        }
    }

    class DevilListener implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            frame = new JFrame("The Devil");
            JPanel panel = new JPanel();
            panel.setLayout(new FlowLayout());
            JLabel label = new JLabel("Do it!!!");
            panel.add(label);

            frame.add(panel);
            frame.setSize(300, 100);
            frame.setLocation(155,155);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        }
    }
}