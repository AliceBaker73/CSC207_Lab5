package interface_adapter.clear_users;

import interface_adapter.ViewModel;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

// TODO Complete me


import java.beans.PropertyChangeListener;

public class ClearViewModel extends ViewModel{




    private ClearState state = new ClearState();
    public ClearViewModel() {super("clear"); }
    public void setState(ClearState state) { this.state = state;}
    private final PropertyChangeSupport support = new PropertyChangeSupport(this);

    public void firePropertyChanged() { support.firePropertyChange("change", null, this.state); }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public ClearState getState() {return state;}

}
