//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Producto producto1 = new Producto("Coca cola",22.5,32);
        Producto producto2 = new Producto("Doritos",18);
        Producto producto3 = new Producto(" ",-2,-5);

        System.out.println("Producto:"+producto1.getName()+"\n"+"Precio:"+producto1.getPrecio()+"\n"+"Stock:"+ producto1.getStock());
        System.out.println("***********************************************************");
        System.out.println("Producto:"+producto2.getName()+"\n"+"Precio:"+producto2.getPrecio());
        System.out.println("***********************************************************");
        System.out.println("Compramos 10 cocas");
        producto1.aumentarStock(10);
        System.out.println("Compramos 2 doritos");
        producto2.aumentarStock(2);
        System.out.println("Stock actualizado de "+producto1.getName()+":"+producto1.getStock());
        System.out.println("Stock actualizado de "+producto2.getName()+":"+producto2.getStock());
        System.out.println("***********************************************************");
    }
}