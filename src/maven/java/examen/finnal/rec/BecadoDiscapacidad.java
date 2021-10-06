package examen.finnal.rec;

public class BecadoDiscapacidad extends Becado{
	
	private String codigoConadis;
	private String discapacidad;
	
	
	public String getCodigoConadis() {
		return codigoConadis;
	}
	public void setCodigoConadis(String codigoConadis) {
		this.codigoConadis = codigoConadis;
	}
	public String getDiscapacidad() {
		return discapacidad;
	}
	public void setDiscapacidad(String discapacidad) {
		this.discapacidad = discapacidad;
	}
	
	
	@Override
	public String toString() {
		return "BecadoDiscapacidad [codigoConadis=" + codigoConadis + ", discapacidad=" + discapacidad
				+ ", getCodigoBeca()=" + getCodigoBeca() + ", getNombre()=" + getNombre() + ", getApellido()="
				+ getApellido() + "]";
	}

}
