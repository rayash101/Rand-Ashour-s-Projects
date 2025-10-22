package pack;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JTextField;

abstract class Customer extends JFrame implements ActionListener {

    String email;
    String name;
    String phone;
    JTextField textfieldName = new JTextField(20);
    JTextField textfieldPhone = new JTextField(20);
    JTextField textfieldEmail = new JTextField(20);
    JTextField textfield;
    JLabel namebutton;
    JLabel phonebutton;
    JLabel emailbutton;
    JButton Submit = new JButton ("Submit");
    JFrame info = new JFrame("Customer Information");

    public Customer(String email, String name, String phone) {
        this.email=email;
        this.name=name;
        this.phone=phone;
    }

    //EMAIL
    public String getEmail() {
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }

    //NAME
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    //PHONE NUMBER
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone=phone;
    }

    private String payCoffee() {
        return payCoffee();
    }
    public void openInformation(){
        email = JOptionPane.showInputDialog("Before you make an order with us, please enter the following information. Enter your email:");
        name = JOptionPane.showInputDialog("Your name:");
        phone = JOptionPane.showInputDialog("And your phone number:");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Submit);
        this.getName();
        this.getEmail();
        this.getPhone();
        textfieldName.setText("  ");
        textfieldPhone.setText("  ");
        textfieldEmail.setText("  ");
    }
}
class ConcreteCustomer extends Customer {
    public ConcreteCustomer(String email, String name, String phone) {
        super(email, name, phone);
    }
}

