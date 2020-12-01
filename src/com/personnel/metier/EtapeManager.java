package Metier;

import java.util.List;

import persistance.DAOetape;


public class EtapeManager {

	private DAOetape edao=new DAOetape();
	
	public List<etapes> getEtapes(){
		return edao.getEtapes();
	}
	
	
	public void AjouterEtape(etapes e) {
		edao.CreateEtape(e);
	}
	
	public void DeleteEtape(long id) {
		edao.DeleteEtape(id);;
	}
	
	public boolean editEtape(etapes etape) {
		return edao.editEtape(etape);
	}
	
}

