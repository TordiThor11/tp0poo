import java.time.LocalDateTime;

public class TiempoAnemico {
    private LocalDateTime fecha;

    public TiempoAnemico() {
        this.fecha = LocalDateTime.now();
    }
    
    public LocalDateTime get() {
        return this.fecha;
    }
}
