package persistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Metier.etapes;

public class DAOetape {

	private Connection connection;
	
	public DAOetape() {
		connection=Connexion.getConnexion();
	}

	public List<etapes> getEtapes(){
		List<etapes> liste=new ArrayList<etapes>();
		String sql="select * from etapes";
		try {
			PreparedStatement pst=connection.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) { 
				etapes p =new etapes(rs.getLong("id"),rs.getString("nom"),rs.getLong("id_employe"),rs.getString("date_debut"),rs.getString("date_fin"));
				liste.add(p);
			}
			
		}catch (Exception exp){
			System.out.println(exp);}
		
		return liste;
}
	public void CreateEtape(etapes e) {
		String sql="insert into etapes(nom,id_employe,date_debut,date_fin) values(?,?,?,?)";
		try {
			PreparedStatement pst=connection.prepareStatement(sql);
			pst.setString(1, e.getNom());
			pst.setLong(2, e.getId_employe());
			pst.setString(3,e.getDate_debut());
			pst.setString(4, e.getDate_fin());
			pst.execute();
			
		}catch (Exception exp){
			System.out.println(exp);}
		
	}
	
	public void DeleteEtape(long id) {
		String sql="delete from etapes where id=?";
		try {
		PreparedStatement pst=connection.prepareStatement(sql);
		pst.setLong(1, id);
		pst.execute();
	    }catch (Exception exp) { 
	    	System.out.println(exp);}
	    }
	
	
	public boolean editEtape(etapes etape) {
		try {
			PreparedStatement pst = connection.prepareStatement("update etapes set id_employe=? where id=?");
			pst.setLong(1, etape.getId_employe());
			pst.setLong(2, etape.getId());

			return pst.executeUpdate() > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}

