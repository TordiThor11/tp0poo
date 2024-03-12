import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Tiempo {
    private LocalDateTime fecha;

    public Tiempo() {
        this.fecha = LocalDateTime.now();
    }

    public Tiempo(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String retornarFormatoCorto() {
        return DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(fecha);
    }

    public String retornarFormatoLargo() {
        return DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(fecha);
    }
}
