package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UIShutdownButtonAction implements ActionListener{
		public void actionPerformed(ActionEvent event){
			System.out.println("[UI] Triggered Shutdown Button");
			Main.stop();
		}
}
