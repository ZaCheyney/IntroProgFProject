/****************************************************************/
 /* Program Name: Lab 3                                         */
 /*                                                             */
 /* Student Name: Zachary Cheyney                               */
 /* Semester: Fall 2018                                         */
 /* Class-Section: CoSc10403-15                                 */
 /* Instructor: Sanchez-Aguilar                                 */
 /*													            */
 /* Program Overview: 								            */
 /* This program creates a simple Java display to represent     */
 /* a sandwich ordering system                                  */ 
 /* Input:                                                      */
 /* There is no user input to this program.                     */
 /*                                                             */
 /* Output:                                                     */
 /* An applet displaying a GUI with various widgets including   */
 /* buttons, labels, scrolling lists, and radio selections      */
 /*                                                             */
 /*                                                             */
 /* Program Limitations:                                        */
 /* The buttons are inactive.                                   */
 /*                                                             */
 /*                                                             */
 /*                                                             */
 /***************************************************************/ 

//Imports
import javax.swing.*;
import java.applet.*;
import java.awt.*;
import java.io.File;

public class Lab3 extends JFrame {
	//Shop Name
	public JLabel shopName = new JLabel("SCHNELLWICH");
	//Shop Image 1
	public Image shop1 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Zach Cheyney\\eclipse-workspace\\Lab3\\src\\Lab3Images\\images\\sign1.jpg");
	public ImageIcon shopIc1 = new ImageIcon(shop1);
	public JLabel shopImgLabel1 = new JLabel(shopIc1);
	//Shop Image 2
	public Image shop2 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Zach Cheyney\\eclipse-workspace\\Lab3\\src\\Lab3Images\\images\\sign2.jpg");
	public ImageIcon shopIc2 = new ImageIcon(shop2);
	public JLabel shopImgLabel2 = new JLabel(shopIc2);
	//Sandwich Display (Label, Arr, List)
	public JLabel wichesLabel = new JLabel("Sandwiches:");
	public String[] wichesArr = {"Select Sandwich", "Burger", "Cheeseburger", "Veggie", "Ham and Cheese"};
	public JList<String> wichesList = new JList<String>(wichesArr);
	//Drink Display (Label, Arr, List)
	public String[] drinkArr = {"Select Drink", "Coffee", "Cola", "Tea", "Water"};
	public JLabel drinkLabel = new JLabel ("Drinks:");
	public JList<String> drinkList = new JList<String>(drinkArr);
	//Sides Display (Label, Arr, List)
	public JLabel sideLabel = new JLabel ("Sides: ");
	public String[] sideArr = {"Select Side", "Fries", "Chips", "Okra", "Onion Ring"};
	public JList<String> sideList = new JList<String>(sideArr);
	//Size Display
	public String[] sizeArr = {"Select Size", "Small", "Medium", "Large", "Extra Large"};
	public JComboBox<String> sizeComboBox = new JComboBox<>(sizeArr);
	//Sound Box
	public JCheckBox soundBox = new JCheckBox("Sounds on");
	//Animation Box
	public JCheckBox animationBox = new JCheckBox("Animation on");
	//Grilled Box
	public JCheckBox grillBox = new JCheckBox ("Grilled?");
	//Prices
	public JTextArea pricesText = new JTextArea("\tPrices\nSmall\t$5.50\nMedium\t$7.00\nLarge\t$8.50\nExtra Large\t$9.50"); 
	//Open to Close times
	public JTextArea openText = new JTextArea("   Open from 8AM-12AM Sunday thru Saturday   ");
	//Order Button Image
	public Image orderImg = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Zach Cheyney\\eclipse-workspace\\Lab3\\src\\Lab3Images\\images\\submit.gif");
	public ImageIcon orderIc = new ImageIcon(orderImg);
	//Order Button
	public JButton orderButton = new JButton ("Place Order", orderIc);
	//Cancel Order Button Image
	public Image cancelImg = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Zach Cheyney\\eclipse-workspace\\Lab3\\src\\Lab3Images\\images\\cancel.gif");
	public ImageIcon cancelIc = new ImageIcon (cancelImg);
	//Cancel Order Button
	public JButton cancelButton = new JButton ("Cancel Order", cancelIc);
	//Color
	public Font snellFont = new Font("Lucida Bright", Font.BOLD, 28);
	public Font snellSub = new Font("Lucida Bright", Font.BOLD, 14);
	//JPanels for rows
	public JPanel row1 = new JPanel(new GridLayout(1,3,20,0));
	public JPanel row2 = new JPanel(new GridLayout(1,4,0,0));
	public JPanel row2_1 = new JPanel(new BorderLayout());
	public JPanel row2_2 = new JPanel(new BorderLayout());
	public JPanel row2_3 = new JPanel(new BorderLayout());
	public JPanel row2_4 = new JPanel(new BorderLayout());
	public JPanel row3 = new JPanel(new GridLayout(1,3,20,0));
	public JPanel row3Buttons = new JPanel(new GridLayout(2,1));
	//Scrolling Panels
	public JScrollPane wichesPane = new JScrollPane(wichesList);
	public JScrollPane drinkPane = new JScrollPane(drinkList);
	public JScrollPane sidePane = new JScrollPane(sideList);
	//Set Colors
	public Color bkg = new Color(194, 66, 244);
	public Color snellGray = new Color(182, 179, 183);
	//Sound
	AudioClip ohSound;
	
	public static void main (String args[])
	{
		new Lab3();
	}
	
	public void setRow1()
	{
		//First Photo
		row1.add(shopImgLabel1);
		row1.setBackground(bkg);
		//shopName
		row1.add(shopName);
		shopName.setFont(snellFont);
		//Second Photo
		row1.add(shopImgLabel2);
	}
	
	public void setRow2()
	{
		//Second row 1st panel
		row2.add(row2_1);
		row2_1.setBackground(snellGray);
		//Sandwich Label
		row2_1.add(wichesLabel, BorderLayout.NORTH);
		wichesLabel.setFont(snellSub);
		//Sandwich List
		row2_1.add(wichesPane,BorderLayout.SOUTH);
		wichesList.setSelectedIndex(0);
		wichesList.setVisibleRowCount(3);
		wichesList.setBackground(snellGray);
		wichesList.setFont(snellSub);
		//Second row 2nd panel
		row2.add(row2_2);
		row2_2.setBackground(snellGray);
		//Drink Label
		row2_2.add(drinkLabel, BorderLayout.NORTH);
		drinkLabel.setFont(snellSub);
		//Drink List
		drinkList.setVisibleRowCount(3);
		row2_2.add(drinkPane, BorderLayout.SOUTH);
		drinkList.setBackground(snellGray);
		drinkList.setFont(snellSub);
		drinkList.setSelectedIndex(0);
		//Second row 3rd panel
		row2.add(row2_3);
		row2_3.setBackground(snellGray);
		//Side Label
		row2_3.add(sideLabel, BorderLayout.NORTH);
		sideLabel.setFont(snellSub);
		//Side List
		row2_3.add(sidePane, BorderLayout.SOUTH);
		sideList.setVisibleRowCount(3);
		sideList.setBackground(snellGray); 
		sideList.setFont(snellSub);
		sideList.setSelectedIndex(0);
		//Second row 4th Panel
		row2.add(row2_4);
		row2_4.setBackground(snellGray);
		//Size Box
		row2_4.add(sizeComboBox, BorderLayout.NORTH);
		sizeComboBox.setFont(snellSub);
		sizeComboBox.setBackground(snellGray);
		//Sound Box
		row2_4.add(soundBox, BorderLayout.EAST);
		soundBox.setFont(snellSub);
		soundBox.setBackground(snellGray);
		//Animation Box
		row2_4.add(animationBox, BorderLayout.WEST);
		animationBox.setFont(snellSub);
		animationBox.setBackground(snellGray);
		//Grill Box
		row2_4.add(grillBox, BorderLayout.SOUTH);
		grillBox.setFont(snellSub);
		grillBox.setBackground(snellGray);
	}
	
	public void setRow3()
	{
		//Third row panel
		//Prices
		row3.add(pricesText);
		row3.setBackground(bkg);
		pricesText.setFont(snellSub);
		pricesText.setBackground(bkg);
		//Button Panel
		row3.add(row3Buttons);
		//Order Button
		row3Buttons.add(orderButton);
		orderButton.setBackground(bkg);
		orderButton.setFont(snellSub);
		//Cancel Button
		row3Buttons.add(cancelButton);
		cancelButton.setBackground(bkg);
		cancelButton.setFont(snellSub);
		//Open
		add(openText);
		openText.setBackground(bkg);
		openText.setFont(snellSub);
	}
	
    public void getSoundsApp()    
    {
      File myFile;
      try{  myFile = new File("C:\\Users\\Zach Cheyney\\eclipse-workspace\\Lab5\\src\\lab5Sounds\\sounds\\oh.wav");
            ohSound = JApplet.newAudioClip(myFile.toURI().toURL());
         }
      catch (Exception e) {}
    }
	
	public Lab3()
	{	setTitle ("Welcome to SNELLWICH");
		
		setRow1();
		add(row1);
		
		setRow2();
		add(row2);
		
		setRow3();
		add(row3);
		
		//Set display size
		setBounds(200, 200, 950, 410);
	 	setVisible(true);
	 	setLayout(new FlowLayout());
	 	getContentPane().setBackground(bkg);  
	 	//Console Feedback
	 	System.out.println("Code ran successfully"); 
	}
}
