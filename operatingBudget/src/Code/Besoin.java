/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author IT
 */
public class Besoin {
    private int code;
    private double cout;
    private int userID;
    private Utilisateur utilisateur;
    private Branch branch;
    private double clotureDA;
    private double clotureDEV;
    private String libelle;
    private int qte;
    private int year;
    private double initialDA;
    private double initialDEV;

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Utilisateur utilisateur) {
        this.branch = branch;
    }
    
    public double getClotureDA() {
        return clotureDA;
    }

    public double getClotureDEV() {
        return clotureDEV;
    }

    public void setClotureDA(double clotureDA) {
        this.clotureDA = clotureDA;
    }

    public void setClotureDEV(double clotureDEV) {
        this.clotureDEV = clotureDEV;
    }

    public int getUserID() {
        return userID;
    }

    

    public void setUserID(int userID) {
        this.userID = userID;
    }

    
    public int getCode() {
        return code;
    }

    public double getCout() {
        return cout;
    }

    public String getLibelle() {
        return libelle;
    }

    public int getQte() {
        return qte;
    }

    public int getYear() {
        return year;
    }

    public double getInitialDA() {
        return initialDA;
    }

    public double getInitialDEV() {
        return initialDEV;
    }

    public void setInitialDA(double initialDA) {
        this.initialDA = initialDA;
    }

    public void setInitialDEV(double initialDEV) {
        this.initialDEV = initialDEV;
    }
    

    public void setCode(int code) {
        this.code = code;
    }

    public void setCout(double cout) {
        this.cout = cout;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
}
