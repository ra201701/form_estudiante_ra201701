/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstudianteManagedBean;

import Tratamiento_Estudiantes.TbEstudiante;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author edgarrenderos
 */
@Stateless
public class TbEstudianteFacade extends AbstractFacade<TbEstudiante> implements TbEstudianteFacadeLocal {

    @PersistenceContext(unitName = "Form_Estudiante_RA201701PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TbEstudianteFacade() {
        super(TbEstudiante.class);
    }
    
}
