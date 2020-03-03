package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;

import beans.User;

@ManagedBean
@SessionScoped
public class FormController {
	
	public String onSubmit() {
		
		// get the user values from the input form 
		FacesContext context = FacesContext.getCurrentInstance();
		User user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);

		// puts the user object into a POST request
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		
		// shows the next page
		return "TestResponse.xhtml";
	}
	
	public String onFlash(User user) {
		// get the user values from the input form 
		Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
		
		//User user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);

		flash.put("#{user.firstName}", user);
		flash.put("#{user.lastName}", user);
		
		// puts the user object into a POST request		
		FacesContext.getCurrentInstance().getExternalContext().getFlash().put("user", user);

		return "TestResponse2.xhtml?faces-redirect=true";
		
	}

}
