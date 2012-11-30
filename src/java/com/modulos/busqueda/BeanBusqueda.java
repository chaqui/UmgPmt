/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modulos.busqueda;

import com.modulos.persistencia.Remision;
import java.util.LinkedList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author chaqui
 */
@ManagedBean(name = "busqueda")
@SessionScoped
public class BeanBusqueda {
   private EntityManager em;
    /**
     * Creates a new instance of BeanBusqueda
     */
    public String numero,infraccion1,infraccion2,infraccion3,ntipo,ninfraccion1,ninfraccion2,ninfraccion3,nvalorinf1,nvalorinf2,nvalorinf3;
    public double valorinf1, valorinf2, valorinf3;
    Character tipo;

    public String getNtipo() {
        return ntipo;
    }

    public void setNtipo(String ntipo) {
        this.ntipo = ntipo;
    }

    public String getNinfraccion1() {
        return ninfraccion1;
    }

    public void setNinfraccion1(String ninfraccion1) {
        this.ninfraccion1 = ninfraccion1;
    }

    public String getNinfraccion2() {
        return ninfraccion2;
    }

    public void setNinfraccion2(String ninfraccion2) {
        this.ninfraccion2 = ninfraccion2;
    }

    public String getNinfraccion3() {
        return ninfraccion3;
    }

    public void setNinfraccion3(String ninfraccion3) {
        this.ninfraccion3 = ninfraccion3;
    }

    public String getNvalorinf1() {
        return nvalorinf1;
    }

    public void setNvalorinf1(String nvalorinf1) {
        this.nvalorinf1 = nvalorinf1;
    }

    public String getNvalorinf2() {
        return nvalorinf2;
    }

    public void setNvalorinf2(String nvalorinf2) {
        this.nvalorinf2 = nvalorinf2;
    }

    public String getNvalorinf3() {
        return nvalorinf3;
    }

    public void setNvalorinf3(String nvalorinf3) {
        this.nvalorinf3 = nvalorinf3;
    }
       
    public Character getTipo() {
        return tipo;
    }

    public void setTipo(Character tipo) {
        this.tipo = tipo;
        buscar();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
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

    public String getInfraccion3() {
        return infraccion3;
    }

    public void setInfraccion3(String infraccion3) {
        this.infraccion3 = infraccion3;
    }

    public double getValorinf1() {
        return valorinf1;
    }

    public void setValorinf1(double valorinf1) {
      if (valorinf1<0) {
            this.valorinf1=0;
        }
        else
        {
        this.valorinf1 = valorinf1;
        }
    }

    public double getValorinf2() {
        return valorinf2;
    }

    public void setValorinf2(double valorinf2) {
        if (valorinf2<0) {
            this.valorinf2=0;
        }
        else
        {
        this.valorinf2 = valorinf2;
        }
        }

    public double getValorinf3() {
        return valorinf3;
    }

    public void setValorinf3(double valorinf3) {
       if (valorinf3<0) {
            this.valorinf3=0;
        }
        else
        {
        this.valorinf3 = valorinf3;
        }
    }
    public void buscar()
    {
       Busqueda busqueda = new Busqueda();
       List lista = busqueda.findByNoPlaca(getNumero());
       
    }
}
