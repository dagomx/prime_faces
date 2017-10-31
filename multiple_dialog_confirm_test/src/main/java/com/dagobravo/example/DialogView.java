package com.dagobravo.example;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import java.io.Serializable;
  
@ManagedBean
public class DialogView implements Serializable{
 
    public void showMessageA() {
        addMessage("Alert Message", "This is the message detail.");
    }
    
    public String showMessageB() {
        return "page2";
    }
     
    public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}