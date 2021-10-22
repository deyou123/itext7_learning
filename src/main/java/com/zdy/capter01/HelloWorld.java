package com.zdy.capter01;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PipedWriter;

/**
 * @author deyou
 * @version 1.0
 * @date 2021/10/22 10:36
 */

public class HelloWorld {
    private static final String DEST = "D:/test/创建第一个.pdf";
    public static void main(String[] args) {

        try {
            PdfWriter pdfWriter = null;
            pdfWriter = new PdfWriter(DEST);
            PdfDocument pdfDocument = new PdfDocument(pdfWriter);
            Document document = new Document(pdfDocument);
            document.add(new Paragraph("add Something!"));
            document.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
