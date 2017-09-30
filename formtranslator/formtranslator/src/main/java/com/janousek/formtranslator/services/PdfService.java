package com.janousek.formtranslator.services;

import java.io.IOException;

import org.apache.pdfbox.exceptions.COSVisitorException;
import org.apache.pdfbox.pdmodel.PDDocument;

import com.janousek.formtranslator.entity.I485Form;

public interface PdfService {

	public PDDocument fillI485Form(I485Form form) throws IOException,
			COSVisitorException;

}
