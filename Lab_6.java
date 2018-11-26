import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Lab_6 extends Lab3 implements ActionListener, ListSelectionListener
{
	public Lab_6Model m = new Lab_6Model(this);

	//Declare Variables
	public String grill;
	public String price;
	public String sandwich;
	public String side;
	public String drink;
	public String size;
	public String orderText;
	//Declare JLabels
	public JLabel orderDisplay = new JLabel();
	public JLabel priceDisplay = new JLabel();
	public JLabel popUpLabel1 = new JLabel("As Good As it Gets");
	public JLabel popUpLabel2 = new JLabel("Can you think of anything better?");
	//Declare JFrame
	public JFrame orderDisplayWindow = new JFrame();
	public JFrame popUpWindow = new JFrame();
	//Declare Image
	public Image burgerGif = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Zach Cheyney\\eclipse-workspace\\Lab6\\src\\Lab6Images\\images\\sandwich\\hamburger.gif");
	public ImageIcon burgerGifIcon= new ImageIcon(burgerGif);
	public Image burgerImg = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Zach Cheyney\\eclipse-workspace\\Lab6\\src\\Lab6Images\\images\\sandwich\\hamburger.jpg");
	public ImageIcon burgerImgIcon = new ImageIcon(burgerImg);
	public Image cheeseBurgerGif = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Zach Cheyney\\eclipse-workspace\\Lab6\\src\\Lab6Images\\images\\sandwich\\cheeseburger.gif");
	public ImageIcon cheeseBurgerGifIcon = new ImageIcon(cheeseBurgerGif);
	public Image cheeseBurgerImg = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Zach Cheyney\\eclipse-workspace\\Lab6\\src\\Lab6Images\\images\\sandwich\\cheeseburger.jpg");
	public ImageIcon cheeseBurgerImgIcon = new ImageIcon(cheeseBurgerImg);
	public Image veggieGif = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Zach Cheyney\\eclipse-workspace\\Lab6\\src\\Lab6Images\\images\\sandwich\\veggie.gif");
	public ImageIcon veggieGifIcon = new ImageIcon(veggieGif);
	public Image veggieImg = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Zach Cheyney\\eclipse-workspace\\Lab6\\src\\Lab6Images\\images\\sandwich\\veggie.jpg");
	public ImageIcon veggieImgIcon = new ImageIcon(veggieImg);
	public Image hamGif = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Zach Cheyney\\eclipse-workspace\\Lab6\\src\\Lab6Images\\images\\sandwich\\hamandcheese.gif");
	public ImageIcon hamGifIcon = new ImageIcon(hamGif);
	public Image hamImg = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Zach Cheyney\\eclipse-workspace\\Lab6\\src\\Lab6Images\\images\\sandwich\\hamandcheese.jpg");
	public ImageIcon hamImgIcon = new ImageIcon(hamImg);	
	
	public Image friesGif = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Zach Cheyney\\eclipse-workspace\\Lab6\\src\\Lab6Images\\images\\sides\\fries.gif");
	public ImageIcon friesGifIcon = new ImageIcon(friesGif);
	public Image friesImg = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Zach Cheyney\\eclipse-workspace\\Lab6\\src\\Lab6Images\\images\\sides\\fries.jpg");
	public ImageIcon friesImgIcon = new ImageIcon(friesImg);
	public Image chipsGif = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Zach Cheyney\\eclipse-workspace\\Lab6\\src\\Lab6Images\\images\\sides\\chips.gif");
	public ImageIcon chipsGifIcon = new ImageIcon(chipsGif);
	public Image chipsImg = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Zach Cheyney\\eclipse-workspace\\Lab6\\src\\Lab6Images\\images\\sides\\chips.jpg");
	public ImageIcon chipsImgIcon = new ImageIcon(chipsImg);
	public Image okraGif = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Zach Cheyney\\eclipse-workspace\\Lab6\\src\\Lab6Images\\images\\sides\\friedokra.gif");
	public ImageIcon okraGifIcon = new ImageIcon(okraGif);
	public Image okraImg = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Zach Cheyney\\eclipse-workspace\\Lab6\\src\\Lab6Images\\images\\sides\\friedokra.jpg");
	public ImageIcon okraImgIcon = new ImageIcon(okraImg);
	public Image onionGif = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Zach Cheyney\\eclipse-workspace\\Lab6\\src\\Lab6Images\\images\\sides\\onionrings.gif");
	public ImageIcon onionGifIcon = new ImageIcon(onionGif);
	public Image onionImg = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Zach Cheyney\\eclipse-workspace\\Lab6\\src\\Lab6Images\\images\\sides\\onionrings.jpg");
	public ImageIcon onionImgIcon = new ImageIcon(onionImg);
	
	public Image coffeeGif = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Zach Cheyney\\eclipse-workspace\\Lab6\\src\\Lab6Images\\images\\drinks\\coffee.gif");
	public ImageIcon coffeeGifIcon = new ImageIcon(coffeeGif);
	public Image coffeeImg = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Zach Cheyney\\eclipse-workspace\\Lab6\\src\\Lab6Images\\images\\drinks\\coffee.jpg");
	public ImageIcon coffeeImgIcon = new ImageIcon(coffeeImg);
	public Image colaGif = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Zach Cheyney\\eclipse-workspace\\Lab6\\src\\Lab6Images\\images\\drinks\\cola.gif");
	public ImageIcon colaGifIcon = new ImageIcon(colaGif);
	public Image colaImg = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Zach Cheyney\\eclipse-workspace\\Lab6\\src\\Lab6Images\\images\\drinks\\cola.jpg");
	public ImageIcon colaImgIcon = new ImageIcon(colaImg);
	public Image teaGif = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Zach Cheyney\\eclipse-workspace\\Lab6\\src\\Lab6Images\\images\\drinks\\icetea.gif");
	public ImageIcon teaGifIcon = new ImageIcon(teaGif);
	public Image teaImg = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Zach Cheyney\\eclipse-workspace\\Lab6\\src\\Lab6Images\\images\\drinks\\icetea.jpg");
	public ImageIcon teaImgIcon = new ImageIcon(teaImg);
	public Image waterGif = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Zach Cheyney\\eclipse-workspace\\Lab6\\src\\Lab6Images\\images\\drinks\\water.gif");
	public ImageIcon waterGifIcon = new ImageIcon(waterGif);
	public Image waterImg = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Zach Cheyney\\eclipse-workspace\\Lab6\\src\\Lab6Images\\images\\drinks\\water.jpg");
	public ImageIcon waterImgIcon = new ImageIcon(waterImg);
	
	public Image orderImg = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Zach Cheyney\\eclipse-workspace\\Lab6\\src\\Lab6Images\\images\\complete.gif");
	public ImageIcon orderImgIcon = new ImageIcon(orderImg);
	public JLabel orderImgLabel = new JLabel(orderImgIcon);
	
	public JLabel popUpLabel = new JLabel();
	
	public static void main (String args[])
	{
		new Lab_6();
	}
	
	//Action listener for the buttons
	public void actionPerformed(ActionEvent e) 
	{
		String whichButton = e.getActionCommand();
		if (whichButton.equals("Place Order"))
			m.processOrderButton();
		if (whichButton.equals("Cancel Order"))
			m.processCancelButton();
		validate();
		repaint();
	}
	
	public Lab_6()
	{
		//Runs a method to get the sound
		getSoundsApp();
		//Designs the new JPanel
		orderDisplayWindow.setLayout(new BorderLayout());
		orderDisplayWindow.setBounds(100, 100, 950, 300);
	 	orderDisplayWindow.getContentPane().setBackground(bkg);  
	 	orderDisplayWindow.add(orderImgLabel, BorderLayout.CENTER);
	 	popUpWindow.setLayout(new BorderLayout());
	 	popUpWindow.setBounds(100, 100, 950, 300);
	 	popUpWindow.getContentPane().setBackground(bkg);
	 	popUpWindow.add(popUpLabel, BorderLayout.CENTER);
	 	popUpWindow.add(popUpLabel1, BorderLayout.NORTH);
	 	popUpWindow.add(popUpLabel2, BorderLayout.SOUTH);
	 	popUpLabel1.setFont(snellFont);
	 	popUpLabel1.setForeground(snellGray);
	 	popUpLabel2.setFont(snellFont);
	 	popUpLabel2.setForeground(snellGray);
		//Adds Action Listeners
		orderButton.addActionListener(this);
		cancelButton.addActionListener(this);
		wichesList.addListSelectionListener(this);
		drinkList.addListSelectionListener(this);
		sideList.addListSelectionListener(this);
		System.out.println("Lab_6");
		
	}

	public void valueChanged(ListSelectionEvent i) 
	{
		if (!i.getValueIsAdjusting()) 
		{
			if (i.getSource() == wichesList && wichesList.getSelectedIndex() == 1)
			{
				sandwich = "burger";
				System.out.println(sandwich);
				if (animationBox.isSelected() == true)
				{
					popUpLabel.setIcon(burgerGifIcon);
				}
				else if (animationBox.isSelected() == false)
				{
					popUpLabel.setIcon(burgerImgIcon);
				}
				popUpWindow.setVisible(true);
			}
			if (i.getSource() == wichesList && wichesList.getSelectedIndex() == 2)
			{
				sandwich = "cheeseburger";
				System.out.println(sandwich);
				if (animationBox.isSelected() == true)
				{
					popUpLabel.setIcon(cheeseBurgerGifIcon);
				}
				else if (animationBox.isSelected() == false)
				{
					popUpLabel.setIcon(cheeseBurgerImgIcon);
				}
				popUpWindow.setVisible(true);
			}
			if (i.getSource() == wichesList && wichesList.getSelectedIndex() == 3)
			{
				sandwich = "veggie";
				System.out.println(sandwich);
				if (animationBox.isSelected() == true)
				{
					popUpLabel.setIcon(veggieGifIcon);
				}
				else if (animationBox.isSelected() == false)
				{
					popUpLabel.setIcon(veggieImgIcon);
				}
				popUpWindow.setVisible(true);
			}
			if (i.getSource() == wichesList && wichesList.getSelectedIndex() == 4)
			{
				sandwich = "ham and cheese";
				System.out.println(sandwich);
				if (animationBox.isSelected() == true)
				{
					popUpLabel.setIcon(hamGifIcon);
				}
				else if (animationBox.isSelected() == false)
				{
					popUpLabel.setIcon(hamImgIcon);
				}
				popUpWindow.setVisible(true);
			}
			if (i.getSource() == sideList && sideList.getSelectedIndex() == 1)
			{
				side = "fries";
				System.out.println(side);
				if (animationBox.isSelected() == true)
				{
					popUpLabel.setIcon(friesGifIcon);
				}
				else if (animationBox.isSelected() == false)
				{
					popUpLabel.setIcon(friesImgIcon);
				}
				popUpWindow.setVisible(true);
			}
			if (i.getSource() == sideList && sideList.getSelectedIndex() == 2)
			{
				side = "chips";
				System.out.println(side);
				if (animationBox.isSelected() == true)
				{
					popUpLabel.setIcon(chipsGifIcon);
				}
				else if (animationBox.isSelected() == false)
				{
					popUpLabel.setIcon(chipsImgIcon);
				}
				popUpWindow.setVisible(true);
			}
			if (i.getSource() == sideList && sideList.getSelectedIndex() == 3)
			{
				side = "okra";
				System.out.println(side);
				if (animationBox.isSelected() == true)
				{
					popUpLabel.setIcon(okraGifIcon);
				}
				else if (animationBox.isSelected() == false)
				{
					popUpLabel.setIcon(okraImgIcon);
				}
				popUpWindow.setVisible(true);
			}
			if (i.getSource() == sideList && sideList.getSelectedIndex() == 4)
			{
				side = "onion rings";
				System.out.println(side);
				if (animationBox.isSelected() == true)
				{
					popUpLabel.setIcon(onionGifIcon);
				}
				else if (animationBox.isSelected() == false)
				{
					popUpLabel.setIcon(onionImgIcon);
				}
				popUpWindow.setVisible(true);
			}
			if (i.getSource() == drinkList && drinkList.getSelectedIndex() == 1)
			{
				side = "coffee";
				System.out.println(side);
				if (animationBox.isSelected() == true)
				{
					popUpLabel.setIcon(coffeeGifIcon);
				}
				else if (animationBox.isSelected() == false)
				{
					popUpLabel.setIcon(coffeeImgIcon);
				}
				popUpWindow.setVisible(true);
			}
			if (i.getSource() == drinkList && drinkList.getSelectedIndex() == 2)
			{
				side = "cola";
				System.out.println(side);
				if (animationBox.isSelected() == true)
				{
					popUpLabel.setIcon(colaGifIcon);
				}
				else if (animationBox.isSelected() == false)
				{
					popUpLabel.setIcon(colaImgIcon);
				}
				popUpWindow.setVisible(true);
			}
			if (i.getSource() == drinkList && drinkList.getSelectedIndex() == 3)
			{
				side = "tea";
				System.out.println(side);
				if (animationBox.isSelected() == true)
				{
					popUpLabel.setIcon(teaGifIcon);
				}
				else if (animationBox.isSelected() == false)
				{
					popUpLabel.setIcon(teaImgIcon);
				}
				popUpWindow.setVisible(true);
			}
			if (i.getSource() == drinkList && drinkList.getSelectedIndex() == 4)
			{
				side = "water";
				System.out.println(side);
				if (animationBox.isSelected() == true)
				{
					popUpLabel.setIcon(waterGifIcon);
				}
				else if (animationBox.isSelected() == false)
				{
					popUpLabel.setIcon(waterImgIcon);
				}
				popUpWindow.setVisible(true);
			}
        }
		
	}
}
