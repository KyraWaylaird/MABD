/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import classes.Direccion;
import classes.Furgoneta;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author Guille
 */
@Namespace(value = "/")
@Action(value = "verfurgoneta", results =
{
    @Result(name = "success", location = "/verfurgoneta.jsp")
})
public class VerFurgoneta extends ActionSupport
{

    private Furgoneta furgoneta;
    private Integer idFurgoneta;

    @Override
    public String execute()
    {
        Map<String, Object> session = ActionContext.getContext().getSession();
        Object object;
        if (session.containsKey("lista_furgoneta"))
        {
            object = session.get("lista_furgonetas");
            if (object instanceof Collection)
            {
                ArrayList<Furgoneta> furgonetasCollection =
                        (ArrayList<Furgoneta>) object;
                if (furgonetasCollection != null)
                {
                    Furgoneta furgonetaABuscar = new Furgoneta();
                    furgonetaABuscar.setIdFurgoneta(this.idFurgoneta);
                    Integer indexOfFurgonetaABuscar =
                            furgonetasCollection.indexOf(furgonetaABuscar);
                    if (indexOfFurgonetaABuscar >= 0)
                    {
                        setFurgoneta(furgonetasCollection.get(
                                indexOfFurgonetaABuscar));
                    }
                }
            }
        }

        //PRUEBAS
        Furgoneta furgonetaPrueba = new Furgoneta();
        furgonetaPrueba.setIdFurgoneta(1);
        furgonetaPrueba.setEstadoFurgoneta("bien");
        setFurgoneta(furgonetaPrueba);
        return SUCCESS;
    }

    /**
     * @return the furgoneta
     */
    public Furgoneta getFurgoneta()
    {
        return furgoneta;
    }

    /**
     * @param furgoneta the furgoneta to set
     */
    public void setFurgoneta(Furgoneta furgoneta)
    {
        this.furgoneta = furgoneta;
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
}
