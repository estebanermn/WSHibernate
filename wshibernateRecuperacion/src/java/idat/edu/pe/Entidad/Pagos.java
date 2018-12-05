package idat.edu.pe.Entidad;
// Generated 24/11/2018 10:17:40 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Pagos generated by hbm2java
 */
public class Pagos  implements java.io.Serializable {


     private PagosId id;
     private BigDecimal monto;
     private Date fecha;

    public Pagos() {
    }

	
    public Pagos(PagosId id, BigDecimal monto) {
        this.id = id;
        this.monto = monto;
    }
    public Pagos(PagosId id, BigDecimal monto, Date fecha) {
       this.id = id;
       this.monto = monto;
       this.fecha = fecha;
    }
   
    public PagosId getId() {
        return this.id;
    }
    
    public void setId(PagosId id) {
        this.id = id;
    }
    public BigDecimal getMonto() {
        return this.monto;
    }
    
    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }




}

