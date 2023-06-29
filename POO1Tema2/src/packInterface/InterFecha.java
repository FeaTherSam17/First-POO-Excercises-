
package packInterface;
import java .util.Calendar;

public interface InterFecha {
    public static final int dAct = Calendar.DAY_OF_MONTH;
    public static final int mAct = Calendar.MONTH;
    public static final int aAct = Calendar.YEAR;
    
    public abstract int dia();
    public abstract int mes();
    public abstract int año();
}
