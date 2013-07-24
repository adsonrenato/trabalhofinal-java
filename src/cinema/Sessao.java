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
public class Sessao {
    
    private String nome;
    public static final String PROP_NOME = "nome";

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        propertyChangeSupport.firePropertyChange(PROP_NOME, oldNome, nome);
    }
    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }
    private String data;
    public static final String PROP_DATA = "data";

    public String getData() {
        return data;
    }

    public void setData(String data) {
        String oldData = this.data;
        this.data = data;
        propertyChangeSupport.firePropertyChange(PROP_DATA, oldData, data);
    }
       private String horarioInicio;
    public static final String PROP_HORARIOINICIO = "horarioInicio";

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(String horarioInicio) {
        String oldHorarioInicio = this.horarioInicio;
        this.horarioInicio = horarioInicio;
        propertyChangeSupport.firePropertyChange(PROP_HORARIOINICIO, oldHorarioInicio, horarioInicio);
    }

    private String horarioFim;
    public static final String PROP_HORARIOFIM = "horarioFim";

    public String getHorarioFim() {
        return horarioFim;
    }

    public void setHorarioFim(String horarioFim) {
        String oldHorarioFim = this.horarioFim;
        this.horarioFim = horarioFim;
        propertyChangeSupport.firePropertyChange(PROP_HORARIOFIM, oldHorarioFim, horarioFim);
    }
    private int numeroSala;
    public static final String PROP_NUMEROSALA = "numeroSala";

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        int oldNumeroSala = this.numeroSala;
        this.numeroSala = numeroSala;
        propertyChangeSupport.firePropertyChange(PROP_NUMEROSALA, oldNumeroSala, numeroSala);
    }
    private int numeroIngressosVendidos;
    public static final String PROP_NUMEROINGRESSOSVENDIDOS = "numeroIngressosVendidos";

    public int getNumeroIngressosVendidos() {
        return numeroIngressosVendidos;
    }

    public void setNumeroIngressosVendidos(int numeroIngressosVendidos) {
        int oldNumeroIngressosVendidos = this.numeroIngressosVendidos;
        this.numeroIngressosVendidos = numeroIngressosVendidos;
        propertyChangeSupport.firePropertyChange(PROP_NUMEROINGRESSOSVENDIDOS, oldNumeroIngressosVendidos, numeroIngressosVendidos);
    }

}
