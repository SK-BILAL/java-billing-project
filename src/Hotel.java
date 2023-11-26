import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.sql.*;

public class Hotel extends JFrame {

	private JPanel contentPane;
	private JTextField tf11;
	private JTextField tf13;
	private JTextField tf14;
	private JTextField tf15;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JTextField tf5;
	private JTextField tf6;
	private JTextField textField_10;
	private JTextField tf8;
	private JTextField tf9;
	private JTextField tf10;
	private JTextField tf7;
	double t,total;
	double Final;
	JLabel temp=new JLabel();
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hotel frame = new Hotel();
					frame.setVisible(true);
					frame.setSize(750,660);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Hotel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 715, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane panel1 = new JLayeredPane();
		panel1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel1.setForeground(new Color(255, 255, 255));
		panel1.setBackground(new Color(51, 255, 255));
		panel1.setBounds(20, 11, 689, 49);
		contentPane.add(panel1);
		
		JLabel hotel = new JLabel("                       Hotel Billing System ");
		hotel.setBounds(10, 11, 689, 49);
		contentPane.add(hotel);
		hotel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		
		JLayeredPane panel2 = new JLayeredPane();
		panel2.setBackground(new Color(127, 255, 212));
		panel2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel2.setBounds(20, 69, 322, 248);
		contentPane.add(panel2);
		panel2.setLayout(null);
		
		JLabel starters = new JLabel("Starters");
		starters.setBounds(139, 11, 80, 20);
		starters.setFont(new Font("Verdana", Font.BOLD, 17));
		panel2.add(starters);
		
		JLabel banjara = new JLabel("Chicken Banjara ");
		banjara.setBounds(10, 128, 195, 31);
		banjara.setFont(new Font("Lucida Sans Typewriter", Font.ITALIC, 16));
		panel2.add(banjara);
		
		JLabel sikhkabab = new JLabel("Sikh Kabab");
		sikhkabab.setBounds(10, 91, 161, 14);
		sikhkabab.setFont(new Font("Lucida Sans Typewriter", Font.ITALIC, 16));
		panel2.add(sikhkabab);
		
		JLabel tikka = new JLabel("Chicken Tikka");
		tikka.setBounds(10, 43, 140, 14);
		tikka.setFont(new Font("Lucida Sans Typewriter", Font.ITALIC, 16));
		panel2.add(tikka);
		
		JLabel malaitikka = new JLabel("Chicken Malai Tikka");
		malaitikka.setBounds(10, 196, 200, 14);
		malaitikka.setFont(new Font("Lucida Sans Typewriter", Font.ITALIC, 16));
		panel2.add(malaitikka);
		
		tf1 = new JTextField();
		tf1.setBounds(215, 42, 86, 20);
		panel2.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(215, 88, 86, 20);
		tf2.setColumns(10);
		panel2.add(tf2);
		
		tf3 = new JTextField();
		tf3.setBounds(215, 135, 86, 20);
		tf3.setColumns(10);
		panel2.add(tf3);
		
		tf4 = new JTextField();
		tf4.setBounds(215, 193, 86, 20);
		tf4.setColumns(10);
		panel2.add(tf4);
		
		JLayeredPane panel3 = new JLayeredPane();
		panel3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel3.setBounds(345, 71, 354, 248);
		contentPane.add(panel3);
		
		JLabel maincourse = new JLabel("Chicken Main Course");
		maincourse.setFont(new Font("Verdana", Font.BOLD, 18));
		maincourse.setBounds(95, 0, 217, 26);
		panel3.add(maincourse);
		
		JLabel peshawari = new JLabel("Chicken Peshawari");
		peshawari.setFont(new Font("Lucida Sans Typewriter", Font.ITALIC, 16));
		peshawari.setBounds(28, 46, 196, 14);
		panel3.add(peshawari);
		
		JLabel lazeez = new JLabel("Chicken Lazeez");
		lazeez.setFont(new Font("Lucida Sans Typewriter", Font.ITALIC, 16));
		lazeez.setBounds(28, 95, 179, 14);
		panel3.add(lazeez);
		
		JLabel lajawab = new JLabel("Chicken Lajawab");
		lajawab.setFont(new Font("Lucida Sans Typewriter", Font.ITALIC, 16));
		lajawab.setBounds(28, 134, 179, 40);
		panel3.add(lajawab);
		
		JLabel changezi = new JLabel("Chicken Changezi");
		changezi.setFont(new Font("Lucida Sans Typewriter", Font.ITALIC, 16));
		changezi.setBounds(28, 197, 196, 26);
		panel3.add(changezi);
		
		tf5 = new JTextField();
		tf5.setBounds(245, 43, 86, 20);
		panel3.add(tf5);
		tf5.setColumns(10);
		
		tf6 = new JTextField();
		tf6.setColumns(10);
		tf6.setBounds(245, 92, 86, 20);
		panel3.add(tf6);
		
		tf7 = new JTextField();
		tf7.setColumns(10);
		tf7.setBounds(245, 146, 86, 20);
		panel3.add(tf7);
		
		tf8 = new JTextField();
		tf8.setColumns(10);
		tf8.setBounds(245, 194, 86, 20);
		panel3.add(tf8);
		
		JLayeredPane panel4 = new JLayeredPane();
		panel4.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel4.setBounds(20, 328, 689, 146);
		contentPane.add(panel4);
		
		JLabel dessert = new JLabel("Dessert :");
		dessert.setFont(new Font("Arial Black", Font.BOLD, 18));
		dessert.setBounds(27, 11, 115, 59);
		panel4.add(dessert);
		
		JLabel softdrinks = new JLabel("Soft Drinks :");
		softdrinks.setFont(new Font("Arial Rounded MT Bold", Font.BOLD | Font.ITALIC, 18));
		softdrinks.setBounds(27, 81, 148, 40);
		panel4.add(softdrinks);
		
		JLabel pepsi = new JLabel("Pepsi");
		pepsi.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		pepsi.setBounds(214, 81, 46, 20);
		panel4.add(pepsi);
		
		tf11 = new JTextField();
		tf11.setBounds(300, 81, 86, 20);
		panel4.add(tf11);
		tf11.setColumns(10);
		
		JLabel Sprite = new JLabel("Sprite");
		Sprite.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		Sprite.setBounds(451, 81, 57, 20);
		panel4.add(Sprite);
		
		tf13 = new JTextField();
		tf13.setBounds(556, 83, 86, 20);
		panel4.add(tf13);
		tf13.setColumns(10);
		
		JLabel coke = new JLabel("Coke");
		coke.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		coke.setBounds(214, 121, 46, 14);
		panel4.add(coke);
		
		tf14 = new JTextField();
		tf14.setBounds(300, 118, 86, 20);
		panel4.add(tf14);
		tf14.setColumns(10);
		
		JLabel energydrinks = new JLabel("Energy Drink");
		energydrinks.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		energydrinks.setBounds(435, 116, 131, 25);
		panel4.add(energydrinks);
		
		tf15 = new JTextField();
		tf15.setBounds(556, 120, 86, 20);
		panel4.add(tf15);
		tf15.setColumns(10);
		
		JLabel custard = new JLabel("Caramel Custard");
		custard.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 16));
		custard.setBounds(151, 25, 156, 38);
		panel4.add(custard);
		
		tf9 = new JTextField();
		tf9.setBounds(300, 33, 86, 20);
		panel4.add(tf9);
		tf9.setColumns(10);
		
		JLabel falooda = new JLabel("Kulfi Falooda");
		falooda.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 16));
		falooda.setBounds(435, 34, 131, 20);
		panel4.add(falooda);
		
		tf10 = new JTextField();
		tf10.setBounds(556, 33, 86, 20);
		panel4.add(tf10);
		tf10.setColumns(10);
		
		JLayeredPane panel5 = new JLayeredPane();
		panel5.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel5.setBounds(10, 480, 342, 126);
		contentPane.add(panel5);
		
		JTextArea textArea = new JTextArea("");
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textArea.setBounds(10, 52, 146, 63);
		panel5.add(textArea);
		
		JTextArea textArea2 = new JTextArea();
		textArea2.setText("0.");
		textArea2.setBounds(186, 52, 146, 63);
		panel5.add(textArea2);
		
		JLabel SubTotal = new JLabel("Sub Total");
		SubTotal.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		SubTotal.setBounds(10, 11, 131, 14);
		panel5.add(SubTotal);
		
		JLabel Total = new JLabel("Total(GST)");
		Total.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		Total.setBounds(173, 7, 131, 14);
		panel5.add(Total);
		
		JButton totalbtn = new JButton("Total\r\n");
		totalbtn.setBackground(new Color(220, 220, 220));
		totalbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double tv1 = Double.parseDouble(tf1.getText());
				double tv2 = Double.parseDouble(tf2.getText());
				double tv3 = Double.parseDouble(tf3.getText());
				double tv4 = Double.parseDouble(tf4.getText());
				double tv5 = Double.parseDouble(tf5.getText());
				double tv6 = Double.parseDouble(tf6.getText());
				double tv7 = Double.parseDouble(tf7.getText());
				double tv8 = Double.parseDouble(tf8.getText());
				double tv9 = Double.parseDouble(tf9.getText());
				double tv10 = Double.parseDouble(tf10.getText());
				double tv11 = Double.parseDouble(tf11.getText());
				double tv13 = Double.parseDouble(tf13.getText());
				double tv14 = Double.parseDouble(tf14.getText());
				double tv15 = Double.parseDouble(tf15.getText());
		 t = tv1 + tv2 + tv3 + tv4 + tv5 + tv6 + tv7 + tv8 + tv9 + tv10 + tv11 + tv13 + tv14 + tv15 ;
				textArea.setText(" Rs " + t);
			
				
			}
		});
		totalbtn.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD | Font.ITALIC, 20));
		totalbtn.setBounds(361, 480, 89, 67);
		totalbtn.setToolTipText("Click To Total Record");
		contentPane.add(totalbtn);
		
		JButton exitbtn = new JButton("Exit\r\n");
		exitbtn.setBackground(new Color(220, 220, 220));
		exitbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		exitbtn.setToolTipText("Click Here To Exit");
		exitbtn.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD + Font.ITALIC, 20));
		exitbtn.setBounds(480, 480, 89, 67);
		contentPane.add(exitbtn);
		
		JButton clearbtn = new JButton("Clear");
		clearbtn.setBackground(new Color(220, 220, 220));
		clearbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				tf1.setText("0");
				tf2.setText("0");
				tf3.setText("0");
				tf4.setText("0");
				tf5.setText("0");
				tf6.setText("0");
				tf7.setText("0");
				tf8.setText("0");
				tf9.setText("0");
				tf10.setText("0");
				tf11.setText("0");
				tf15.setText("0");
				tf13.setText("0");
				tf14.setText("0");
				textArea.setText("");
				JOptionPane.showMessageDialog(tf1," Your Record Is Reset ");
			
			}
		});
		
		clearbtn.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
		clearbtn.setBounds(371, 565, 117, 35);
		clearbtn.setToolTipText(" Click Here To Reset");
		contentPane.add(clearbtn);
		
		JButton savebtn = new JButton("Save");
		savebtn.setBackground(new Color(220, 220, 220));
		savebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String col1 = tf1.getText();
				String col2 = tf2.getText();
				String col3 = tf3.getText();
				String col4 = tf4.getText();
				String col5 = tf5.getText();
				String col6 = tf6.getText();
				String col7 = tf7.getText();
				String col8 = tf8.getText();
				String col9 = tf9.getText();
				String col10 = tf10.getText();
				String col11 = tf11.getText();
				String col13 = tf13.getText();
				String col14 = tf14.getText();
				String col15 = tf15.getText();
				String ttl = textArea.getText();
				
				try
				{
				 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
						 
				 String query = "INSERT INTO ptable values ('" +col1+"', '"+col2+"', '"+col3+"', '"+col4+"', '"+col5+"',"
				 		+ " '"+col6+"', '"+col7+"', '"+col8+"', '"+col9+"', '"+col10+"', '"
						 +col11+"', '"+col13+"', '"+col14+"', '"+col15+"', '"+ttl +"')";
					
				 Statement st = con.createStatement();
				 int x = st.executeUpdate(query);
				 con.close();
				}
				catch(Exception ex)
				{
				System.out.println(ex);	
				}
				
				JOptionPane.showMessageDialog(tf1," Your Record Has been Saved ");
				
			}
		}
		);
		
		savebtn.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD | Font.ITALIC, 20));
		savebtn.setToolTipText("Click Here to Save Record");
		savebtn.setBounds(600, 480, 89, 67);
		contentPane.add(savebtn);
		
		JButton gst = new JButton("Add GST(8%)");
		gst.setBackground(new Color(220, 220, 220)); 
	
		gst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			 total= (t * 8)/100;
			 Final = total + t;
			 textArea2.setText("" +Final);
			 
			 JOptionPane.showMessageDialog(temp," Your Final Amount is ");
				
			 
			}
		});
		gst.setToolTipText("Calculate GST");
		gst.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		gst.setBounds(523, 565, 166, 35);
		contentPane.add(gst);
	}
}
 