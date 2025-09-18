package paradigmas.imperativa;

public class TipoDeDatos {
    public static void main(String[] args) {

        // Entero
        /*
         *  MIN_VALUE = -128;
            MAX_VALUE = 127;
        */
        byte valueByte = 127;

        /*
         *  MIN_VALUE = -32768;
            MAX_VALUE = 32767;
        */
        short valueShort = 2555;

        /*
            Valor Mínimo: -2.147.483.648 (o -2^31)
            Valor Máximo: 2.147.483.647 (o 2^31 - 1)
        */        
        int valueInt = 100;


        /*
         *  MIN_VALUE = -128;
            MAX_VALUE = 127;
        */
        long valueLong = 200;


        System.out.println("El valor para byte es : " + valueByte);
        System.out.println("El valor para short es : " + valueShort);
        System.out.println("El valor para int es : " + valueInt);
        System.out.println("El valor para long es : " + valueLong);

        //Reales

        float valueFloat;
        valueFloat = 2.5f;

        double valueDouble;
        valueDouble = 31.555;
        System.out.println("El valor para float es : " + valueFloat);
        System.out.println("El valor para double es : " + valueDouble);

        //Booleano - True o False - Verdadero Falso
        boolean valorTrue,valorFalse = false;
        valorTrue = true;

        System.out.println("El valor para variable verdadera es : " + valorTrue);
        System.out.println("El valor para variable falsa es : " + valorFalse);

        //Char
        char valueChar = 'a';

    }
}
