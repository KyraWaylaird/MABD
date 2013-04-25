/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Collection;

/**
 *
 * @author Guille
 */
public class Furgoneta
{

    private Integer idFurgoneta;
    private String estadoFurgoneta;
    private Collection<Pedido> pedidosAsignados;
    private CantidadesCafe cantidadesCafe;
    private Collection<Pedido> pedidosEntregados;
    private Direccion direccion;

    @Override
    public boolean equals(Object o)
    {
        boolean isEqual = false;
        if (o instanceof Furgoneta)
        {
            Furgoneta furgonetaAComparar = (Furgoneta) o;
            Integer idFurgonetaAComparar = furgonetaAComparar.getIdFurgoneta();
            if ((idFurgonetaAComparar == null) && (this.idFurgoneta == null))
            {
                isEqual = this.equals(o);
            }
            if ((idFurgonetaAComparar != null)
                    && (idFurgonetaAComparar.equals(this.idFurgoneta)))
            {
                isEqual = true;
            }
        }
        return isEqual;
    }

    /**
     * @return the idFurgoneta
     */
    public Integer getIdFurgoneta()
    {
        return idFurgoneta;
    }

    /**
     * @param idFurgoneta the idFurgoneta to set
     */
    public void setIdFurgoneta(Integer idFurgoneta)
    {
        this.idFurgoneta = idFurgoneta;
    }

    /**
     * @return the estadoFurgoneta
     */
    public String getEstadoFurgoneta()
    {
        return estadoFurgoneta;
    }

    /**
     * @param estadoFurgoneta the estadoFurgoneta to set
     */
    public void setEstadoFurgoneta(String estadoFurgoneta)
    {
        this.estadoFurgoneta = estadoFurgoneta;
    }

    /**
     * @return the pedidosAsignados
     */
    public Collection<Pedido> getPedidosAsignados()
    {
        return pedidosAsignados;
    }

    /**
     * @param pedidosAsignados the pedidosAsignados to set
     */
    public void setPedidosAsignados(Collection<Pedido> pedidosAsignados)
    {
        this.pedidosAsignados = pedidosAsignados;
    }

    /**
     * @return the cantidadesCafe
     */
    public CantidadesCafe getCantidadesCafe()
    {
        return cantidadesCafe;
    }

    /**
     * @param cantidadesCafe the cantidadesCafe to set
     */
    public void setCantidadesCafe(CantidadesCafe cantidadesCafe)
    {
        this.cantidadesCafe = cantidadesCafe;
    }

    /**
     * @return the pedidosEntregados
     */
    public Collection<Pedido> getPedidosEntregados()
    {
        return pedidosEntregados;
    }

    /**
     * @param pedidosEntregados the pedidosEntregados to set
     */
    public void setPedidosEntregados(Collection<Pedido> pedidosEntregados)
    {
        this.pedidosEntregados = pedidosEntregados;
    }

    /**
     * @return the direccion
     */
    public Direccion getDireccion()
    {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(Direccion direccion)
    {
        this.direccion = direccion;
    }
}
