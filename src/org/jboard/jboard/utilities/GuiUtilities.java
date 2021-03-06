package org.jboard.jboard.utilities;

import java.awt.Dimension;
import java.awt.Window;

import javax.swing.JDialog;

/**
 * General utilities for Swing GUI.
 *
 * @author Asher Stern
 * Date: Aug 21, 2014
 *
 */
public class GuiUtilities
{
	public static void centerDialog(Window ownerWindow, JDialog dialog)
	{
		dialog.setLocationRelativeTo(ownerWindow);
		Dimension dimension = dialog.getSize();
		Dimension ownerDimension = ownerWindow.getSize();
		
		int x_location = Math.max(0,  (int)((ownerDimension.getWidth()/2)-(dimension.getWidth()/2)) );
		int y_location = Math.max(0, (int)((ownerDimension.getHeight()/2)-(dimension.getHeight()/2)) );
		
		dialog.setLocation(x_location,y_location);
	}

}
