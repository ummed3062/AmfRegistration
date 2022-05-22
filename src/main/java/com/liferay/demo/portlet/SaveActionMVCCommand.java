package com.liferay.demo.portlet;

import com.liferay.demo.constants.RegisterPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;


@Component(
		immediate = true,
		
		property = {
				"javax.portlet.name=" + RegisterPortletKeys.REGISTER,
				"mvc.command.name=saveUser"
		},
		service = MVCActionCommand.class

		)
public class SaveActionMVCCommand extends BaseMVCActionCommand{

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		
		String firstName = ParamUtil.get(actionRequest, "FirstName", "");
		String LastName = ParamUtil.get(actionRequest, "LastName", "");
		String EmailAddress = ParamUtil.get(actionRequest, "EmailAddress", "");
		String Username = ParamUtil.get(actionRequest, "Username", "");
		String Male = ParamUtil.get(actionRequest, "Male", "");
		int Birthday = ParamUtil.get(actionRequest, "Birthday", 0);
		String Password = ParamUtil.get(actionRequest, "Password", "");
		String ConfirmPassword = ParamUtil.get(actionRequest, "ConfirmPassword", "");

		System.out.print(firstName +", "+ LastName +", ");
		
		System.out.print("SaveActionMVCCommand.doProcessAction()");
		
	}

}
