package ci.gouv.dgbf.system.user.client.controller.entities.account;

import java.io.Serializable;

import org.cyk.utility.client.controller.data.AbstractFormDataImpl;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true)
public class RoleEditFormImpl extends AbstractFormDataImpl<Role> implements RoleEditForm,Serializable {
	private static final long serialVersionUID = 1L;
	
}
