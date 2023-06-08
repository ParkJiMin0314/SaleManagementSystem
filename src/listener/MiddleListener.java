package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.MiddleSchoolGui;
import gui.WindowFrame;

public class MiddleListener implements ActionListener {
   WindowFrame frame;
   
   public MiddleListener(WindowFrame frame) {
      this.frame = frame;
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      JButton b = (JButton) e.getSource();
      MiddleSchoolGui grade = new MiddleSchoolGui(frame);
      frame.setupPanel(grade);
      
   }

}