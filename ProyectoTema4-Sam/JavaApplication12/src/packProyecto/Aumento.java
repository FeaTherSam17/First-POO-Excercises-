
package packProyecto;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author Polly
 */
public interface Aumento {
    Calendar fechaAct = Calendar.getInstance();
    public final static int ANYO = fechaAct.get(Calendar.YEAR);
    public final static int MES = fechaAct.get(Calendar.MONTH);
    public final static int DIA = fechaAct.get(Calendar.DAY_OF_MONTH);
    
    
    public abstract void Aumento(int dia, int mes, int anyo);
    
}
