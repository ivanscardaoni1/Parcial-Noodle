public class DarDeBajaEstudiante implements Issue {
  Grupo grupo;
  Estudiante estudiante;

  public void ejecutarse() {
    grupo.removeParticipante(estudiante);
    //TODO aca van las tareas a ejecutarse que podrian sacarse de un repo o inyectarse por
    // dependencia e ir pasando el parametro
  }
}