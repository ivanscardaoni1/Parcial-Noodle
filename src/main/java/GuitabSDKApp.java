import java.util.List;
import java.util.stream.Collectors;

public class GuitabSDKApp implements RepositoriosApp {
  GuitabSDK guitabSDK;

  public void crear(String nombre, List<Estudiante> estudiantes) {
    List<String> nombresDeUsuario = estudiantes.stream().map(estudiante -> estudiante.getUsername()).collect(Collectors.toList());
    guitabSDK.crearRepositorioConAccesos(nombre, nombresDeUsuario);
  }
  public void darAcceso(String nombre, Estudiante estudiante) {
    String username = estudiante.getUsername();
    guitabSDK.darAcceso(nombre, username);
  }
  public void quitarAcceso(String nombre, Estudiante estudiante) {
    String username = estudiante.getUsername();
    guitabSDK.quitarAcceso(nombre, username);
  }
}
