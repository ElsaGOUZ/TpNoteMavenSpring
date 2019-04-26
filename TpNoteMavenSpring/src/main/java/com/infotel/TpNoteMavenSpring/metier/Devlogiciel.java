package com.infotel.TpNoteMavenSpring.metier;

public class Devlogiciel {

 private Dev developpeur;
private Dev chefDeveloppeur;
public Dev getDeveloppeur() {
	return developpeur;
}
public void setDeveloppeur(Dev developpeur) {
	this.developpeur = developpeur;
}
public Dev getChefDeveloppeur() {
	return chefDeveloppeur;
}
public void setChefDeveloppeur(Dev chefDeveloppeur) {
	this.chefDeveloppeur = chefDeveloppeur;
}
@Override
public String toString() {
	return "Devlogiciel [developpeur=" + developpeur + ", chefDeveloppeur=" + chefDeveloppeur + "]";
}



 
}
