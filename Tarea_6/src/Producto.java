public class Producto {
    private String name;
    private double precio;
    private int stock;

    public Producto(String name, double precio, int stock) {
        this.name = name;
        this.precio = precio;
        this.stock = stock;
    }

    public Producto(String name, double precio) {
        this(name,precio,0);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()){
            this.name = name;
        }else{
            System.out.println("El nombre no puede ser nulo o vacio");
        }

    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0){
            this.precio = precio;
        }else{
            System.out.println("El precio no puede ser negativo");
        }

    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("El stock no puede ser negativo ");
        }
    }
    public void aumentarStock(int cantidad){
        if (cantidad > 0){
            this.stock += cantidad;
        }else{
            System.out.println("La cantidad debe ser mayor a cero");
        }
    }
    public void reducirStock(int cantidad){
        if (cantidad > 0 && cantidad <= this.stock ){
            this.stock -= stock;
        }else {
            System.out.println("La cantidad debe ser mayor a cero y mayor o igual al stock");
        }
    }
}
