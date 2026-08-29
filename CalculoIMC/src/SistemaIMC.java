import java.util.*;

public class SistemaIMC {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Pessoa p1 = new Pessoa();
        System.out.println("Digite seu nome:");
        p1.nome = sc.nextLine();
        System.out.println("Digite sua idade:");
        p1.idade = sc.nextInt();
        System.out.println("Digite sua altura ( ex: 1.50 ):");
        p1.altura = sc.nextDouble();
        System.out.println("Digite seu peso em Kg:");
        p1.peso = sc.nextDouble();
        p1.imc = 0.0;

        p1.calcularImc();

        System.out.println("Usuário: " + p1.nome);
        System.out.println("Idade: " + p1.idade);
        System.out.println("Altura: " + p1.altura);
        System.out.println("Peso: " + p1.peso);
        System.out.printf("Índice de Massa Corporal: %.2f\n", p1.imc);
        System.out.println("Estado atual: " + p1.informaObesidade());

        // Pessoa matheus = new Pessoa("Lukas", 18, 1.78, 85, 0);
        // Pessoa lukas = new Pessoa();
        // lukas.nome = "Lukas";
        // lukas.idade = 18;
        // lukas.altura = 1.76;
        // lukas.peso = 100.54;
        // lukas.imc = 0;

        // lukas.calcularImc();
        // int idadelukas = lukas.getIdade();
        // double pesolukas = lukas.getPeso();
        // System.out.println(idadelukas);
        // System.out.println(pesolukas);
        // System.out.printf("Lukas IMC: %.2f\n", lukas.imc);

        // matheus.calcularImc();
        // int idadematheus = matheus.getIdade();
        // double pesomatheus = matheus.getPeso();
        // System.out.println(idadematheus);
        // System.out.println(pesomatheus);
        // System.out.printf("Matheus IMC: %.2f\n ", matheus.imc);

        // System.out.println("Lukas: ");
        // System.out.println(lukas.informaObesidade());
        // System.out.println("");
        // System.out.println("Matheus :");
        // System.out.println(matheus.informaObesidade());
    }
}
