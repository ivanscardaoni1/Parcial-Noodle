public class Abierto implements Condicion {

  public void inscribirEstudiante(Grupo grupo, Estudiante estudiante) {
    grupo.addParticipante(estudiante);
    //TODO aca van las tareas correspondientes
  }

  public void darDeBajaEstudiante(Grupo grupo, Estudiante estudiante) {
    grupo.removeParticipante(estudiante);
    //TODO aca van las tareas correspondientes
  }
}
