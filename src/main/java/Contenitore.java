import java.util.List;
import com.google.gson.annotations.SerializedName;
@SuppressWarnings("unused")

public class Contenitore {
	
	@SerializedName("size")
	private int size;
	@SerializedName("listaRisultati")
	private List<PuntoVendita> listaRisultati; 
	
	public Contenitore() {
	}
	
	public List<PuntoVendita> getData() {
        return this.listaRisultati;
    }

}
    
