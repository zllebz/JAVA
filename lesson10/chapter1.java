package lesson10;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class chapter1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculate number");
        frame.setSize(310, 180);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label01 = new JLabel("Number 1 : ");
        label01.setBounds(20, 10, 65, 20);
        label01.setHorizontalAlignment(SwingConstants.RIGHT);
        JTextField text01 = new JTextField("0");
        text01.setBounds(90, 10, 180, 20);
        text01.setHorizontalAlignment(SwingConstants.RIGHT);
        JLabel label02 = new JLabel("Number 2 : ");
        label02.setBounds(20, 40, 65, 20);
        label02.setHorizontalAlignment(SwingConstants.RIGHT);
        JTextField text02 = new JTextField("0");
        text02.setBounds(90, 40, 180, 20);
        text02.setHorizontalAlignment(SwingConstants.RIGHT);
        JLabel label03 = new JLabel("Result : ");
        label03.setBounds(20, 70, 65, 20);
        label03.setHorizontalAlignment(SwingConstants.RIGHT);
        JTextField text03 = new JTextField("0");
        text03.setBounds(90, 70, 180, 20);
        text03.setHorizontalAlignment(SwingConstants.RIGHT);
        text03.setEditable(false);
        JButton btn01 = new JButton("Add");
        btn01.setBounds(10, 100, 60, 20);
        JButton btn02 = new JButton("Sub");
        btn02.setBounds(80, 100, 60, 20);
        JButton btn03 = new JButton("Mul");
        btn03.setBounds(150, 100, 60, 20);
        JButton btn04 = new JButton("Div");
        btn04.setBounds(220, 100, 60, 20);
        frame.add(label01);
        frame.add(text01);
        frame.add(label02);
        frame.add(text02);
        frame.add(label03);
        frame.add(text03);
        frame.add(btn01);
        frame.add(btn02);
        frame.add(btn03);
        frame.add(btn04);
        frame.setVisible(true);
    }
}
