package Persistance;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import Metier.Procedure;

public class DAOProcedure {
		private Connection cnx;
		private ResultSet rs;
		private Statement stm;
		private PreparedStatement pstm;
		private Procedure proc;

		public DAOProcedure() {
			super();
			cnx = Connexion.getConnexion();
		}

        public ArrayList<Procedure> getall() {
			ArrayList<Procedure> list = new ArrayList<Procedure>();
			try {
				pstm = cnx.prepareStatement("select * from procedures ;");
				rs = pstm.executeQuery();
				while (rs.next()) {
					proc = new Procedure();
					proc.setId(rs.getInt(1));
					proc.setNom(rs.getString(2));
					proc.setId_chef(rs.getInt(3));
					proc.setArchivage(rs.getBoolean(4));
					list.add(proc);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return list;
		}
		
    	public Procedure getprocedure(int id) {
			Procedure proc = null;
			try {
				pstm = cnx.prepareStatement("select * from procedures  where id = ?;");
				pstm.setInt(1, id);
				rs = pstm.executeQuery();
				while (rs.next()) {
					proc = new Procedure ();
					proc = new Procedure ();
					proc.setId(rs.getInt(1));
					proc.setNom(rs.getString(2));
					proc.setId_chef(rs.getInt(3));
					proc.setArchivage(rs.getBoolean(0));
					
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return proc;
		}
		
	
		
		public boolean addprocedure(Procedure proc) {
			try {
				pstm = cnx.prepareStatement("insert into  procedures (nom,id_chef) "+ "values (?,?)");
				pstm.setString(1, proc.getNom());
				pstm.setLong(2, proc.getId_chef());
				return pstm.executeUpdate() > 0;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		}
		
		public boolean deleteprocedure(Procedure proc) {
			try {
				pstm = cnx.prepareStatement("delete  from procedures   where id=?");
				pstm.setInt  (1, proc.getId());
				return pstm.executeUpdate() > 0;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		}
		
		public boolean editprocedure(Procedure proc) {
			try {
				pstm = cnx.prepareStatement("update procedures set nom=?, id_chef=?  where id=?");
				pstm.setString(1, proc.getNom());
				pstm.setLong(2, proc.getId_chef());			
				pstm.setInt  (3, proc.getId());
				return pstm.executeUpdate() > 0;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		}

	

	}



