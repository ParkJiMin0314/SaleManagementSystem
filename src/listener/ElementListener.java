package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.ElementarySchoolGui;
import gui.WindowFrame;

public class ElementListener implements ActionListener {
   WindowFrame frame;
   
   public ElementListener(WindowFrame frame) {
      this.frame = frame;
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      JButton b = (JButton) e.getSource();
      ElementarySchoolGui grade = new ElementarySchoolGui(frame);
      frame.setupPanel(grade);
      
   }

}