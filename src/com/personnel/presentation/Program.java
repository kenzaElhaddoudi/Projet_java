package com.personnel.presentation;

import java.util.ArrayList;


import com.personnel.metier.ManagerPersonnel;
import com.personnel.metier.Personnel;

public class Program_personnel {
	public static void main(String[] args){
		ManagerPersonnel pmt=new ManagerPersonnel(); 
		pmt.archiverpersonnel(2);
		ArrayList<Personnel> liste=new ArrayList<Personnel>();
		liste=(ArrayList<Personnel>) pmt.getpersonnels();
		
		
		for(Personnel p: liste) {
			System.out.println(p.getId()+" "+p.getPasseword()+" "+p.getType()+" "+p.getArchivage());
			
		}
		
		
	}
}
