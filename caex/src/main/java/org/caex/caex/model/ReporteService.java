package org.caex.caex.model;

import java.io.*;
import java.util.List;

import com.lowagie.text.*;
import com.lowagie.text.pdf.*;

public class ReporteService {

 public void generarPDF(List<Actividad> actividades, String rutaArchivo) throws Exception {
     Document documento = new Document();
     PdfWriter.getInstance(documento, new FileOutputStream(rutaArchivo));
     documento.open();
     documento.add(new Paragraph("REPORTE DE ACTIVIDADES"));

     for (Actividad act : actividades) {
         documento.add(new Paragraph(
             act.getTitulo() + " - " + act.getDescripcion() + " - Prioridad: " + act.getPrioridad()
         ));
     }

     documento.close();
 }
}
