import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Grupo {
  String nombre;
  List<Estudiante> participantes = new ArrayList<>();
  Integer tamanioIdeal;
  //Strategy, delego la responsabilidad de inscribir y dar de baja en la caracteristica de la que depende su accionar
  Condicion condicion = new Abierto();
  List<Issue> issues;
  List<Tarea> tareas;

  public void inscribir(Estudiante estudiante) {
    condicion.inscribirEstudiante(this, estudiante);
  }

  public void darDeDbaja(Estudiante estudiante) {
    condicion.darDeBajaEstudiante(this, estudiante);
  }

  //Este metodo solo se usa desde Inscribir
  public void addParticipante(Estudiante estudiante) {
    participantes.add(estudiante);
  }

  public void addIssue(Issue issue) {
    this.issues.add(issue);
  }

  //Este metodo solo se usa desde DarDeBaja
  public void removeParticipante(Estudiante estudiante) {
    participantes.remove(estudiante);
  }

  //Abstraccion para hacer mas expresivo el codigo
  public void cerrarIndependientementeDelTamanio() {
    this.condicion = new Cerrado();
  }

  public void cerrar() {
    Issue cierreDelGrupo = new CerrarGrupo(this);
    if(this.tamanioIdeal < participantes.size()) {
      this.issues.add(cierreDelGrupo);
    } else {
      cierreDelGrupo.ejecutarse();
    }
  }

  List<Tarea> getTareas() {
    return this.tareas;
  }

  String getNombre() {
    return nombre;
  }

  public List<Estudiante> getParticipantes() {
    return participantes;
  }
}
