package examen.finnal.rec;

import java.time.LocalDate;

public class BecadoNotas extends Becado{
	
	private String codigoColegio;
	private LocalDate fechaCumpleaņos;
	
	
	public String getCodigoColegio() {
		return codigoColegio;
	}
	public void setCodigoColegio(String codigoColegio) {
		this.codigoColegio = codigoColegio;
	}
	public LocalDate getFechaCumpleaņos() {
		return fechaCumpleaņos;
	}
	public void setFechaCumpleaņos(LocalDate fechaCumpleaņos) {
		this.fechaCumpleaņos = fechaCumpleaņos;
	}
	
	@Override
	public String toString() {
		return "BecadoNotas [codigoColegio=" + codigoColegio + ", fechaCumpleaņos=" + fechaCumpleaņos
				+ ", getCodigoBeca()=" + getCodigoBeca() + ", getNombre()=" + getNombre() + ", getApellido()="
				+ getApellido() + "]";
	}
	
}
