package ci.gouv.dgbf.system.user.server.representation.impl.unit;

import javax.ws.rs.core.UriBuilder;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.junit.Test;

import ci.gouv.dgbf.system.user.server.representation.api.account.RoleRepresentation;

public class GetProxy {

	//@Test
	public void getRep() {
		ResteasyClient client = new ResteasyClientBuilder().build();
		ResteasyWebTarget target = client.target(UriBuilder.fromUri("http://localhost:8081/"));
		Object proxy = target.proxy(RoleRepresentation.class);
		System.out.println("GetProxy.getRep() : "+proxy);
	}
	
	@Test
	public void getFromLocalWildflyUserServer() {
		ResteasyClient client = new ResteasyClientBuilder().build();
		ResteasyWebTarget target = client.target(UriBuilder.fromUri("http://localhost:8080/user/server"));
		Object proxy = target.proxy(RoleRepresentation.class);
		System.out.println("GetProxy.getFromLocalWildflyUserServer() : "+proxy);
	}
	
}
