package com.personnel.presentation;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import com.personnel.metier.ManagerPersonnel;
import com.personnel.metier.Personnel;

public class ViewPersonnel extends JFrame{
  

	private JLabel jlabelper=new JLabel("id:") ;
	private JTextField jtextfieldper=new JTextField(12);
	private JButton jbuttonok=new JButton("ok");
	private JTable jTable;
	private PersonnelModel personnelModel;
	private ManagerPersonnel metier;
	
	public ViewPersonnel() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		JPanel jPaneln=new JPanel();
		jPaneln.setLayout(new FlowLayout());
		jPaneln.add(jlabelper);jPaneln.add(jtextfieldper);
		jPaneln.add(jbuttonok);
		this.add(jPaneln, BorderLayout.NORTH);
		//JPanel jPanelC=new JPanel();
		personnelModel = new PersonnelModel();
		jTable = new JTable(personnelModel);
		JScrollPane jscrollpane=new JScrollPane(jTable);
		this.add(jscrollpane,BorderLayout.CENTER);
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setVisible(true);
		jbuttonok.addActionListener(new ActionListener(){
			
		
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int code =Integer.parseInt(jtextfieldper.getText());
				Personnel pers = metier.getpersonnel(code);
				personnelModel.loadData2(pers);
			}
	});
	
	}
	public static void main(String[] args){
		new ViewPersonnel();
	}

}
