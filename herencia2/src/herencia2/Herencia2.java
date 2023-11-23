//programa ejemplo de HERENCIA 
/*Nombre: Carlos Yahir Fernandez Espino
Grupo:301
Fecha:22/11/2023
*/
package herencia2;
import java.util.*;
abstract class vehiculo
{
    protected String marca;
    public vehiculo (String marca)
    {
        this.marca = marca;
    }
    public void arrancar()
    {
        System.out.println("Arrancando El Vehiculo");
    }
}
abstract class Automovil extends vehiculo
{
    private String modelo;
    public Automovil(String marca, String modelo)
    {
        super(marca);
        this.modelo = modelo;
    }
    public void conducir()
    {
        System.out.println("Conduciendo El Vehiculo");
    }
}
public class Herencia2 
{    
    public static void main(String[] args) 
    {
        Automovil miAuto = new Automovil ("TOYOTA","COROLLA"){};
        miAuto.arrancar();
        miAuto.conducir();
    }
    
}