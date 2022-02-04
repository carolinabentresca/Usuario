package com.myapp.struts.action;

import com.myapp.struts.form.UsuarioForm;
import com.myapp.struts.modelo.UsuarioDao;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LoginAction extends org.apache.struts.action.Action {

    private static final String SUCCESS = "success";
    private static final String ERRORS = "errors";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        ActionForward forward = new ActionForward();
        UsuarioForm user = (UsuarioForm) form;
        UsuarioDao dao = new UsuarioDao();
        user = dao.validar(user);
        if (user != null) {
            forward = mapping.findForward(SUCCESS);
        } else {
            forward = mapping.findForward(ERRORS);
        }
        return forward;
    }
}
