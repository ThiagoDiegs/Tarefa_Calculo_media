/**
 * @author thiago.araujo
 */
public class Fernanda {

    public static void main(String args[]) {
        portugues();
        matematica();


    }

    private static void matematica() {
        double primeiroBimestre = 8.8;
        double segundoBimestre  = 5.5;
        double terceiroBimestre = 8.7;
        double quartoBimestre   = 9.1;

        double mediaMatematica = (primeiroBimestre + segundoBimestre + terceiroBimestre + quartoBimestre) / 4;
        System.out.println("Media da Fernanda em Matematica: " + mediaMatematica);
    }

    private static void portugues() {
        double primeiroBimestre = 7.8;
        double segundoBimestre  = 6.5;
        double terceiroBimestre = 8.7;
        double quartoBimestre   = 4.3;

        double mediaPortugues = (primeiroBimestre + segundoBimestre + terceiroBimestre + quartoBimestre) / 4;
        System.out.println("Media da Fernanda em Portugues: " + mediaPortugues);
    }

}
