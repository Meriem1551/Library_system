package org.example;

public class Main {
    public static void main(String[] args) {
        Bibliothèque bib = new Bibliothèque(4);

        Document l1 = new Livre("jujutsu kaisen", "jiji", "jiji");
        Document l2 = new Livre("Detective conan", "gosho", "gosho");
        Internet i = new Internet("How to live", "http://miyazaki_hayao.com");

        bib.ajouter(l1);
        bib.ajouter(l2);
        bib.ajouter(i);
        bib.listening();
    }
}