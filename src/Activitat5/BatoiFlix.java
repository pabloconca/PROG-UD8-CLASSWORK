package Activitat5;

import Activitat5.Produccion.Documental;
import Activitat5.Produccion.Pelicula;
import Activitat5.Produccion.Serie;

public class BatoiFlix {
    public static void main(String[] args) {
        Fecha fecha = new Fecha("1/03/22");
        Fecha fecha1 = new Fecha("02/03/22");

        Serie serie = new Serie("Los pepes",Tipo.MOV,fecha1);
        Pelicula pelicula = new Pelicula("Jose y el almendrero gigante",Tipo.AVI,fecha);
        Documental documental = new Documental("Las cosmicas aventuras del manolo",Tipo.AVI,3000,fecha,"El davi","los melones");


        Compra compra1 = new Compra(serie,fecha,false,"Maestro apruebame porfavor");
        Compra compra2 = new Compra(pelicula,fecha,false,"El jose saes o no");
        Compra compra3 = new Compra(documental,fecha,false,"Si");

        Cliente cliente1 = new Cliente(fecha,"emailinventado@gmail.com","Elma","Nolo","45432M");
        Cliente cliente2 = new Cliente(fecha,"emailinventado@gmail2.com","Elpe","Pito","4543232M");
        Cliente cliente3 = new Cliente(fecha,"emailinventado@gmail3.com","Eljo","Selito","4545732M");

        cliente1.addCompra(compra1);
        cliente1.addCompra(compra2);
        cliente2.addCompra(compra2);
        cliente3.addCompra(compra3);

        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());
        System.out.println(cliente3.toString());
    }
}
