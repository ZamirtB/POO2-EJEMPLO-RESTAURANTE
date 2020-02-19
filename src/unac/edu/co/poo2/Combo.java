package unac.edu.co.poo2;

public class Combo {
    private Plato plato;
    private Bebida bebidas;
    private Double precio;

    public Combo(){

    }

    public Combo( Plato plato, Bebida bebidas) {
        this.plato = plato;
        this.bebidas = bebidas;
    }


    public Plato getPlato() {
        return plato;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }

    public Bebida getBebidas() {
        return bebidas;
    }

    public void setBebidas(Bebida bebidas) {
        this.bebidas = bebidas;
    }

    public Double getPrecio() {
        double plato;
        double bebida;
        double total;
        plato= this.plato.getPrecio();
        bebida=this.bebidas.getPrecio();
        total= (plato+bebida);
        return  total;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
