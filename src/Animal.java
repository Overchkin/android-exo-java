public class Animal
{
    // variables
    public String nom;
    public String race;
    public String jeDis;

    // méthode constructrice
    public Animal(String a, String b, String c) {
        nom = a;
        race = b;
        jeDis = c;
    }
    // méthodes
    public void sePresenter() {
        System.out.println("Bonjour! Je suis un(e) "+race+".");
        System.out.println("Je m'appelle "+nom+".");
        System.out.println("Je fais "+jeDis+".");
    }
}