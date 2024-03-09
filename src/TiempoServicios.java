import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TiempoServicios {
    public static String formatearFechaCorta(Date fecha) {
        SimpleDateFormat formatoCorto = new SimpleDateFormat("dd/MM/yyyy");
        return formatoCorto.format(fecha);
    }

    public static String formatearFechaLarga(Date fecha) {
        SimpleDateFormat formatoLargo = new SimpleDateFormat("EEEE d 'de' MMMM 'de' yyyy", new Locale("es", "ES"));
        return formatoLargo.format(fecha);
    }
}
