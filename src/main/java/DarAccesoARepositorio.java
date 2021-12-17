public class DarAccesoARepositorio implements Tarea {
  RepositoriosApp repositoriosApp;
  Estudiante estudiante;

  public void ejecutarse(Grupo grupo) {
    repositoriosApp.darAcceso(grupo.getNombre(), estudiante);
  }
}
