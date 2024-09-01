public class App {
    public static void main(String[] args) throws Exception {
        /* 
        String alunos [] = {"1", "2", "3", "4"};

        for(String aluno : alunos){
            System.out.println(aluno);
        }

        System.out.println("\r\n");

        for (int num=0; num<6; num++){
            if(num == 3) {
                continue;// pula a impressao do 3, continua o codigo e desconsidera tudo que vem depois dele
            }

            System.out.println(num);
        }

        System.out.println("\r\n");

        */
        int num = 5;
        int count = 1; 

        do { 
            num += count; 
            System.out.println(num); 
            
        } while (count <= 3);
    }
}
