package ci.gouv.dgbf.system.user.server.persistence.impl.account;

import java.io.Serializable;

import javax.inject.Singleton;

import org.cyk.utility.server.persistence.jpa.AbstractPersistenceEntityImpl;

import ci.gouv.dgbf.system.user.server.persistence.api.account.RolePersistence;
import ci.gouv.dgbf.system.user.server.persistence.entities.account.Role;

@Singleton
public class RolePersistenceImpl extends AbstractPersistenceEntityImpl<Role> implements RolePersistence,Serializable {
	private static final long serialVersionUID = 1L;

}
