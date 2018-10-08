package entity;

public class Login {
	
	private String nom;
	private String pass;
	
	public Login(String nom, String pass) {
		this.nom =nom;
		this.pass=pass;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public boolean isValide() {
		if(nom.equals("titi")) {
			return true;
		}
		return false;
	}
	
}
