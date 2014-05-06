package es.unileon.aplicacionesweb.springapp.validator;

import java.beans.PropertyEditorSupport;

import es.unileon.aplicacionesweb.springapp.logic.handler.TransactionType;

/**
 * A editor which allows the translation between {@link String} and {@link Enum}
 * 
 * @author Ke CAI
 * src: http://www.ke-cai.net/2010/01/data-binding-with-enum-type-in-spring.html
 */
@SuppressWarnings("unchecked")
public class EnumEditor extends PropertyEditorSupport {
	
	private Class clazz;
 
 	public EnumEditor(Class clazz) {
	 this.clazz = clazz;
 	};
 
 	public String getAsText() {
 		return (getValue() == null ? "" : ((Enum)getValue()).name());
 	}
 
 	public void setAsText(String text) throws IllegalArgumentException {
 		setValue(Enum.valueOf(clazz, text));
 	}
}