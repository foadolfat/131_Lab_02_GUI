import java.awt.*;
import javax.swing.*;

/**
 * A window containing a PIN entry pad.
 */
public class PINPadWindow extends JFrame
{
    /**
     * Default Constructor.
     */
    public PINPadWindow()
    {
        super();
        setupLayout();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //pack();
        setResizable(false); 
    }

    /**
     * Setup and layout this PINPadWindow
     */
    private void setupLayout()
    {
    	// Layout this PINPadWindow
        Container contentPane;
        contentPane = getContentPane();
        setSize(300, 300);
        setLayout(new BorderLayout());
        Display display = new Display();
        NumberPad numPad = new NumberPad(display);
        display.setText("Enter your PIN");
        display.setForeground(Color.GRAY);
        add(display, BorderLayout.NORTH);
        add(numPad, BorderLayout.CENTER);
        
         
    }
}