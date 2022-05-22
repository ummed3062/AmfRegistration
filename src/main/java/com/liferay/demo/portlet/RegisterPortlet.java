package com.liferay.demo.portlet;

import com.liferay.demo.constants.RegisterPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author Lenovo
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Register",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + RegisterPortletKeys.REGISTER,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class RegisterPortlet extends MVCPortlet {
	
	public void doView(javax.portlet.RenderRequest renderRequest, 
			javax.portlet.RenderResponse renderResponse) 
					throws java.io.IOException ,javax.portlet.PortletException {
		
		System.out.print("RegisterPortlet.doView()-->");
		super.doView(renderRequest, renderResponse);
	};
}