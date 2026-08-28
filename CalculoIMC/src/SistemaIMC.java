import java.util.*;

public class SistemaIMC {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Pessoa matheus = new Pessoa("Lukas", "Nathan", 18, 1.78, 85, 0);
        Pessoa lukas = new Pessoa();
        lukas.nome = "Lukas";
        lukas.sobrenome = "Nathan";
        lukas.idade = 18;
        lukas.altura = 1.76;
        lukas.peso = 100.54;
        lukas.imc = 0;

        lukas.calcularImc();
        int idadelukas = lukas.getIdade();
        double pesolukas = lukas.getPeso();
        System.out.println(idadelukas);
        System.out.println(pesolukas);
        System.out.printf("Lukas IMC: %.2f\n", lukas.imc);

        matheus.calcularImc();
        int idadematheus = matheus.getIdade();
        double pesomatheus = matheus.getPeso();
        System.out.println(idadematheus);
        System.out.println(pesomatheus);
        System.out.printf("Matheus IMC: %.2f\n ", matheus.imc);

        System.out.println("Lukas: ");
        System.out.println(lukas.informaObesidade());
        System.out.println("");
        System.out.println("Matheus :");
        System.out.println(matheus.informaObesidade());
    }
}
