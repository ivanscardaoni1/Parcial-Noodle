public class InscribirEstudiante implements Issue {
  Grupo grupo;
  Estudiante estudiante;

  public void ejecutarse() {
    grupo.addParticipante(estudiante);
    // TODO le das acceso especificamente al estudiante con la tarea DarAccesoARepositorio
    //TODO aca van las tareas a ejecutarse que podrian sacarse de un repo o inyectarse por
    // dependencia e ir pasando el parametro
  }
}