package com.janousek.formtranslator.services;

import java.io.IOException;
import java.io.InputStream;

import org.apache.pdfbox.exceptions.COSVisitorException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.springframework.stereotype.Service;

import com.janousek.formtranslator.entity.I485Form;
import com.janousek.formtranslator.pdf.PdfFill;

@Service
public class PdfServiceImpl extends PdfServiceBase implements PdfService {

	@Override
	public PDDocument fillI485Form(I485Form form) throws IOException,
			COSVisitorException {
		InputStream is = PdfFill.class
				.getResourceAsStream("/i-485.unlocked.pdf");
		PDDocument pdf = PDDocument.load(is);
		is.close();
		pdf.setAllSecurityToBeRemoved(true);
		PDDocumentCatalog docCatalog = pdf.getDocumentCatalog();
		PDAcroForm acroForm = docCatalog.getAcroForm();

		fillObjectToPdf(form.getPartOne(), acroForm);
		fillObjectToPdf(form.getPartTwo(), acroForm);
		fillObjectToPdf(form.getPartThree(), acroForm);

		for (int i = 0; i < form.getPartThree().getRelatives().size(); i++) {
			fillObjectToPdf(form.getPartThree().getRelatives().get(i),
					acroForm, i);
		}
		for (int i = 0; i < form.getPartThree().getMemberships().size(); i++) {
			fillObjectToPdf(form.getPartThree().getMemberships().get(i),
					acroForm, i);
		}

		fillObjectToPdf(form.getPartFour(), acroForm);

		// fillObjectToPdf(form.getPartFive(), acroForm);
		// fillObjectToPdf(form.getPartSix(), acroForm);

		return pdf;
	}

}
