/*******************************************************************************
Name: Sarah Redmon
Date: 2/2/19
Instructor: Ms. Tucker
Class: Jeopardy
Purpose: To show a GUI timer for a Jeopardy final question
*******************************************************************************
*/

import javax.swing.JFrame;
import javax.swing.*;

public class Jeopardy
{
   public static void main (String[] args)
   {
      /*------------------------------------------------------------------------------
      Creates and displays the GUI of the program
      ------------------------------------------------------------------------------
      */
      JFrame frame = new JFrame ("Jeopardy");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      frame.getContentPane().add(new JeopardyPanel());

      frame.pack();
      frame.setVisible(true);
   }
}