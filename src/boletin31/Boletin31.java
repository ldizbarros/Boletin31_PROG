package boletin31;

public class Boletin31 {

    public static void main(String[] args) {
        
        Empregado secretario = new Secretario("Despacho 20", 7448596, "35678965E", "Pepe", "Lopez",
                "Calle Aventura", 3, 985698523, 1000, "Juanjo");
        
        Empregado vendedor =  new Vendedor(new Coche("1254RTF","Opel","Corsa"), 6895236, "Cosmetica",
                70, "77567890Y", "Luisa", "Sanchez", "Calle Salamanca", 20, 9865236,
                1700, "Pepe");
        
        Empregado xefeZona = new XefeZona("Despacho 1", new Secretario("Despacho 20", 7448596, "35678965E", "Pepe", "Lopez",
                "Calle Aventura", 3, 985698523, 1000, "Juanjo") , new Coche("1254RTF","Opel","Corsa"),
                "77567890Y", "Maria", "Perez", "Calle Rara", 5, 9865236,
                2700, "Jose");
        
        secretario.imprimir(secretario);
        secretario.aumentarSalario(secretario);
        vendedor.imprimir(vendedor);
        vendedor.aumentarSalario(vendedor);
        xefeZona.imprimir(xefeZona);
        xefeZona.aumentarSalario(xefeZona);
    }
    
}
