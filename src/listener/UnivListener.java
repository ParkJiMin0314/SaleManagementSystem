package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.UniversityGui;
import gui.WindowFrame;

public class UnivListener implements ActionListener {
   WindowFrame frame;
   
   public UnivListener(WindowFrame frame) {
      this.frame = frame;
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      JButton b = (JButton) e.getSource();
      UniversityGui grade = new UniversityGui(frame);
      frame.setupPanel(grade);
      
   }

}