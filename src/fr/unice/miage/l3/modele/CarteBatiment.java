package fr.unice.miage.l3.agedepierre.modele.bis;

public class CarteBatiment {
	private int nbreDePoint;
	private int ressourcesDeLacarte;
	
	public CarteBatiment() {
		this.nbreDePoint = 0;
		this.ressourcesDeLacarte = 0;
	}
	
	public CarteBatiment(int nbreDePoint, int ressourcesDeLacarte) {
		super();
		this.nbreDePoint = nbreDePoint;
		this.ressourcesDeLacarte = ressourcesDeLacarte;
	}
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
	@Override
	public String toString() {
		return "Cette CarteBatiment rapporte " + nbreDePoint + ", elle coûte " + ressourcesDeLacarte;
	}
}
