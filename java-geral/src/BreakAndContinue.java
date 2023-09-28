public class BreakAndContinue {
    public static void main(String[] args) {
        //exemplo de uso break
        for(int i = 1; i <= 5; i ++){
            if(i == 3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("--------------------------");
        //exemplo de uso continue
        for(int i = 1; i <= 5; i ++){
            if(i == 3){
                continue;
            }
            System.out.println(i);
        }
    }
}
