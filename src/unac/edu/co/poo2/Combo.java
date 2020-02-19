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

    public Combo(Plato plato, Bebida bebidas, Double precio) {
        this.plato = plato;
        this.bebidas = bebidas;
        this.precio = precio;
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
        bebida= bebidas.getPrecio();
        total=(plato+bebida);
        return  total;
    }
    public Double getPromocion(){
        double promocion;
        promocion= this.getPrecio()-(this.getPrecio()*0.15);
        return promocion;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
