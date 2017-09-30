package com.janousek.formtranslator.web.action;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.apache.pdfbox.exceptions.COSVisitorException;
import org.apache.pdfbox.pdmodel.PDDocument;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.StreamingResolution;
import net.sourceforge.stripes.action.UrlBinding;
import net.sourceforge.stripes.integration.spring.SpringBean;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.janousek.formtranslator.entity.I485Form;
import com.janousek.formtranslator.services.PdfServiceImpl;

@UrlBinding(value = "/i485.html")
public class I485FormAction extends BasicAction {

	@SpringBean
	private PdfServiceImpl pdfService;

	private I485Form form;

	@DefaultHandler
	public Resolution load() {
		form = new I485Form();
		getContext().getRequest().setAttribute("form", form);
		return new ForwardResolution("/i485Form.jsp");
	}

	public Resolution submit() throws COSVisitorException, IOException {
		PDDocument document = pdfService.fillI485Form(form);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		document.save(out);
		document.close();
		return new StreamingResolution("application/pdf",
				new ByteArrayInputStream(out.toByteArray()));
	}

	
	public Resolution getJsonForm() {
		Gson gson = new GsonBuilder().serializeNulls().create();
		String json = gson.toJson(getForm());
		return new StreamingResolution("application/json",json);
	}
	
	public I485Form getForm() {
		if(form == null){
			form = new I485Form();
		}
		return form;
	}

	public void setForm(I485Form form) {
		this.form = form;
	}

}
