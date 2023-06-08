package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.HighschoolGui;
import gui.WindowFrame;

public class HighListener implements ActionListener {
   WindowFrame frame;
   
   public HighListener(WindowFrame frame) {
      this.frame = frame;
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      JButton b = (JButton) e.getSource();
      HighschoolGui grade = new HighschoolGui(frame);
      frame.setupPanel(grade);
      
   }

}