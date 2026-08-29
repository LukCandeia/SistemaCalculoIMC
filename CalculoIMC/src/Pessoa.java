
public class Pessoa {
    String nome;
    int idade;
    double altura;
    double peso;
    double imc;

    public Pessoa(String nome, int idade, double altura, double peso, double imc) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.imc = imc;
    }

    public Pessoa() {
        this.nome = "";
        this.idade = 0;
        this.altura = 0.0;
        this.peso = 0.0;
        this.imc = 0.0;
    }

    public double calcularImc() {
        if (this.altura > 0 && this.peso > 0) {
            this.imc = this.peso / Math.pow(this.altura, 2);
        }
        return this.imc;
    }

    public String informaObesidade() {
        if (this.imc <= 18.5) {
            return "Abaixo do peso";
        } else if (this.imc <= 24.9) {
            return "Peso controlado";
        } else if (this.imc <= 29.9) {
            return "Acima do peso";
        } else if (this.imc <= 34.9) {
            return "Obesidade Grau I";
        } else if (this.imc <= 39.9) {
            return "Obesidade Grau II";
        } else {
            return "Obesidade Grau III";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

}
