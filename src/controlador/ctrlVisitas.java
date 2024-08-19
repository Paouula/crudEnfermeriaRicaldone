package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modelo.Visitas;
import vista.frmVisitas;


//3.Heredar de la clase que detecta las acciones
public class ctrlVisitas implements MouseListener{
    
    //1.Mandar a llamar a las otras capas (modelo y vistas)
    private Visitas modelo;
    private frmVisitas vista;
    
    //2.Crear el constructor 
    public ctrlVisitas(Visitas modelo, frmVisitas vista){
        this.modelo = modelo;
        this.vista = vista;
        
        vista.btnAgregar.addMouseListener(this);
        modelo.Mostrar(vista.jtbPaciente);
}

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if(e.getSource() == vista.btnAgregar){
            modelo.setNombre(vista.txtNombre.getText());
            modelo.setEdad(Integer.parseInt(vista.txtEdad.getText()));
            modelo.setEspecialidad(vista.txtEspecialidad.getText());
            
            modelo.Guardar();
            modelo.Mostrar(vista.jtbPaciente);
        }
        
    }
    
    
    

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
