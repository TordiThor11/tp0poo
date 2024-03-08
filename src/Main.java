public class Main {
    public static void main(String[] args) {
        //Uso de objeto no anemico.
//        Tiempo tiempo = new Tiempo();
        //Formato largo:
//        System.out.printf(tiempo.retornarFormatoLargo());
        //Formato corto:
//        System.out.printf(tiempo.retornarFormatoCorto());

        //Uso de objeto anemico
        TiempoAnemico tiempoAnemico = new TiempoAnemico();
        TiempoServicios tiempoServicios = new TiempoServicios();
        //Formato corto:
//        System.out.printf(tiempoServicios.retornarFormatoCorto(tiempoAnemico.get()));
        //Formato largo:
//        System.out.printf(tiempoServicios.retornarFormatoLargo(tiempoAnemico.get()));
        /*Explicacion: La clase Tiempo no es anemica por que tiene sus atributos y funcionalidades, por otra parte,
         la clase TiempoAnemico carece de funcionalidades y depende de la funcionalidad de la clase TiempoServicios.
          TiempoAnemico solo almacena datos*/
    }
}