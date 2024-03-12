import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TiempoServicios {
    public static String formatearFechaCorta(LocalDateTime fecha) {
        return DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(fecha);
    }

    public static String formatearFechaLarga(LocalDateTime fecha) {
        return DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(fecha);
    }
}
