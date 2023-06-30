package org.example;

import javax.swing.*;
import java.awt.*;

public class App
{
    public static void main( String[] args )
    {
        MatrixCanvas matrix = new MatrixCanvas();
        JPanel top =new JPanel();
        top.setLayout(new FlowLayout());
        JTextField textField = new JTextField(6);
        top.add(textField);

        JButton button = new JButton("Add");
        button.addActionListener(e->{
            int matrixSize = Integer.parseInt(textField.getText());
            matrix.setMatrixSize(matrixSize);

            matrix.repaint();
        });
        top.add(button);

        JButton reset =new JButton("Reset");
        reset.addActionListener(e->{
            matrix.setMatrixSize(0);
            matrix.repaint();
        });
        top.add(reset);

        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());
        frame.setSize(1000,1000);
        frame.getContentPane().add(top,BorderLayout.NORTH);
        frame.getContentPane().add(matrix,BorderLayout.CENTER);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}
