import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * A numeric keypad
 */
public class NumberPad extends    JPanel
{
    /**
     * Default Constructor
     */
	private ActionListener listener;
    public NumberPad(ActionListener listener)
    {
        super();
        this.listener = listener;
        setupLayout();
    }

    /**
     * Setup and layout this NumberPad
     */
    private void setupLayout()
    {
    	setLayout(new GridLayout(4,3));
    	for(int i=1; i<=9; i++) {
    		String val = Integer.toString(i);
            JButton btn = new JButton(val);
            btn.addActionListener(listener);
        	add(btn);
        	
        }
    	JButton Del = new JButton("Del");
    	Del.addActionListener(listener);
        add(Del);
        JButton Zero = new JButton("0");
        Zero.addActionListener(listener);
        add(Zero);
        JButton C = new JButton("C");
        C.addActionListener(listener);
        add(C);
        // Setup and layout this NumberPad
    }
}
