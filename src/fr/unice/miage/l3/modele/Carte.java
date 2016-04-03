package fr.unice.miage.l3.modele;

public abstract class Carte {
	private int nbreDePoint;
	private int ressourcesDeLacarte;
	
	public int getPoint() {
		return nbreDePoint;
	}
	public void setPoint(int nbreDePoint) {
		this.nbreDePoint = nbreDePoint;
	}
	public int getRessourcesDeLacarte() {
		return ressourcesDeLacarte;
	}
	public void setRessourcesDeLacarte(int ressourcesDeLacarte) {
		this.ressourcesDeLacarte = ressourcesDeLacarte;
	}
	
}
