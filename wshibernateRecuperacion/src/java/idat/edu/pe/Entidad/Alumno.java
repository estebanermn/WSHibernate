package idat.edu.pe.Entidad;
// Generated 24/11/2018 10:17:40 AM by Hibernate Tools 4.3.1



/**
 * Alumno generated by hbm2java
 */
public class Alumno  implements java.io.Serializable {


     private String idAlumno;
     private String apeAlumno;
     private String nomAlumno;
     private String idesp;
     private String proce;

    public Alumno() {
    }

	
    public Alumno(String idAlumno, String apeAlumno, String nomAlumno, String idesp) {
        this.idAlumno = idAlumno;
        this.apeAlumno = apeAlumno;
        this.nomAlumno = nomAlumno;
        this.idesp = idesp;
    }
    public Alumno(String idAlumno, String apeAlumno, String nomAlumno, String idesp, String proce) {
       this.idAlumno = idAlumno;
       this.apeAlumno = apeAlumno;
       this.nomAlumno = nomAlumno;
       this.idesp = idesp;
       this.proce = proce;
    }
   
    public String getIdAlumno() {
        return this.idAlumno;
    }
    
    public void setIdAlumno(String idAlumno) {
        this.idAlumno = idAlumno;
    }
    public String getApeAlumno() {
        return this.apeAlumno;
    }
    
    public void setApeAlumno(String apeAlumno) {
        this.apeAlumno = apeAlumno;
    }
    public String getNomAlumno() {
        return this.nomAlumno;
    }
    
    public void setNomAlumno(String nomAlumno) {
        this.nomAlumno = nomAlumno;
    }
    public String getIdesp() {
        return this.idesp;
    }
    
    public void setIdesp(String idesp) {
        this.idesp = idesp;
    }
    public String getProce() {
        return this.proce;
    }
    
    public void setProce(String proce) {
        this.proce = proce;
    }




}


