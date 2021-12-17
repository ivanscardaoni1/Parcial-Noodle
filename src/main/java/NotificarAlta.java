public class NotificarAlta implements Tarea {
  public void ejecutar(Grupo grupo) {
    grupo.getParticipantes().forEach(participante -> participante.notificar("Se ha unido un nuevo participante", participante));
  }
}
//Idem para la baja con otro mensaje