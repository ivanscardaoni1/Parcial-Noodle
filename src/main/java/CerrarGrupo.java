public class CerrarGrupo implements Issue {
  Grupo grupo;

  public void ejecutarse() {
    grupo.cerrarIndependientementeDelTamanio();
    //TODO aca va la lista de tareas a ejecutarse que yo sacaria de un repo por el requerimiento de que un admin
    //tiene que poder quitar o agregar, sino pueden venir de las tareas del grupo
  }
}