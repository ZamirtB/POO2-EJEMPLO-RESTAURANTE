package unac.edu.co.poo2;

public abstract class Plato {

    public String sabor;
    public Double precio;

    public Plato(){

    }

    public Plato(String sabor, double precio) {
        this.sabor = sabor;
        this.precio = precio;
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
