    public class ZooApp
{
    // les cages dans le zoo
    public static Animal[] Zoo = new Animal[3];

    public static void main(String[] args) {
        Zoo[0] = new Chien("Lia");
        Zoo[1] = new Chat("Toto");
        Zoo[2] = new Chat("Sisi");

        for (int j=0; j<3; j++) Zoo[j].sePresenter();

        try{System.in.read();}
        catch(java.io.IOException e) {}
    }
}