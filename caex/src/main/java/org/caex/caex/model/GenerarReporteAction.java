package org.caex.caex.model;

import java.util.*;

import javax.persistence.*;

import org.openxava.actions.*;

public class GenerarReporteAction extends ViewBaseAction {

    public void execute() throws Exception {
        EntityManager em = (EntityManager) getManager();
        List<Actividad> actividades = em.createQuery("from Actividad").getResultList();

        ReporteService reporte = new ReporteService();
        reporte.generarPDF(actividades, "/tmp/actividades.pdf");

        addMessage("Reporte generado en /tmp/actividades.pdf");
    }
}
