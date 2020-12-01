package com.personnel.presentation;


import java.util.List;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;

import com.personnel.metier.Personnel;

public class PersonnelModel extends AbstractTableModel{
	private String[] nomcolumn=new String[] {"id","passeword","type","archivage"};
	private Vector<String[]> rows=new Vector<String[]>();
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return nomcolumn.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return rows.size();
	}
	
	@Override
	public String getColumnName(int arg0) {
		// TODO Auto-generated method stub
		return nomcolumn[arg0];
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return rows.get(arg0)[arg1];
	}
	public void loadData(List<Personnel> per) {
		rows=new Vector<String[]>();
		for(Personnel p:per) {
			rows.add(new String[] {String.valueOf(p.getId()),p.getPasseword(),p.getType(),String.valueOf(p.getArchivage())});
		}
		fireTableChanged(null);
	}
	public void loadData2(Personnel p) {
		rows=new Vector<String[]>();
		
			rows.add(new String[] {String.valueOf(p.getId()),p.getPasseword(),p.getType(),String.valueOf(p.getArchivage())});
		
		fireTableChanged(null);
	}

}
