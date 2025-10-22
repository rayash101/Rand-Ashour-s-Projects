package pack;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class MainMenu extends JFrame {
    private JButton espresso;
    private JButton FilteredCoffee;
    private JButton Cappucchino;
    private JButton ViewCart;
    private JButton PlaceOrder;

    ///https://docs.oracle.com/javase/tutorial/displayCode.html?code=https://docs.oracle.com/javase/tutorial/uiswing/examples/layout/GridBagLayoutDemoProject/src/layout/GridBagLayoutDemo.java
// I used this code as a base for mine
    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;

    public MainMenu() {

        //components to pane for welcome message
        if (RIGHT_TO_LEFT) {
            setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        }
        JLabel welcome;
        setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();
        if (shouldFill) {
            //natural height, maximum width
            g.fill = GridBagConstraints.HORIZONTAL;
        }

        welcome = new JLabel("Welcome to Calico Coffee!");
        welcome.setOpaque(true);
        welcome.setBackground(new Color(255,255,255));
        welcome.setHorizontalAlignment(JLabel.CENTER);
//		   g.gridy = 0;
//		   g.gridx = 0;
        add(welcome);

    //Components to pane for buttons
        //pane.addActionListener();
        if (RIGHT_TO_LEFT) {
            setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        if (shouldFill) {
            //natural height, maximum width
            c.fill = GridBagConstraints.HORIZONTAL;
        }

        espresso= new JButton("Espresso");
        if (shouldWeightX) {
            c.weightx = 0.5;
        }
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 1;
        add(espresso, c);

        FilteredCoffee= new JButton("Filtered Coffee");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 1;
        add(FilteredCoffee, c);


        Cappucchino= new JButton("Cappuccino");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 1;
        add( Cappucchino, c);

//	    button = new JButton("Long-Named Button 4");
//	    c.fill = GridBagConstraints.HORIZONTAL;
//	    c.ipady = 40;      //make this component tall
//	    c.weightx = 0.0;
//	    c.gridwidth = 3;
//	    c.gridx = 0;
//	    c.gridy = 2;
//	    pane.add(button, c);

        PlaceOrder = new JButton("Place Order");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 0;       //reset to default
        //c.weighty = 1.0;   //request any extra vertical space
        c.anchor = GridBagConstraints.PAGE_END; //bottom of space
        //c.insets = new Insets(10,0,0,0);  //top padding
        c.gridx = 2;       //aligned with button 2
        // c.gridwidth = 2;   //2 columns wide
        c.gridy = 2;       //third row
        add(PlaceOrder, c);

        ViewCart = new JButton("View Cart");
        //c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 0;       //reset to default
        //c.weighty = 1.0;   //request any extra vertical space
        // c.anchor = GridBagConstraints.PAGE_END; //bottom of space
        //c.insets = new Insets(10,0,0,0);  //top padding
        c.gridx = 1;       //aligned with button 2
        c.gridwidth = 1;   //2 columns wide
        c.gridy = 2;       //third row
        add(ViewCart, c);

        Homepage homepage = new Homepage(Cappucchino, espresso, FilteredCoffee, ViewCart, PlaceOrder, this);

    }

    //JLabel displaying # of items within cart
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */


            // button4.addActionListener(buttonListener);
            //   button3.addActionListener(buttonListener);


}

//make gui!!!!!!!
//implement actionlisteners
//implement actionlisteners all the buttons
//once done with actionlisteners, make other frames, basically once done tapping button, it should take you to the respective button's page
//when doing the other frames, TRY to implement hide on close.
//try to implement back button on bottom left corner (worry about this after implementinmg action listeners.
//center welcome
//make welcome message a separate panel
