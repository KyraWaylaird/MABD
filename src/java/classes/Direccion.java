/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Guille
 */
public class Direccion
{
    
    private String calle;
    private Integer numero;
    private String localidad;

    /**
     * @return the calle
     */
    public String getCalle()
    {
        return calle;
    }

    /**
     * @param calle the calle to set
     */
    public void setCalle(String calle)
    {
        this.calle = calle;
    }

    /**
     * @return the numero
     */
    public Integer getNumero()
    {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(Integer numero)
    {
        this.numero = numero;
    }

    /**
     * @return the localidad
     */
    public String getLocalidad()
    {
        return localidad;
    }

    /**
     * @param localidad the localidad to set
     */
    public void setLocalidad(String localidad)
    {
        this.localidad = localidad;
    }

}
