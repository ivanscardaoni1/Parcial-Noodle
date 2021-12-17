import java.util.List;

public interface RepositoriosApp {
  public void crear(String nombre, List<Estudiante> estudiantes);
  public void darAcceso(String nombre, Estudiante estudiante);
  public void quitarAcceso(String nombre, Estudiante estudiante);
}
