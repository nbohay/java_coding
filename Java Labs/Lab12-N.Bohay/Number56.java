/*Nicholas Bohay
Assignment 12
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

        
public class Number56 extends JFrame{
    private Container number;
    private JLabel operandLabel, resultLabel, result;
    private JTextField operand;
    private JButton rolldie;
    
public Number56(){
    super("Die Roll Guessing");
    number=getContentPane();
    number.setLayout(new FlowLayout());
    
    operandLabel= new JLabel("Enter a number from 1 to 6");
    operand= new JTextField(1);
    
    rolldie=new JButton("Roll Die");
    
    resultLabel= new JLabel("Result:");
    result = new JLabel("???");
    
    number.add(operandLabel);
    number.add(operand);
    number.add(rolldie);
    number.add(resultLabel);
    number.add(result);
    
    ButtonHandler bh= new ButtonHandler();
    
    rolldie.addActionListener(bh);
    
    setSize(200,200);
    setVisible(true);
    }


private class ButtonHandler implements ActionListener{
    public void actionPerformed(ActionEvent ae)
    {
        double dieResult = (int)(Math.random()*6) + 1;
        try{
            double op=Double.parseDouble(operand.getText());
        if (op > 6|| op<1){
            result.setText("???");
               
        }
        else 
            result.setText(new Double(dieResult).toString());
        if(dieResult==op)
                result.setText(dieResult+" YOU WIN!");
       
        }
        catch(NumberFormatException e){
            operandLabel.setText("Enter a number from 1 to 6");
            operand.setText("");
            result.setText("???");
        }
    }
}

public static void main(String [] args){
    Number56 sm= new Number56();
    sm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

}
