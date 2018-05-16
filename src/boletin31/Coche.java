package boletin31;

public class Coche {
    private String matricula;
    private String marca;
    private String modelo;

    public Coche() {
    }

    public Coche(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Coche de la  empresa: matricula: " + matricula + ", Marca: " + marca + ", Modelo: " + modelo;
    }
}
