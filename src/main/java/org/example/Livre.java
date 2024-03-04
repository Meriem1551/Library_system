package org.example;

public class Livre extends Document{
    private String éditeur;
    private String auteur;

    public Livre(String titre, String auteur, String éditeur)
    {
        super(titre);
        this.auteur = auteur;
        this.éditeur = éditeur;
    }
    public void affiche()
    {
        super.affiche();
        System.out.println("Auteur est " + this.auteur);
        System.out.println("Editeur est " + this.éditeur);
    }
}
