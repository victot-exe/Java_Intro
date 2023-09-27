public class ExercicoTV{

    boolean ligada;
    int canal;
    int volume;

//Método que representa o botão on/off da tv
    void onOff(){
        this.ligada = !ligada;
    }

//Métodos para o volume
/*     private void aumentarVolume(){
        this.volume++;
    }

    private void abaixarVolume(){
        this.volume--;
    }
 */
    public void definirVolume(char v){
        if(v == '+'){
            this.volume++;
        }else if( v == '-'){
            this.volume--;
        }
        System.out.println("O volume é: " + volume);
    }

//Mudar de cannal
    private void subirCanal(){
        this.canal++;
    }
    private void abaixarCanal(){
        this.canal--;
    }
    private void definirCanal(int canal){
        this.canal = canal;
    }

    public static void main(String[] args) {
        ExercicoTV tv = new ExercicoTV();
        tv.subirCanal();
        tv.abaixarCanal();
        tv.definirCanal(27);
    }

}