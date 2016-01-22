public class Materia {
	private String codigo;
	private String nombre;
	private String descripcion;
	private int creditosTeoricos;
	private int creditosPracticos;
	
	
	public Materia(String codigo, String nombre, String descripcion, int creditosTeoricos, 
			int creditosPracticos){
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.creditosTeoricos = creditosTeoricos;
		this.creditosPracticos = creditosPracticos;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public int getCreditosTeoricos() {
		return creditosTeoricos;
	}


	public void setCreditosTeoricos(int creditosTeoricos) {
		this.creditosTeoricos = creditosTeoricos;
	}


	public int getCreditosPracticos() {
		return creditosPracticos;
	}


	public void setCreditosPracticos(int creditosPracticos) {
		this.creditosPracticos = creditosPracticos;
	}
	
	
	
	

}
