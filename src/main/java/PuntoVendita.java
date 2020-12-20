import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class PuntoVendita {
	
	@SerializedName("idPuntoVendita")
	private int idPuntoVendita;
	
	@SerializedName("denominazione")
	private String denominazione;
	
	@SerializedName("indirizzo")
	private String indirizzo;
	
	@SerializedName("cap")
	private int cap;
	
	@SerializedName("comune")
	private String comune;
	
	@SerializedName("codProvincia")
	private String codProvincia;
	
	@SerializedName("urlSito")
	private String urlSito;
	
	@SerializedName("telefonoPrincipale")
	private String telefonoPrinciapale;
	
	@SerializedName("telefonoSecondario")
	private String telefonoSecondario;
	
	@SerializedName("email")
	private String email;
	
	@SerializedName("latitudine")
	private float latitudine;
	
	@SerializedName("longitudine")
	private float longitudine;
	
	@SerializedName("flagFisicoOnline")
	private boolean flagFisicoOnline;
	
	@SerializedName("idEsercente")
	private int idEsercente;
	
	@SerializedName("ragioneSociale")
	private String ragioneSociale;
	
	public PuntoVendita() {	
	}
	
	//idPuntoVendita
	//getter
	public int getidPuntoVendita() {
		return this.idPuntoVendita;
	}
	//setter
	public void setidPuntoVendita(int idpv) {
		this.idPuntoVendita=idpv;
	}
	
	//denominazione
	//getter
	public String getDenominazione() {
		return this.denominazione;
	}
	//setter
	public void setDenominazione(String den) {
		this.denominazione=den;
	}
	
	//indirizzo
	//getter
	public String getIndirizzo() {
		return this.indirizzo;
	}
	//setter
	public void setIndirizzo(String ind) {
		this.indirizzo=ind;
	}
	
	//cap
	//getter
	public int getCap() {
		return this.cap;
	}
	//setter
	public void setCap(int cap) {
		this.cap=cap;
	}
	
	//comune
	//getter
	public String getComune() {
		return this.comune;
	}
	//setter
	public void setComune(String com) {
		this.comune=com;
	}
	
	//codProvincia
	//getter
	public String getCodProvincia() {
		return this.codProvincia;
	}
	//setter
	public void setCodProvincia(String codP) {
		this.codProvincia=codP;
	}
	
	//urlSito
	//getter
	public String getUrlSito() {
		return this.urlSito;
	}
	//setter
	public void setUrlSito(String urlS) {
		this.urlSito=urlS;
	}
	
	//telefonoPrinciapale
	//getter
	public String getTelefonoPrinciapale() {
		return this.telefonoPrinciapale;
	}
	//setter
	public void setTelefonoPrinciapale(String TP) {
		this.telefonoPrinciapale=TP;
	}
	
	//telefonoSecondario
	//getter
	public String getTelefonoSecondario() {
		return this.telefonoSecondario;
	}
	//setter
	public void setTelefonoSecondario(String TS) {
		this.telefonoSecondario=TS;
	}
	
	//email
	//getter
	public String getEmail() {
		return this.email;
	}
	//setter
	public void setEmail(String email) {
		this.email=email;
	}
	
	//latitudine
	//getter
	public float getLatitudine() {
		return this.latitudine;
	}
	//setter
	public void setLatitudine(float lat) {
		this.latitudine=lat;
	}
	
	//longitudine
	//getter
	public float getLongitudine() {
		return this.longitudine;
	}
	//setter
	public void setLongitudine(float longi) {
		this.longitudine=longi;
	}
	
	//flagFiscoOnline
	//getter
	public boolean getFlagFisicoOnline() {
		return this.flagFisicoOnline;
	}
	//setter
	public void setFlagFisicoOnline(boolean FFO) {
		this.flagFisicoOnline=FFO;
	}
	
	//idEsercente
	//getter
	public int getIdEsercente() {
		return this.idEsercente;
	}
	//setter
	public void setIdEsercente(int idE) {
		this.idEsercente=idE;
	}
	
	//email
	//getter
	public String getRagioneSociale() {
		return this.email;
	}
	//setter
	public void setRagioneSociale(String RagSoc) {
		this.ragioneSociale=RagSoc;
	}
}
