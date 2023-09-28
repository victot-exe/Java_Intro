import java.util.Random;

public class LoopDoWhile{

    public static void main(String[] args) {
        System.out.println("Discando...");
        do{
            //repetir até alguem atender
            System.out.println("Tuuuuuuuu....Tuuuuuuu");
        }while(tocando());
            System.out.println("alo!!");
        
    }

    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        //nega o ato de continuar tocando já que se atender não toca mais, e se toca não atendeu ainda
        return !atendeu;
    }
}