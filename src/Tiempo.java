import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Tiempo {
    private Date fecha;

    public Tiempo() {
        this.fecha = new Date();
    }

    public String retornarFormatoCorto() {
        SimpleDateFormat formatoCorto = new SimpleDateFormat("dd/MM/yyyy");
        return formatoCorto.format(fecha);
    }

    public String retornarFormatoLargo() {
        SimpleDateFormat formatoLargo = new SimpleDateFormat("EEEE d 'de' MMMM 'de' yyyy", new Locale("es", "ES"));
        return formatoLargo.format(fecha);
    }
}
