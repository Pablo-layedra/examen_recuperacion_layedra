package examen.finnal.rec;

import java.time.LocalDate;

public class BecadoNotas extends Becado{
	
	private String codigoColegio;
	private LocalDate fechaCumpleaños;
	
	
	public String getCodigoColegio() {
		return codigoColegio;
	}
	public void setCodigoColegio(String codigoColegio) {
		this.codigoColegio = codigoColegio;
	}
	public LocalDate getFechaCumpleaños() {
		return fechaCumpleaños;
	}
	public void setFechaCumpleaños(LocalDate fechaCumpleaños) {
		this.fechaCumpleaños = fechaCumpleaños;
	}
	
	@Override
	public String toString() {
		return "BecadoNotas [codigoColegio=" + codigoColegio + ", fechaCumpleaños=" + fechaCumpleaños
				+ ", getCodigoBeca()=" + getCodigoBeca() + ", getNombre()=" + getNombre() + ", getApellido()="
				+ getApellido() + "]";
	}
	
}
