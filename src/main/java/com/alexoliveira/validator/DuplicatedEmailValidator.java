package com.alexoliveira.validator;

import java.util.Arrays;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator
public class DuplicatedEmailValidator implements Validator {

	private List<String> emailsDB = Arrays.asList("alex@email.com", "sandro@email.com");

	@Override
	public void validate(FacesContext context, UIComponent component, Object o) throws ValidatorException {

		String email = (String) o;

		if (emailsDB.contains(email)) {
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "email já cadastrado!", "");
			throw new ValidatorException(message);
		}
	}

}
