import unac.edu.co.poo2.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {

    public static void main(String[] args) {

        //Bebida b1 = new Bebida("XL","Limoncello",13000.0);
        //Bebida b2 = new Bebida("L","Grappa",10000.0);
        //Bebida b3 = new Bebida("X","Strega",12500.0);

        Plato pizza = new Pizza("Siciliana",22500.0);
        Plato lasagna = new Lasagna("tres quesos",19000.0);
        Plato pasta = new Pasta("plumas arrabiata", 25000.0);
        Bebida bebidas = new Bebida("XL","Limoncello",13000.0);

        Combo combo = new Combo (pizza, bebidas);
        Combo combo1 = new Combo(lasagna, bebidas);
        Combo combo2 = new Combo(pasta,bebidas);

        List<Combo> combos = new ArrayList<>();
        combos.add(combo);
        combos.add(combo1);
        combos.add(combo2);

        Map<Integer, Combo > pedidos = new HashMap<>();
        pedidos.put(1, combos.get(0));
        pedidos.put(2, combos.get(1));
        pedidos.put(3, combos.get(2));

        System.out.println("Ha pedido:" + pedidos.get(2).getPlato().getSabor() + " bebida: "+ pedidos.get(2).getBebidas().getSabor());
        System.out.println("Precio: " + pedidos.get(2).getPrecio());
        System.out.println("Total: "  + pedidos.get(2).getPromocion());

    }

}
