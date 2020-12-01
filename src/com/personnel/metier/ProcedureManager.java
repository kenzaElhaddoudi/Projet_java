package Metier;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Persistance.DAOProcedure;
import Metier.Procedure;;
public class ProcedureManager {
	private DAOProcedure daoprocedure;
	
	
	public ProcedureManager() {
		daoprocedure=new DAOProcedure();
	
	}
	
	public ArrayList<Procedure> getAll() {
		daoprocedure=new DAOProcedure();
		ArrayList<Procedure> proc = new ArrayList<>();
		proc = daoprocedure.getall();
		return proc;
	}
	
	public Procedure getProcedure(int id) {
		return daoprocedure.getprocedure(id);
	}
	public boolean addProcedure(Procedure proc) {
		return daoprocedure.addprocedure(proc);
	}
	public boolean deleteProcedure(Procedure proc) {
		return daoprocedure.deleteprocedure(proc);
	}
	public boolean editProcedure(Procedure proc) {
		return daoprocedure.editprocedure(proc); 
	}


}