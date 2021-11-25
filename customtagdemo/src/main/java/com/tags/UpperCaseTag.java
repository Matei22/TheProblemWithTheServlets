package com.tags;

import java.io.IOException;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class UpperCaseTag extends SimpleTagSupport{
	
	@Override
		public void doTag() throws JspException, IOException{
			JspWriter out = getJspContext().getOut();
			StringWriter sw = new StringWriter();
			getJspBody().invoke(sw);
			out.print("<b> " + sw.toString().toUpperCase() + "</b>");
			out.print("<h3> Current date is: " + new SimpleDateFormat("dd-mm--yyyy hh:mm:ss EEE").format(new Date()) + "</h3>");
		}
}
