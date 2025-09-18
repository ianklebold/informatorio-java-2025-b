package paradigmas.imperativa;

public class OperadoresExpresiones {
    public static void main(String[] args) {
        //Prefija 
        int valorInicial = 10;
        int valorPrefija = ++valorInicial;
        System.out.println(valorInicial);
        System.out.println(valorPrefija);

        //Sufijo
        valorInicial = 5;
        // int ValorSufijo = valorInicial++;
        System.out.println(valorInicial++);
        System.out.println(valorInicial);


        //Infija
        int suma = valorPrefija + valorInicial;
        int resta = 2 - 2;
        int multiplicacion = 2 * valorPrefija;
        int division = 10 / 5;
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multiplicacion);
        System.out.println(division);

        //<booleano>?  valorSiVerdadero : valorSiFalso
        int valorTernario = (resta == 0)? 5 : 3;
        // == Igual a
        // != Distinto a
        // < Menor que
        // > Mayor que
        // <= Menor igual que
        // >= Mayor igual que
        System.out.println(valorTernario);

        // Operadores logicos --> Cortacircuito
        // && AND 
        // || OR
        System.out.println((resta != 0 && suma > 100)? 5 : 3);

        // final TIPO NOMBRE_DE_CONSTANTE = VALOR;
        final int VALOR_CONSTANTE = 10;

    }
}
