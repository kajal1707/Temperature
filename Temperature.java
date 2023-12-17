import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
class Temperature extends JFrame implements ActionListener,WindowListener
{
    JLabel lblTemp,lblRs,lblTitle;
    JTextField txtTemp,txtRs;
    JButton btnCel,btnFeh;
    JPanel p1;
    public Temperature()
    {
        super("Temperature Convertor");
        p1=new JPanel(null);
        add(p1);
      
        Border b=BorderFactory.createLineBorder(Color.MAGENTA);
        p1.setBorder(b);
        p1.setBackground(Color.PINK);
        
        Font titleFont=new Font("arial",Font.BOLD+Font.ITALIC,30);
        lblTitle=new JLabel("Temperature Convertor");
        lblTitle.setBounds(150,50,450,30);
        lblTitle.setFont(titleFont);
        
        Font txtf =new Font("arial",Font.PLAIN,20);
        
        lblTemp=new JLabel("Enter Temperature:");
        lblTemp.setBounds(100,150,250,30);
        lblTemp.setFont(txtf);
        txtTemp=new JTextField(40);
        txtTemp.setBounds(350,150,250,30);
         txtTemp.setFont(txtf);
          
         lblRs=new JLabel("Result:");
        lblRs.setBounds(100,200,250,30);
        lblRs.setFont(txtf);
        txtRs=new JTextField(40);
        txtRs.setBounds(350,200,250,30);
        txtRs.setFont(txtf);
        
        btnCel=new JButton("Celsius");
        btnCel.setBounds(100,250,150,30);
        btnCel.setFont(txtf);
        btnFeh=new JButton("Fahrenheit");
        btnFeh.setBounds(300,250,150,30);
        btnFeh.setFont(txtf);
        
        p1.add(lblTitle);
        p1.add(lblTemp);  p1.add(txtTemp);
        p1.add(lblRs);   p1.add(txtRs);
        p1.add(btnCel);  p1.add(btnFeh);
        
        addWindowListener(this);
        btnCel.addActionListener(this);
        btnFeh.addActionListener(this);
        
        setSize(800,500);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        Object obj=e.getSource();
        double temp=Double.valueOf(txtTemp.getText());
       
        if(obj==btnCel)
        {
                double rs=0;
                rs=(temp - 32) * 5/9;
             txtRs.setText(String.valueOf(rs));
        } 
        if(obj==btnFeh)
        {   
                double rs=0;
                rs=(temp*(1.8)) + 32;
                txtRs.setText(String.valueOf(rs));
        }  
    }
    public static void  main(String args[])
    {
        Temperature t=new Temperature();
    }      

    
    public void windowOpened(WindowEvent e) 
    {
       
    }
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
    public void windowClosed(WindowEvent e) 
    {
        
    }
    public void windowIconified(WindowEvent e) 
    {
       
    }
  public void windowDeiconified(WindowEvent e) 
    {
        
    }
    public void windowActivated(WindowEvent e) 
    {
        
    }
    public void windowDeactivated(WindowEvent e) 
    {
       
    }
}
