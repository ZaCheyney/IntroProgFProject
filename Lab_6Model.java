import java.awt.BorderLayout;

import javax.swing.SwingConstants;

public class Lab_6Model
{
	Lab_6 c;
    public Lab_6Model(Lab_6 fromC)
    {    System.out.println("@ contructor in Model Class");
   	      c = fromC;
    }
    
	public void processOrderButton()
	{	
		//Checks if grilled
		if (c.grillBox.isSelected() == true)
			c.grill = " Grilled ";
		else if (c.grillBox.isSelected() == false)
			c.grill = " ";
		//Checks the price
		if (c.sizeComboBox.getSelectedItem() == "Small")
			c.price = "$5.50";
		else if (c.sizeComboBox.getSelectedItem() == "Medium")
			c.price = "$7.00";
		else if (c.sizeComboBox.getSelectedItem() == "Large")
			c.price = "8.50";
		else if (c.sizeComboBox.getSelectedItem() == "Extra Large")
			c.price = "8.50";
		else
			c.price = "Please Select your Size";
		//Checks the sandwich
		if(c.wichesList.getSelectedIndex() == 0)
			c.sandwich = "order";
		else 
			c.sandwich = c.wichesList.getSelectedValue();
		//Checks the side
		if (c.sideList.getSelectedIndex() == 0)
			c.side = "order";
		else
			c.side = c.sideList.getSelectedValue();
		//Checks the drink
		if (c.drinkList.getSelectedIndex() == 0)
			c.drink = "order";
		else
			c.drink = c.drinkList.getSelectedValue();
		//Checks the size
		if (c.price == "Please Select your Size")
			c.size = "order";
		else
			c.size = (String) c.sizeComboBox.getSelectedItem();
		
		//Creates a string
		c.orderText = (c.size + "" + c.grill + c.sandwich + " with " + c.side + " and " + c.drink);
		//If order is complete, sets JLabel to show order
		//Otherwise sets to "Please Place Order"
		if (c.orderText.contains("order"))
			c.orderDisplay.setText("Please Place Order");
		else if (!c.orderText.contains("order"))
			c.orderDisplay.setText(c.orderText);
		//Plays the sound and sets up the new JPanel
		if (c.soundBox.isSelected() == true)
		{
		c.ohSound.play();
		}
		c.priceDisplay.setText(c.price);
		c.orderDisplayWindow.add(c.orderDisplay, BorderLayout.NORTH);
		c.orderDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		c.orderDisplay.setFont(c.snellFont);
		c.orderDisplayWindow.add(c.priceDisplay, BorderLayout.SOUTH);
		c.priceDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		c.priceDisplay.setFont(c.snellFont);
		c.orderDisplayWindow.setVisible(true);
	}
	
	public void processCancelButton()
	{
		System.out.println("Cancel");
		//Resets display
		c.orderDisplayWindow.setVisible(false);
		c.wichesList.setSelectedIndex(0);
		c.drinkList.setSelectedIndex(0);
		c.sideList.setSelectedIndex(0);
		c.sizeComboBox.setSelectedIndex(0);
		c.grillBox.setSelected(false);
		c.animationBox.setSelected(false);
		c.soundBox.setSelected(false);
	}
}