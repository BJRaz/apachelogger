package org.dyndns.tfud.ApacheLogger.Views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConfigDialog extends JDialog implements ActionListener {
	
	private JLabel header;
	private JPanel mainpanel, center, input;
	private JButton enterhost;
	private JTextField hostname;
        private ApacheLogger owner;
	/**
	 * Method ConfigDialog
	 *
	 *
	 */
	public ConfigDialog(ApacheLogger owner) {
		super(owner, true);
                this.owner = owner;
		// TODO: Add your code here
		
		header = new JLabel("Configuration");
		
		mainpanel = new JPanel();
		
		center = new JPanel();
		
		input = new JPanel();
		
		center.setLayout(new GridLayout(1,2));
		
		mainpanel.setLayout(new BorderLayout());
		mainpanel.add(header, BorderLayout.NORTH);
		
		hostname = new JTextField();
		
		enterhost = new JButton("Enter host");
		enterhost.addActionListener(this);
		hostname.setText(owner.getHost());
		center.add(hostname);
		center.add(enterhost);
		
		input.add(center);
		
		mainpanel.add(input, BorderLayout.CENTER);
		
		this.getContentPane().add(mainpanel);
		this.setLocationRelativeTo(owner);
		this.setSize(200,100);
		this.setVisible(true);
	}	
        
        public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
            owner.setHost(hostname.getText());
            ConfigDialog.this.hide();		    
        }
        
}
