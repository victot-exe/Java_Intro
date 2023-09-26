public class TiposVariaves {
    public static void main(String[] args) {
        
        double salarioMinimo = 2500.33;
        nada(salarioMinimo);
        
        short numeroCurto = 1;
        int numeronormal = numeroCurto;
        short numeroCurto2 = (short)numeronormal;//-> aqui precisa ser feito um casting para que um número de um tipo mais abrangente caiba.
        numeroCurto = numeroCurto2;

        final double PI = 3.14;//-> por convenção está declarada em UPPERCASE
        //PI = 0;//como é final aqui aponta um erro
        nada(PI);
    }

    static void nada(double nome){}
}