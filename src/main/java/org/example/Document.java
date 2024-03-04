package org.example;

public class Document {
    public String titre;
    static int count_doc = 0;
    public Document()
    {
        this.titre = "";
        count_doc++;
    }
    public Document(String titre)
    {
        this.titre = titre;
        count_doc++;
    }
    public void affiche()
    {
        System.out.println("Titre est " + this.titre);
    }

}
