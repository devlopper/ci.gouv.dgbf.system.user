package ci.gouv.dgbf.system.user.server.representation.impl.account;

import java.io.Serializable;

import javax.inject.Singleton;

import org.cyk.utility.server.representation.AbstractRepresentationEntityImpl;

import ci.gouv.dgbf.system.user.server.business.api.account.RoleBusiness;
import ci.gouv.dgbf.system.user.server.persistence.entities.account.Role;
import ci.gouv.dgbf.system.user.server.representation.api.account.RoleRepresentation;
import ci.gouv.dgbf.system.user.server.representation.entities.account.RoleDto;
import ci.gouv.dgbf.system.user.server.representation.entities.account.RoleDtoCollection;

@Singleton
public class RoleRepresentationImpl extends AbstractRepresentationEntityImpl<Role,RoleBusiness,RoleDto,RoleDtoCollection> implements RoleRepresentation,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public Class<Role> getPersistenceEntityClass() {
		return Role.class;
	}
	
}
