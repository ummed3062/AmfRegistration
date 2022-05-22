package com.liferay.demo.portlet;

import com.liferay.demo.constants.RegisterPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		
		property = {
				"javax.portlet.name=" + RegisterPortletKeys.REGISTER,
				"mvc.command.name=/create/form"
		}

		)

public class CreateFormRenderMVCCommand implements MVCRenderCommand{

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		
		System.out.print("CreateFormRenderMVCCommand class called -->");
		return "/form.jsp";
	}

}
