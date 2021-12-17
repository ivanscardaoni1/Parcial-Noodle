public class Cerrado implements Condicion{

  public void inscribirEstudiante(Grupo grupo, Estudiante estudiante) {
    Issue inscripcion = new InscribirEstudiante(grupo, estudiante);
    grupo.addIssue(inscripcion);
  }

  public void darDeBajaEstudiante(Grupo grupo, Estudiante estudiante) {
    Issue baja = new DarDeBajaEstudiante(grupo, estudiante);
    grupo.addIssue(baja);
  }
}
