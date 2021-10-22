package Kodlamaİo;

import oopIntro.ProductMenager;

public class Main {
    public static void main(String[] args) {
        Camps camp1 = new Camps(1, "JavaScript Geliştirme Kampı", "Engin Demiroğ", 10);

        Camps camp2 = new Camps(2, "C# Geliştirme Kampı", "Engin Demiroğ", 0);

        Camps camp3 = new Camps(3, "Java Geliştirme Kampı", "Engin Demiroğ", 0);

        Camps camp4 = new Camps(4, "Programlamaya Giriş", "Engin Demiroğ", 0);



        Category category1 = new Category();
        category1.id = 1 ;
        category1.name = "Programlama";

        Category category2 = new Category();
        category2.id = 2;
        category2.name = "Eğitmen";

        CampManager campManager = new CampManager();

        campManager.toRegister(camp1);

        campManager.toRegister(camp2);

        campManager.toRegister(camp3);




   }


}
