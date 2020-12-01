package Metier;

public class Procedure {
	private int id;
	private  String nom;
	private int id_chef;
	private  boolean archivage;

	
	public Procedure() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Procedure(Procedure procedure) {
		this.id = procedure.getId();
		this.nom = procedure.getNom();
		this.id_chef = procedure.getId_chef();
		this.archivage = procedure.isArchivage();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getId_chef() {
		return id_chef;
	}
	public void setId_chef(int id_chef) {
		this.id_chef = id_chef;
	}
	public boolean isArchivage() {
		return archivage;
	}
	public void setArchivage(boolean archivage) {
		this.archivage = archivage;
	}
	@Override
	public String toString() {
		return "Procedure [id=" + id + ", nom=" + nom + ", id_chef=" + id_chef + ", archivage=" + archivage + "]";
	}

}

