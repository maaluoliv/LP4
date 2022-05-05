package vetor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraBovina extends JFrame {

    double qtdArroba, valArroba, total;
    private JButton totalButton;
    private JTextField qtdArrobaTextField;
    private JTextField valArrobaTextField;
    private JPanel calculadora;

    public CalculadoraBovina() {
        totalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valArroba = Double.parseDouble(valArrobaTextField.getText());
                qtdArroba = Double.parseDouble(qtdArrobaTextField.getText());
                total = valArroba*qtdArroba;

//                JOptionPane.showMessageDialog(null,"O valor a pagar é R$ %.2f " + total);
                JOptionPane.showMessageDialog(null,String.format("O valor a pagar é R$ %.2f ", total));


            }
        });
    }

    public static void main(String[] args) {
       CalculadoraBovina calculadora = new CalculadoraBovina();
        calculadora.setContentPane(calculadora.calculadora);
        calculadora.setTitle("Calculadora");
        calculadora.setSize(450, 300);
        calculadora.setVisible(true);
        calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
