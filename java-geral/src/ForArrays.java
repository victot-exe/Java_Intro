public class ForArrays {
    public static void main(String[] args) {
        
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        System.out.println("S/ forEach");
        for(int i=0; i < alunos.length; i++){
            System.out.printf("O aluno no indice %d é %s. \n", i, alunos[i]);
        }

        System.out.println("C/ forEach");
        for(String aluno: alunos){
            System.out.println("O nome do aluno é: " + aluno);
        }
    }
}
