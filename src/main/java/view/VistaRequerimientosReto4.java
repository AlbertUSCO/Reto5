package view;

import controller.ControladorRequerimientosReto4;
import model.vo.LiderCiudad;
import model.vo.SumaProveedor;
import model.vo.ProyectoCiudad;

import java.sql.SQLException;
import java.util.ArrayList;

public class VistaRequerimientosReto4 {

        public static ControladorRequerimientosReto4 controlador = new ControladorRequerimientosReto4();

    public static void requerimiento1() {
        try{
            ArrayList<ProyectoCiudad> rankingProyectoCiudad=controlador.consultarProyectoCiudad();
            System.out.println("-----Proyecto Ciudad-------");
            System.out.println("Constructora Fecha_Inicio Clasificación");
            for(ProyectoCiudad proyectoCiudad: rankingProyectoCiudad){
                System.out.printf("%s %s %s %n",proyectoCiudad.getConstructora(),proyectoCiudad.getFechaInicio(),proyectoCiudad.getClasificacion());
            }
     }catch(SQLException e){
         System.out.println(e);
    }

    }

    public static void requerimiento3() {
        System.out.println("-----Suma Cantidades-------");
        try {
            ArrayList<SumaProveedor> rankingSumaProveedor = controlador.consultarSumaProveedor();
            // Encabezado del resultado
            System.out.println("Suma Cantidades");
            // Cada VO cargado, mostrarlo en la vista
            for (SumaProveedor suma : rankingSumaProveedor) {
                System.out.printf("%s %n", suma.getCantidad());
            }
        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }
    public static void requerimiento4() {
        System.out.println("-----Líder Ciudad-------");
        try {
            ArrayList<LiderCiudad> rankingLiderCiudad = controlador.consultarLiderCiudad();
            // Encabezado del resultado
            System.out.println("Nombre Líder");      
            for (LiderCiudad lider : rankingLiderCiudad) {
                System.out.printf("%s %n", lider.getNombreLider());
            }
        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

    
}

