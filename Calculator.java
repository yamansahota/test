import java.awt.*;

public class Calculator extends java.awt.Frame {

    public Calculator() {
        setTitle("Calculator");

        Frame p1 = new Frame("Calculator");
        p1.setVisible(true);
        setSize(400, 700);

        TextField display = new TextField();
        display.setBounds(750, 200, 500, 40);

        Button[] digits = new Button[10];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = new Button(String.valueOf(i));
        }

        Button[] operators = new Button[] {
                new Button("+"),
                new Button("-"),
                new Button("*"),
                new Button("/")
        };

        Button equals = new Button("=");
        equals.setBounds(100, 100, 100, 100);


        p1.add(display);
        for (Button digit : digits) {
            p1.add(digit);
        }
        for (Button operator : operators) {
            p1.add(operator);
        }
        p1.add(equals);

        add(p1);

        setLayout(new FlowLayout());

        setVisible(true);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }
}