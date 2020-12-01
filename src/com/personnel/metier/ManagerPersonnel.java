package com.personnel.metier;

import java.util.List;

import com.personnel.persistance.PersonnelDAO;

public class ManagerPersonnel {

		private PersonnelDAO pdao=new PersonnelDAO();
	
	public List<Personnel> getallpersonnels(){
		return pdao.getallpersonnels();
				}
	public List<Personnel> getpersonnels(){
		return pdao.getpersonnels();
	}
	public void createpersonnel(Personnel p) {
		pdao.createpersonnel(p);
	}
	public Personnel getpersonnel(int id) {
		return pdao.getpersonnel(id);
	}
	public void updatepersonnel(Personnel p) {
		pdao.updatepersonnel(p);
	}
	public void deletepersonnel(int id) {
	pdao.deletepersonnel(id);
	}
	public void archiverpersonnel(int id) {
		pdao.archiverpersonnel(id);
	}
	
}
