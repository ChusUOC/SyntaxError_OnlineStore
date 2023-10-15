package OnlineStore.controlador;

import OnlineStore.modelo.modelo;
import OnlineStore.vista.vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controlador implements ActionListener{

    private vista Vista;
    private modelo Modelo;

    public controlador(vista Vista, modelo modelo){
        this.Vista = Vista;
        this.Modelo = modelo;
        iniciar();
    }

    void iniciar(){


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
