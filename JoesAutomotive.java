import javax.swing.*;
import java.awt.event.*; // Needed for event listener interface
import java.awt.*;

/**
   Joes Automotive, pg 449 #6
   Create a GUI application that displays the total for a customers visit to Joe's.
   Oil change:			$26
   Lube job:			$18
   Radiator flush:		$30
   Transmission flush:	$80
   Inspection:			$15
   Muffler replacement:	$100
   Tire rotation:		$20
   Nonroutine services:	$20 per hour
*/

/**
   This class extends from the JFrame class.
   It uses the SOUTH and WEST sections of a BorderLayout layout.
*/

public class JoesAutomotive extends JFrame
{
   private JTextField hoursTextField;
   private JCheckBox oil;
   private JCheckBox lube;
   private JCheckBox radiator;
   private JCheckBox transmission;
   private JCheckBox inspection;
   private JCheckBox muffler;
   private JCheckBox tire;
   private JCheckBox non;
   private final int WINDOW_WIDTH = 300; // Window width
   private final int WINDOW_HEIGHT = 70; // Window height

   public JoesAutomotive()	/** Constructor */
   {
		// Set the title bar text.
		setTitle("Joe's Automotive");

		// Specify what happens when the close button is clicked.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new BorderLayout() );

		JPanel panel = new JPanel();       // A panel to hold components
		JPanel leftPanel = new JPanel();

		oil				= new JCheckBox("Oil Change");
		lube			= new JCheckBox("Lube job");
		radiator		= new JCheckBox("Radiator flush");
		transmission	= new JCheckBox("Transmission flush");
		inspection		= new JCheckBox("Inspection");
		muffler			= new JCheckBox("Muffler replacement");
		tire			= new JCheckBox("Tire rotation");
		non				= new JCheckBox("Nonroutine services");
		hoursTextField	= new JTextField(3);
		JButton button1 = new JButton("Total");	// Create the three buttons.

		// Register an event listener with all 3 buttons.
		button1.addActionListener(new ButtonListener());

		// Create a panel and add the checkboxes to it
		leftPanel.add(oil);
		leftPanel.add(lube);
		leftPanel.add(radiator);
		leftPanel.add(transmission);
		leftPanel.add(inspection);
		leftPanel.add(muffler);
		leftPanel.add(tire);
		leftPanel.add(non);
		leftPanel.add(hoursTextField);
		panel.add(button1);

		add(panel, BorderLayout.SOUTH);		// Add the panel to the content pane.
		add(leftPanel, BorderLayout.WEST);

		pack();				// Automatically set the size of the window
		setVisible(true);	// Display the window
	}

	/**
	  Private inner class that handles the event when
	  the user clicks a button.
	*/

	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String input;			// To hold the user's input
			double nonRoutineCost;	// Cost of nonroutine services
			double subTotal = 0;		// Subtotal

			if ( oil.isSelected() )				subTotal += 26;
			if ( lube.isSelected() )			subTotal += 18;
			if ( radiator.isSelected() )		subTotal += 30;
			if ( transmission.isSelected() )	subTotal += 80;
			if ( inspection.isSelected() )		subTotal += 15;
			if ( muffler.isSelected() )			subTotal += 100;
			if ( tire.isSelected() )			subTotal += 20;
			if ( non.isSelected() )
			{
				input = hoursTextField.getText();
				nonRoutineCost = Double.parseDouble(input) * 20;
				subTotal += nonRoutineCost;
			}

			JOptionPane.showMessageDialog(null, "Your subtotal comes to $" + subTotalr );

		}
	}

	/**
	   This program creates an instance of the JoesAutomotive
	   class, which causes it to display its window.
	*/

	public static void main(String[] args)
	{
	  new JoesAutomotive();
	}

} // end class