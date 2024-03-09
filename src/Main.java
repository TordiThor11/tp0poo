import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //Uso de objeto no anemico.
        Tiempo tiempo = new Tiempo();
        //Formato largo:
        System.out.println(tiempo.retornarFormatoLargo());
        //Formato corto:
        System.out.println(tiempo.retornarFormatoCorto());

        //Uso de objeto anemico
        TiempoAnemico tiempoAnemico = new TiempoAnemico();
        //Formato largo:
        System.out.println(TiempoServicios.formatearFechaLarga(tiempoAnemico.get()));
        //Formato corto:
        System.out.println(TiempoServicios.formatearFechaCorta(tiempoAnemico.get()));
        /*Explicacion: La clase Tiempo no es anemica por que tiene sus atributos y funcionalidades, por otra parte,
         la clase TiempoAnemico carece de funcionalidades y depende de la funcionalidad de la clase TiempoServicios.
          TiempoAnemico solo almacena datos*/

        //Uso de record
        TiempoRecord tiempoRecord = new TiempoRecord(new Date());
        //Formato largo:
        System.out.println(TiempoServicios.formatearFechaLarga(tiempoRecord.fecha()));
        //Formato corto:
        System.out.println(TiempoServicios.formatearFechaCorta(tiempoRecord.fecha()));
    }
}