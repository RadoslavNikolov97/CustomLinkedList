import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Frame extends JFrame implements ActionListener {
    JTextField inputField;
    JButton submit;
    JTextField indexField;
    JLabel resultField;

    public Frame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        inputField = new JTextField();
        inputField.setPreferredSize(new Dimension(250, 40));
        inputField.setFont(new Font("Consolas", Font.PLAIN, 15));
        indexField = new JTextField();
        indexField.setPreferredSize(new Dimension(250, 40));
        indexField.setFont(new Font("Consolas", Font.PLAIN, 15));
        inputField.setText("Input like 1 -> 2 -> ...");
        indexField.setText("Select an index");
        resultField = new JLabel();
        resultField.setPreferredSize(new Dimension(250, 40));
        resultField.setFont(new Font("Consolas", Font.PLAIN, 15));

        submit = new JButton("submit");
        submit.addActionListener(this);

        this.add(submit);
        this.add(inputField);
        this.add(indexField);
        this.add(resultField);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)  {
        if (e.getSource() == submit) {
            LinkedList list = new LinkedList();

            String[] input = inputField.getText().split(" -> ");

            for (String num : input)
            {
                list.add(Integer.parseInt(num));
            }
            int m = 0;
            try {
                m = Integer.parseInt(indexField.getText());
                if (m < 0 || m > list.getSize() - 1) {
                   throw new IndexOutOfBoundsException("The index is out of bounds " + m);
                }
            } catch (IndexOutOfBoundsException a) {
                resultField.setText(  a.getMessage());

            }

            resultField.setText("Result: " + list.getIndex(m));

        }
    }
}
