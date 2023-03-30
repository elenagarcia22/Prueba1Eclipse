
public class Alumno {
	private String nombre;
	private String apellido;
	private String dni;
	
	public Alumno(String nombre,String apellido,String dni) {
		this.apellido=apellido;
		this.nombre=nombre;
		this.dni=dni;
	}

	@Override
	public String toString() {
		return "Alumno tiene nombre: " + nombre + ", apellido: " + apellido + ", dni: " + dni ;
	}

}
