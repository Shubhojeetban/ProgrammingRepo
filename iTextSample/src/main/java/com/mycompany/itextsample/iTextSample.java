/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.itextsample;

import com.itextpdf.kernel.pdf;
/**
 *
 * @author ACER
 */
public class iTextSample {
    public static void main(String[] args){
        String path = "D:/Java Projects/sample.pdf";
        PdfWriter writer = new PdfWriter(path);
    }
}
