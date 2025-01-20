package Exercises;

public class Perfil {
    public String nome;

    public String ExibeNome(){
//        return "===Nome===" + "\n" +
//                this.nome;
        return this.nome;
    }

    public static void main(String[] args) {
        Perfil FirstProfile = new Perfil();
        FirstProfile.nome = "Otávio";
//        System.out.println(FirstProfile.ExibeNome());
        System.out.println("Olá " + FirstProfile.ExibeNome() + " tudo bem?");
    }
}

// Crie um projeto Java no IntelliJ que deve conter uma classe chamada Exercises.Perfil,
// com o metodo main, que ao executar deverá imprimir um cumprimento personalizado
//  no console. Por exemplo, "Olá, [Seu Nome]!".

//Modifique o programa para imprimir uma segunda mensagem de cumprimento personalizada.
// Por exemplo, "Tudo bem?".