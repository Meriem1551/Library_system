package org.example;

import javax.print.Doc;

public class Bibliothèque {
    protected Document[] documents;
    int size;
    static int index = 0;
    public Bibliothèque(int size) {
        this.size = size;
        this.documents = new Document[this.size];
    }
    public void ajouter(Document d)
    {
        if (index < this.size)
        {
            documents[index] = d;
            index++;
        }
    }

    void afficher(Document d){
        d.affiche();
        System.out.println("==========");
    }
    public void listening()
    {
        for (Document d: documents) {
            if(d != null) {
                afficher(d);
            }
        }
    }
}
