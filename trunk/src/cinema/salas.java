/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author marcelo
 */
public class salas {
    
    private int codigo;
    public static final String PROP_CODIGO = "codigo";

    public int getCodigo() {
        
        return codigo;
    }

    public void setCodigo(int codigo) {
        int oldCodigo = this.codigo;
        this.codigo = codigo;
        propertyChangeSupport.firePropertyChange(PROP_CODIGO, oldCodigo, codigo);
    }
    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }
      private int lotacao;
    public static final String PROP_LOTACAO = "lotacao";

    public int getLotacao() {
        return lotacao;
    }

    public void setLotacao(int lotacao) {
        int oldLotacao = this.lotacao;
        this.lotacao = lotacao;
        propertyChangeSupport.firePropertyChange(PROP_LOTACAO, oldLotacao, lotacao);
    }


}
