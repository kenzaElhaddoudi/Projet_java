package com.personnel.persistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import com.personnel.metier.Personnel;

public class PersonnelDAO {
private Connection connection;
	public PersonnelDAO() {
		super();
		connection = ConnectDB.getconnection();
	}
	
	public List<Personnel> getallpersonnels(){
		List<Personnel> list=new ArrayList<Personnel>();
		String sql="select * from personnel;";
		try {
		PreparedStatement pstm=connection.prepareStatement(sql);
		ResultSet rs = pstm.executeQuery();
		while (rs.next()) {
			Personnel p=new Personnel(rs.getInt("id"),rs.getString("passeword"),rs.getString("type"),rs.getInt("archivage"));
			list.add(p);
			
		}
		} catch (Exception exp) {
			// TODO Auto-generated catch block
			System.out.println(exp);
		}
		
		
		return list;
		
	}
	//witout archive
	public List<Personnel> getpersonnels(){
		List<Personnel> list=new ArrayList<Personnel>();
		String sql="select * from personnel where archivage=;";
		try {
		PreparedStatement pstm=connection.prepareStatement(sql);
		pstm.setInt(1,0);
		ResultSet rs = pstm.executeQuery();
		while (rs.next()) {
			Personnel p=new Personnel(rs.getInt("id"),rs.getString("passeword"),rs.getString("type"),rs.getInt("archivage"));
			list.add(p);
			
		}
		} catch (Exception exp) {
			// TODO Auto-generated catch block
			System.out.println(exp);
		}
		
		
		return list;
		
	}
	public void createpersonnel(Personnel p) {
		String sql="insert into personnel(id,passeword,type,archivage) values(?,?,?,?);";
		try {
			PreparedStatement pstm=connection.prepareStatement(sql);
			pstm.setInt(1,p.getId());
			pstm.setString(2,p.getPasseword());
			pstm.setString(3,p.getType());
			pstm.setInt(4,p.getArchivage());
		    pstm.execute();
			
			} catch (Exception exp) {
				// TODO Auto-generated catch block
				System.out.println(exp);
			}
	}
	public Personnel getpersonnel(int id) {
		String sql="select * from personnel where id=?;";
	try {
		PreparedStatement pstm=connection.prepareStatement(sql);
		pstm.setInt(1, id);
		ResultSet rs = pstm.executeQuery();
		if (rs.next()) {
			Personnel p=new Personnel(rs.getInt("id"),rs.getString("passeword"),rs.getString("type"),rs.getInt("archivage"));
			return p;
			
		}
		} catch (Exception exp) {
			// TODO Auto-generated catch block
			System.out.println(exp);
		}
	return null;
	
			
		
	}
	
	public void updatepersonnel(Personnel p) {
		String sql="update personnel set passeword=?,type=?,archivage=? where id=?";
		try {
			PreparedStatement pstm=connection.prepareStatement(sql);
			pstm.setString(1,p.getPasseword());
			pstm.setString(2,p.getType());
			pstm.setInt(3,p.getArchivage());
			pstm.setInt(4,p.getId());
			pstm.execute();
			
			} catch (Exception exp) {
				// TODO Auto-generated catch block
				System.out.println(exp);
			}
				
		
	}
	public void deletepersonnel(int id) {
		String sql="delete from personnel where id=?;";
		try {
			PreparedStatement pstm=connection.prepareStatement(sql);
			pstm.setInt(1,id);
			pstm.execute();
			
			} catch (Exception exp) {
				// TODO Auto-generated catch block
				System.out.println(exp);
			}
				
	}
	
	public void archiverpersonnel(int id) {
		String sql="update personnel set archivage=? where id=?;";
		try {
			PreparedStatement pstm=connection.prepareStatement(sql);
			pstm.setInt(1,1);
			pstm.setInt(2,id);
			pstm.execute();
			
			} catch (Exception exp) {
				// TODO Auto-generated catch block
				System.out.println(exp);
			}
				
	}

}



