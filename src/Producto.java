package Info_Producto;

public class Producto {
    // Atributos
    private String codigo;
    private String nombre;
    private float precio;

    //Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    //Setters

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    //Constructor Por defecto y código como “00”, nombre “producto 0” y precio=0
    public Producto() {
        this.codigo = "00";
        this.nombre = "producto 0";
        this.precio = 0;

    }
    //Constructor con tres valores
    public Producto(String codigo, String nombre, float precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
    //Constructor con valores para código y nombre (precio por defecto 10)
    public Producto(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = 10;
    }

    public Producto(Producto other) {
        this.codigo = other.codigo;
        this.nombre = other.nombre;
        this.precio = other.precio;
    }
}