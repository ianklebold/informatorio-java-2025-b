package paradigmas.poo.primeraclase;


//public --> Es un modificador de acceso (Clasificador para clase)
//class --> Indicamos que es una clase
// Auto --> Es el nombre de mi clase

public class Auto {

    //Atributos
    private int cantidadDeRuedas;
    private boolean esElectrico = false;
    private String marca;
    private String modelo;
    private String color;

    //Constructores
    public Auto() {} //Constructor
    public Auto(int cantidadDeRuedas, boolean esElectrico, String marca, String color) {
        this.cantidadDeRuedas = cantidadDeRuedas;
        this.esElectrico = esElectrico;
        this.marca = marca;
        this.color = color;
    }
    public Auto(int cantidadDeRuedas, String marca, String modelo, String color) {
        this.cantidadDeRuedas = cantidadDeRuedas;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }



    //Setters - Guardamos informacion

    //public --> Es un modificador de acceso (Clasificador para metodo)
    //void --> Tipo de retorno en este caso no devuelve nada
    //setCantidadDeRuedas --> nombre del metodo
    //() --> Los parametros del metodo
    public void setCantidadDeRuedas(int cantidadDeRuedas) {
        //this apunta la clase a si mismo.
        this.cantidadDeRuedas = cantidadDeRuedas;
    }

    public void setEsElectrico(boolean esElectrico) {
        this.esElectrico = esElectrico;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Getters - Devolvemos informacion
    public int getCantidadDeRuedas(){
        return this.cantidadDeRuedas; //return --> Devuelve 'algo' en el metodo
    }

    public boolean getEsElectrico(){
        return this.esElectrico;
    }

    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public String getColor(){
        return this.color;
    }


    public void mostrarInformacion(){
        System.out.println(this.getCantidadDeRuedas());
        System.out.println(this.getColor());
        System.out.println(this.getMarca());
        System.out.println(this.getModelo());
        System.out.println(this.getEsElectrico());
    }

}