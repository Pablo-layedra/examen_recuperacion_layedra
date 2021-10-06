package examen.finnal.rec;

public class BecadoRecursos extends Becado{
	
	private String codigoBeneficio;
	private int salarioFamiliar;
	
	public String getCodigoBeneficio() {
		return codigoBeneficio;
	}
	public void setCodigoBeneficio(String codigoBeneficio) {
		this.codigoBeneficio = codigoBeneficio;
	}
	public int getSalarioFamiliar() {
		return salarioFamiliar;
	}
	public void setSalarioFamiliar(int salarioFamiliar) {
		this.salarioFamiliar = salarioFamiliar;
	}
	
	@Override
	public String toString() {
		return "BecadoRecursos [codigoBeneficio=" + codigoBeneficio + ", salarioFamiliar=" + salarioFamiliar
				+ ", getCodigoBeca()=" + getCodigoBeca() + ", getNombre()=" + getNombre() + ", getApellido()="
				+ getApellido() + "]";
	}

}
