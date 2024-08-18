public class MyClass {
   
    public static void main (String [] args) {
        String primeiroNome = "Rafael";
        String segundoNome = "Matheus";

        String nomeCompleto = RetornarNomes(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String RetornarNomes(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }

}