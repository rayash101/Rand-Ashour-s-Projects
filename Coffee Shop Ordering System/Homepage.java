package pack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Homepage implements ActionListener {
    private static int Whipcream = 45;
    private static int Sprinkles = 10;
    private static int Whole=100;
    private static int Soy=100;
    private static int Oat=100;
    private Cappuccino cappu;
    private JFrame mainFrame;
    private JButton Cappucchino;
    private JButton espresso;
    private JButton FilteredCoffee;
    private JButton ViewCart;
    private JButton PlaceOrder;

    public Homepage(JButton Cappucchino, JButton espresso, JButton FilteredCoffee, JButton ViewCart, JButton PlaceOrder, JFrame mainFrame) {
        this.Cappucchino = Cappucchino;
        this.espresso = espresso;
        this.FilteredCoffee = FilteredCoffee;
        this.ViewCart= ViewCart;
        this.PlaceOrder=PlaceOrder;
        this.mainFrame = mainFrame;

        //for action listeners

        this.Cappucchino.addActionListener(this);
        this.espresso.addActionListener(this);
        this.FilteredCoffee.addActionListener(this);
        this.ViewCart.addActionListener(this);
        this.PlaceOrder.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Cappucchino) {
            openNewCappu();
        } else if (e.getSource() == espresso) {
            openNewEspresso();
        } else if (e.getSource() == FilteredCoffee) {
            openNewFilteredCoffee();
        } else if (e.getSource()== ViewCart) {
            openNewViewCart();
        }else if(e.getSource()==PlaceOrder){
            openNewPlaceOrder();
        } else {
            System.out.println("Unknown button clicked");
        }
    }
    public void openNewCappu(){
        cappu = new Cappuccino("Cappuccino", 3, "Delicious cappuccino with foam", 120);
            //Labels
            JLabel nameLabel = new JLabel("Name: " + cappu.getName());
            JLabel priceLabel = new JLabel("Price: $" + cappu.getPrice());
            JLabel descriptionLabel = new JLabel("Description: " + cappu.getDescription());
            JLabel caloriesLabel = new JLabel("Base Calories: " + cappu.getBaseCalories());
            //Frame
            JFrame newFrame = new JFrame("Cappucchino");
            newFrame.setLayout(new GridLayout(4, 1));
            newFrame.setSize(600, 800);
            newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            newFrame.add(nameLabel);
            newFrame.add(priceLabel);
            newFrame.add(descriptionLabel);
            newFrame.add(caloriesLabel);
            newFrame.setVisible(true);
            mainFrame.dispose();
        }

    //makes the GUI run!
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("GridBagLayoutDemo");
        frame.setPreferredSize(new Dimension(600,800));
        frame.getContentPane().setBackground(new Color (255,255,255) );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainMenu menu= new MainMenu();
        frame.setContentPane(menu.getContentPane());
        //Display the window.
        frame.pack();
        frame.setVisible(true);

    }
    public void openNewEspresso() {
        //String name, int price, String description, int shots, int baseCalories, String milkType, String otherIng, int milkTypeCal, int OICal, int numOI
        Espresso espress = new Espresso("Espresso", 3, "Delicious Espresso coffee that will make you awake", 5, 5, "", " are additional ingredients", 115, 0, 2);
        //Labels
        JTextArea name = new JTextArea("Name: " + espress.getName());
        JTextArea price = new JTextArea("Price: $" + espress.getPrice());
        JTextArea description = new JTextArea("Description: " + espress.getDescription());
        JTextArea calories = new JTextArea("Base Calories for espresso: " + espress.getBaseCalories());
        JTextArea shots = new JTextArea("Shots (max 5 shots): " + espress.getShots());
        JTextArea milk = new JTextArea("Three milk types are soy, oat, and whole to choose from" + espress.getMilkType());
        JTextArea other = new JTextArea(" Whipcream and sprinkles" + espress.getOtherIng());
        JTextArea Milkcal = new JTextArea("Calories for milk:" + espress.getMilkTypeCal());
        JTextArea oiCal = new JTextArea("Number of calories for additional ingredients " + espress.getOICal());
        JTextArea numOI = new JTextArea("number of other ingredients: " + espress.getNumOI());
        //had to use JTextArea to wrap text, description was too long lol
        JTextArea[] textAreas = {name, price, calories, shots, milk, other, Milkcal, oiCal, numOI};
        for (JTextArea textArea : textAreas) {
            textArea.setWrapStyleWord(true);
            textArea.setLineWrap(true);
            textArea.setEditable(false);
        }
        //Checkbox for user
        JCheckBox whipCreamCheckbox = new JCheckBox("Whipcream");
        JCheckBox sprinklesCheckbox = new JCheckBox("Sprinkles");
        JCheckBox wholeMilkCheckbox = new JCheckBox("Whole");
        JCheckBox oatMilkCheckbox = new JCheckBox("Oat");
        JCheckBox soyMilkCheckbox = new JCheckBox("Soy");
        //Some framework
        JFrame newFrame = new JFrame("Espresso");
        newFrame.setLayout(new GridLayout(4, 1));
        newFrame.setSize(800, 800);
        newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ActionListener checkboxListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int calories = espress.getBaseCalories();
                if (wholeMilkCheckbox.isSelected()) {
                    calories += Whole;
                    oatMilkCheckbox.setSelected(false);
                    soyMilkCheckbox.setSelected(false);
                } else if (soyMilkCheckbox.isSelected()) {
                    calories += Soy;
                    wholeMilkCheckbox.setSelected(false);
                    oatMilkCheckbox.setSelected(false);
                }
                if (oatMilkCheckbox.isSelected()) {
                    calories += Oat;
                    wholeMilkCheckbox.setSelected(false);
                    soyMilkCheckbox.setSelected(false);
                }
            }

            public void anotherActionPerformed(ActionEvent e) {
                int calorie = espress.getBaseCalories();
                if (sprinklesCheckbox.isSelected()) {
                    calorie += Sprinkles;
                    if (whipCreamCheckbox.isSelected()) {
                        calorie += Whipcream;
                    }
                }
                oiCal.setText("Number of calories for additional ingredients " + calories);
            }
        };

                //Frame
        whipCreamCheckbox.addActionListener(checkboxListener);
        sprinklesCheckbox.addActionListener(checkboxListener);
                newFrame.add(name);
                newFrame.add(price);
                newFrame.add(description);
                newFrame.add(calories);
                newFrame.add(shots);
                newFrame.add(milk);
                newFrame.add(other);
                newFrame.add(Milkcal);
                newFrame.add(oiCal);
                newFrame.add(numOI);
                newFrame.add(whipCreamCheckbox);
                newFrame.add(sprinklesCheckbox);
                newFrame.add(soyMilkCheckbox);
                newFrame.add(wholeMilkCheckbox);
                newFrame.add(oatMilkCheckbox);
                newFrame.setLayout(new GridLayout(4, 2, 10, 10));
                newFrame.setSize(1000, 800);
                newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                newFrame.setVisible(true);
                mainFrame.dispose();
            }
    public void openNewFilteredCoffee(){
        //String name, int price, String description, int calories, String brewType
        FilteredCoffee filter= new FilteredCoffee("Filtered Coffee", 3, "Coffee that lets you put your heart and dreams in it!", 100, "Different brew types to pick from!");
        JFrame newFrame = new JFrame("Filtered Coffee");
        newFrame.setSize(600, 800);
        newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        newFrame.setVisible(true);
        mainFrame.dispose();
    }
    public void openNewViewCart(){
        JFrame newFrame = new JFrame("View Cart");
        newFrame.setSize(600, 800);
        newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        newFrame.setVisible(true);
        mainFrame.dispose();
    }
    public void openNewPlaceOrder(){
        JFrame newFrame = new JFrame("Place Order");
        newFrame.setSize(600, 800);
        newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        newFrame.setVisible(true);
        mainFrame.dispose();
    }
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                String email=null, name=null, phone=null;
                ConcreteCustomer custom=new ConcreteCustomer(email,name,phone);
                custom.openInformation();
                createAndShowGUI();

            }
        });
    }
}
