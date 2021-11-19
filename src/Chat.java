public class Chat extends Animal implements Inter
{
    // méthode constructrice
    public Chat(String n) {
        super(n,"chat","miau, miau");
    }
    public static String Nom(String nom){
        System.out.println("Le chat s'appelle"+nom);
    }
    public static void caract(int hauteur,int vitesse,String color){
        System.out.println("il a une taille de "+taille+" une hauteur de "+hauteur+" "+"et court à une vitesse de "+vitesse+"avec une couleur"+color);
    }
}
