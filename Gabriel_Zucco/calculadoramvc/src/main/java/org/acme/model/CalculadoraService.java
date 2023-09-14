paclage org.acme.model;

public class CalculadoraService {
    public double realizarCalculo(String opcao, Double valor1, double valor2){
        switch (opcao) {
            case "Soma":
                return valor1 + valor2
            case "Sub":
                return valor1 - valor2;
            case "Mult":
                return valor1 * valor2;
            case "Div":
                return valor1 / valor2;
            default:
                return 0d;
        }
    }
}