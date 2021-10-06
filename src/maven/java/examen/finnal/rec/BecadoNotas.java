package examen.finnal.rec;

import java.time.LocalDate;

public class BecadoNotas extends Becado{
	
	private String codigoColegio;
	private LocalDate fechaCumplea�os;
	
	
	public String getCodigoColegio() {
		return codigoColegio;
	}
	public void setCodigoColegio(String codigoColegio) {
		this.codigoColegio = codigoColegio;
	}
	public LocalDate getFechaCumplea�os() {
		return fechaCumplea�os;
	}
	public void setFechaCumplea�os(LocalDate fechaCumplea�os) {
		this.fechaCumplea�os = fechaCumplea�os;
	}
	
	@Override
	public String toString() {
		return "BecadoNotas [codigoColegio=" + codigoColegio + ", fechaCumplea�os=" + fechaCumplea�os
				+ ", getCodigoBeca()=" + getCodigoBeca() + ", getNombre()=" + getNombre() + ", getApellido()="
				+ getApellido() + "]";
	}
	
}
