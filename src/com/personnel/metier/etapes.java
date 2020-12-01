package Metier;


public class etapes {
	private long id ;
	private String nom;
	private long id_employe;
	private String date_debut;
	private String date_fin;

	
	public etapes() {
		super();
	}
	public etapes(String nom, long id_employe,String date_debut, String date_fin) {
		super();
		this.nom = nom;
		this.id_employe = id_employe;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
	}
	public etapes(long id, String nom, long id_employe, String date_debut, String date_fin) {
		
		this.id = id;
		this.nom = nom;
		this.id_employe = id_employe;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public long getId_employe() {
		return id_employe;
	}
	public void setId_employe(long id_employe) {
		this.id_employe = id_employe;
	}
	public String getDate_debut() {
		return date_debut;
	}
	public void setDate_debut(String date_debut) {
		this.date_debut = date_debut;
	}
	public String getDate_fin() {
		return date_fin;
	}
	public void setDate_fin(String date_fin) {
		this.date_fin = date_fin;
	}
	
	

	
}
