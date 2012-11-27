/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modulos.persistencia;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author chaqui
 */
@Entity
@Table(name = "Remision")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Remision.findAll", query = "SELECT r FROM Remision r"),
    @NamedQuery(name = "Remision.findByNoRemision", query = "SELECT r FROM Remision r WHERE r.noRemision = :noRemision"),
    @NamedQuery(name = "Remision.findByTipoPlaca", query = "SELECT r FROM Remision r WHERE r.tipoPlaca = :tipoPlaca"),
    @NamedQuery(name = "Remision.findByNoPlaca", query = "SELECT r FROM Remision r WHERE r.noPlaca = :noPlaca"),
    @NamedQuery(name = "Remision.findByNoDeTarjetaDeCirculacion", query = "SELECT r FROM Remision r WHERE r.noDeTarjetaDeCirculacion = :noDeTarjetaDeCirculacion"),
    @NamedQuery(name = "Remision.findByTipo", query = "SELECT r FROM Remision r WHERE r.tipo = :tipo"),
    @NamedQuery(name = "Remision.findByColor", query = "SELECT r FROM Remision r WHERE r.color = :color"),
    @NamedQuery(name = "Remision.findByMarcar", query = "SELECT r FROM Remision r WHERE r.marcar = :marcar"),
    @NamedQuery(name = "Remision.findByNombresDelInfractori", query = "SELECT r FROM Remision r WHERE r.nombresDelInfractori = :nombresDelInfractori"),
    @NamedQuery(name = "Remision.findByApellidosDelInfractor", query = "SELECT r FROM Remision r WHERE r.apellidosDelInfractor = :apellidosDelInfractor"),
    @NamedQuery(name = "Remision.findByDirreccion", query = "SELECT r FROM Remision r WHERE r.dirreccion = :dirreccion"),
    @NamedQuery(name = "Remision.findByNoDeRegistro", query = "SELECT r FROM Remision r WHERE r.noDeRegistro = :noDeRegistro"),
    @NamedQuery(name = "Remision.findByLicenciaNo", query = "SELECT r FROM Remision r WHERE r.licenciaNo = :licenciaNo"),
    @NamedQuery(name = "Remision.findByClasificacionDeLicencia", query = "SELECT r FROM Remision r WHERE r.clasificacionDeLicencia = :clasificacionDeLicencia"),
    @NamedQuery(name = "Remision.findByLugardelaInfraccion", query = "SELECT r FROM Remision r WHERE r.lugardelaInfraccion = :lugardelaInfraccion"),
    @NamedQuery(name = "Remision.findByHora", query = "SELECT r FROM Remision r WHERE r.hora = :hora"),
    @NamedQuery(name = "Remision.findByFecha", query = "SELECT r FROM Remision r WHERE r.fecha = :fecha"),
    @NamedQuery(name = "Remision.findByValorInfraccion1", query = "SELECT r FROM Remision r WHERE r.valorInfraccion1 = :valorInfraccion1"),
    @NamedQuery(name = "Remision.findByInfraccion1", query = "SELECT r FROM Remision r WHERE r.infraccion1 = :infraccion1"),
    @NamedQuery(name = "Remision.findByInfraccion2", query = "SELECT r FROM Remision r WHERE r.infraccion2 = :infraccion2"),
    @NamedQuery(name = "Remision.findByValorInfraccion2", query = "SELECT r FROM Remision r WHERE r.valorInfraccion2 = :valorInfraccion2"),
    @NamedQuery(name = "Remision.findByInfraccion3", query = "SELECT r FROM Remision r WHERE r.infraccion3 = :infraccion3"),
    @NamedQuery(name = "Remision.findByValorinfraccion3", query = "SELECT r FROM Remision r WHERE r.valorinfraccion3 = :valorinfraccion3"),
    @NamedQuery(name = "Remision.findByNoDeChapadelPolicia", query = "SELECT r FROM Remision r WHERE r.noDeChapadelPolicia = :noDeChapadelPolicia"),
    @NamedQuery(name = "Remision.findByDelegacion", query = "SELECT r FROM Remision r WHERE r.delegacion = :delegacion")})
public class Remision implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NoRemision")
    private Integer noRemision;
    @Column(name = "TipoPlaca")
    private Character tipoPlaca;
    @Size(max = 45)
    @Column(name = "NoPlaca")
    private String noPlaca;
    @Column(name = "NoDeTarjetaDeCirculacion")
    private Integer noDeTarjetaDeCirculacion;
    @Size(max = 45)
    @Column(name = "tipo")
    private String tipo;
    @Size(max = 45)
    @Column(name = "color")
    private String color;
    @Size(max = 45)
    @Column(name = "Marcar")
    private String marcar;
    @Size(max = 45)
    @Column(name = "Nombres_Del_Infractori")
    private String nombresDelInfractori;
    @Size(max = 45)
    @Column(name = "Apellidos_Del_Infractor")
    private String apellidosDelInfractor;
    @Size(max = 45)
    @Column(name = "Dirreccion")
    private String dirreccion;
    @Column(name = "NoDeRegistro")
    private Integer noDeRegistro;
    @Column(name = "LicenciaNo")
    private Integer licenciaNo;
    @Column(name = "Clasificacion_De_Licencia")
    private Character clasificacionDeLicencia;
    @Size(max = 100)
    @Column(name = "Lugar_de_la_Infraccion")
    private String lugardelaInfraccion;
    @Column(name = "Hora")
    @Temporal(TemporalType.TIME)
    private Date hora;
    @Column(name = "Fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Valor_Infraccion1")
    private Float valorInfraccion1;
    @Size(max = 45)
    @Column(name = "Infraccion1")
    private String infraccion1;
    @Size(max = 45)
    @Column(name = "Infraccion2")
    private String infraccion2;
    @Column(name = "Valor_Infraccion2")
    private Float valorInfraccion2;
    @Size(max = 45)
    @Column(name = "infraccion3")
    private String infraccion3;
    @Column(name = "Valor_infraccion3")
    private Float valorinfraccion3;
    @Lob
    @Size(max = 65535)
    @Column(name = "Fundamentos_De_Ley")
    private String fundamentosDeLey;
    @Column(name = "No_De_Chapa_del_Policia")
    private Integer noDeChapadelPolicia;
    @Size(max = 45)
    @Column(name = "Delegacion")
    private String delegacion;
    @Lob
    @Size(max = 65535)
    @Column(name = "Observaciones")
    private String observaciones;

    public Remision() {
    }

    public Remision(Integer noRemision) {
        this.noRemision = noRemision;
    }

    public Integer getNoRemision() {
        return noRemision;
    }

    public void setNoRemision(Integer noRemision) {
        this.noRemision = noRemision;
    }

    public Character getTipoPlaca() {
        return tipoPlaca;
    }

    public void setTipoPlaca(Character tipoPlaca) {
        this.tipoPlaca = tipoPlaca;
    }

    public String getNoPlaca() {
        return noPlaca;
    }

    public void setNoPlaca(String noPlaca) {
        this.noPlaca = noPlaca;
    }

    public Integer getNoDeTarjetaDeCirculacion() {
        return noDeTarjetaDeCirculacion;
    }

    public void setNoDeTarjetaDeCirculacion(Integer noDeTarjetaDeCirculacion) {
        this.noDeTarjetaDeCirculacion = noDeTarjetaDeCirculacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarcar() {
        return marcar;
    }

    public void setMarcar(String marcar) {
        this.marcar = marcar;
    }

    public String getNombresDelInfractori() {
        return nombresDelInfractori;
    }

    public void setNombresDelInfractori(String nombresDelInfractori) {
        this.nombresDelInfractori = nombresDelInfractori;
    }

    public String getApellidosDelInfractor() {
        return apellidosDelInfractor;
    }

    public void setApellidosDelInfractor(String apellidosDelInfractor) {
        this.apellidosDelInfractor = apellidosDelInfractor;
    }

    public String getDirreccion() {
        return dirreccion;
    }

    public void setDirreccion(String dirreccion) {
        this.dirreccion = dirreccion;
    }

    public Integer getNoDeRegistro() {
        return noDeRegistro;
    }

    public void setNoDeRegistro(Integer noDeRegistro) {
        this.noDeRegistro = noDeRegistro;
    }

    public Integer getLicenciaNo() {
        return licenciaNo;
    }

    public void setLicenciaNo(Integer licenciaNo) {
        this.licenciaNo = licenciaNo;
    }

    public Character getClasificacionDeLicencia() {
        return clasificacionDeLicencia;
    }

    public void setClasificacionDeLicencia(Character clasificacionDeLicencia) {
        this.clasificacionDeLicencia = clasificacionDeLicencia;
    }

    public String getLugardelaInfraccion() {
        return lugardelaInfraccion;
    }

    public void setLugardelaInfraccion(String lugardelaInfraccion) {
        this.lugardelaInfraccion = lugardelaInfraccion;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Float getValorInfraccion1() {
        return valorInfraccion1;
    }

    public void setValorInfraccion1(Float valorInfraccion1) {
        this.valorInfraccion1 = valorInfraccion1;
    }

    public String getInfraccion1() {
        return infraccion1;
    }

    public void setInfraccion1(String infraccion1) {
        this.infraccion1 = infraccion1;
    }

    public String getInfraccion2() {
        return infraccion2;
    }

    public void setInfraccion2(String infraccion2) {
        this.infraccion2 = infraccion2;
    }

    public Float getValorInfraccion2() {
        return valorInfraccion2;
    }

    public void setValorInfraccion2(Float valorInfraccion2) {
        this.valorInfraccion2 = valorInfraccion2;
    }

    public String getInfraccion3() {
        return infraccion3;
    }

    public void setInfraccion3(String infraccion3) {
        this.infraccion3 = infraccion3;
    }

    public Float getValorinfraccion3() {
        return valorinfraccion3;
    }

    public void setValorinfraccion3(Float valorinfraccion3) {
        this.valorinfraccion3 = valorinfraccion3;
    }

    public String getFundamentosDeLey() {
        return fundamentosDeLey;
    }

    public void setFundamentosDeLey(String fundamentosDeLey) {
        this.fundamentosDeLey = fundamentosDeLey;
    }

    public Integer getNoDeChapadelPolicia() {
        return noDeChapadelPolicia;
    }

    public void setNoDeChapadelPolicia(Integer noDeChapadelPolicia) {
        this.noDeChapadelPolicia = noDeChapadelPolicia;
    }

    public String getDelegacion() {
        return delegacion;
    }

    public void setDelegacion(String delegacion) {
        this.delegacion = delegacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (noRemision != null ? noRemision.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Remision)) {
            return false;
        }
        Remision other = (Remision) object;
        if ((this.noRemision == null && other.noRemision != null) || (this.noRemision != null && !this.noRemision.equals(other.noRemision))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.modulos.persistencia.Remision[ noRemision=" + noRemision + " ]";
    }
    
}
