package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculators extends JFrame implements ActionListener {
    JTextField textField;
    JPanel panel;
    JButton[] numberButton = new JButton[10];
    JButton[] functionButton = new JButton[9];
    JButton addButton,subButton,mulButton,divButton,
    decButton,equButton,delButton,clrButton,negButton;

    Font myFont = new Font("Ink Free",Font.BOLD,30);
    double num1 = 0, num2 = 0, result = 0;
    char operator;


    public Calculators() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,550);
        this.setTitle("Calculator");
        this.setLayout(null);
        textField = new JTextField();
        textField.setBounds(50,25,300,50);
        textField.setFont(myFont);
        textField.setEditable(false);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Del");
        clrButton = new JButton("Clr");
        negButton = new JButton("(-)");

        functionButton[0] = addButton;
        functionButton[1] = subButton;
        functionButton[2] = mulButton;
        functionButton[3] = divButton;
        functionButton[4] = decButton;
        functionButton[5] = equButton;
        functionButton[6] = delButton;
        functionButton[7] = clrButton;
        functionButton[8] = negButton;

        for(int i = 0; i<9;i++){
            functionButton[i].addActionListener(this);
            functionButton[i].setFont(myFont);
            functionButton[i].setFocusable(false);
        }

        for(int i = 0; i<10; i++){
            numberButton[i] = new JButton(String.valueOf(i));
            numberButton[i].setFocusable(false);
            numberButton[i].addActionListener(this);
            numberButton[i].setFont(myFont);
        }

        delButton.setBounds(50,430,145,50);
        clrButton.setBounds(205,430,145,50);
        negButton.setBounds(40,430,50,50);

        panel = new JPanel();
        panel.setBounds(50,100,300,300);
        panel.setLayout(new GridLayout(4,4,10,10));

        panel.add(numberButton[1]);
        panel.add(numberButton[2]);
        panel.add(numberButton[3]);
        panel.add(addButton);
        panel.add(numberButton[4]);
        panel.add(numberButton[5]);
        panel.add(numberButton[6]);
        panel.add(subButton);
        panel.add(numberButton[7]);
        panel.add(numberButton[8]);
        panel.add(numberButton[9]);
        panel.add(mulButton);
        panel.add(numberButton[0]);
        panel.add(decButton);
        panel.add(equButton);
        panel.add(divButton);

        this.add(negButton);
        this.add(panel);
        this.add(delButton);
        this.add(clrButton);
        this.add(textField);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i = 0; i< 10; i++){
            if(e.getSource() == numberButton[i]){
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
        if(e.getSource() == decButton){
            textField.setText(textField.getText().concat("."));
        }
        if(e.getSource() == addButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
    //        textField.setText(textField.getText().concat("+"));
            textField.setText("");
        }
        if(e.getSource() == subButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
      //      textField.setText(textField.getText().concat("-"));
            textField.setText("");
        }
        if(e.getSource() == mulButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
      //      textField.setText(textField.getText().concat("*"));
            textField.setText("");
        }
        if(e.getSource() == divButton){
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
        //    textField.setText(textField.getText().concat("/"));
            textField.setText("");
        }
        if(e.getSource() == negButton){
            Double temp = Double.parseDouble(textField.getText());
            temp*=-1;
            textField.setText(String.valueOf(temp));
        }

        if(e.getSource() == equButton){

            num2 = Double.parseDouble(textField.getText());

            switch (operator){
                case '+': result = num1 + num2;
                break;
                case '-': result = num1 - num2;
                break;
                case '*': result = num1 * num2;
                break;
                case '/': result = num1 / num2;
                break;
            }
            textField.setText(String.valueOf(result));
      //      num1 = result;
        }
        if(e.getSource() == clrButton){
            textField.setText("");
        }
        if(e.getSource() == delButton){
            String temString = textField.getText();
            textField.setText("");
            for(int i=0; i<temString.length()-1; i++){
                textField.setText(textField.getText() + temString.charAt(i));
            }

        }

    }
}
