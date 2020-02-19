package unac.edu.co.poo2;

public class Bebida  {
    protected String tamaño;
    protected String sabor;
    protected Double precio;

    public Bebida(){

    }

    public Bebida(String tamaño, String sabor, Double precio) {
        this.tamaño = tamaño;
        this.sabor = sabor;
        this.precio = precio;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
