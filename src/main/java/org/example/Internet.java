package org.example;

public class Internet extends Document{
    String URL;

    public Internet(String titre, String URL)
    {
        super(titre);
        this.URL =  URL;
    }
    public void affiche()
    {
        super.affiche();
        System.out.println(this.URL);
    }
}
