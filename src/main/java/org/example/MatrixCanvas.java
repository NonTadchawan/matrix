package org.example;

import javax.swing.*;
import java.awt.*;

public class MatrixCanvas extends JLabel {
    int matrixSize;
    Dimension size;

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        size = getSize();
        drawMatrix(g2);
    }

    public void drawMatrix(Graphics2D g2) {

        for (int i = 1; i <= matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                for (int k = 0; k < matrixSize; k++) {
                    if ((i == (k + 1) || i == (matrixSize - k)) && (j == k || j == (matrixSize - (k + 1)))) {
                        g2.setColor(Color.BLACK);
                    }
                }
                if (matrixSize==1){
                    g2.fillRect(470, 50 , 60, 60);
                    g2.setColor(Color.black);
                }
                if (matrixSize > 14) {
                    g2.fillRect(size.width / matrixSize + (i * 30), 50 + (j * 30), 30, 30);
                    g2.setColor(Color.GREEN);
                } else {
                    g2.fillRect(size.width / matrixSize + (i * 60), 50 + (j * 60), 60, 60);
                    g2.setColor(Color.GREEN);
                }
            }
        }
    }

    public void setMatrixSize(int matrixSize) {
        this.matrixSize = matrixSize;
    }
}
