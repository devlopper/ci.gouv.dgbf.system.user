package ci.gouv.dgbf.system.user.server.representation.api.account;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.cyk.utility.server.representation.RepresentationEntity;

import ci.gouv.dgbf.system.user.server.persistence.entities.account.Role;
import ci.gouv.dgbf.system.user.server.representation.entities.account.RoleDto;
import ci.gouv.dgbf.system.user.server.representation.entities.account.RoleDtoCollection;

@Path(RoleRepresentation.PATH)
public interface RoleRepresentation extends RepresentationEntity<Role,RoleDto,RoleDtoCollection> {
	
	String PATH = "/role";
	
	/* Create */
	@POST
	@Path(PATH_CREATE_ONE)
	@Consumes(MediaType.APPLICATION_XML)
	Response createOne(RoleDto entity);
	
	@POST
	@Path(PATH_CREATE_MANY)
	@Consumes(MediaType.APPLICATION_XML)
	Response createMany(Collection<RoleDto> entities);
	
	@POST
	@Path(PATH_CREATE_MANY_COLLECTION)
	@Consumes(MediaType.APPLICATION_XML)
	Response createMany(RoleDtoCollection entityCollection);
	
	/* Read */ 
	@GET
	@Path(PATH_GET_MANY)
	@Produces({ MediaType.APPLICATION_XML })
	Response getMany();
	
	@GET
	@Path(PATH_GET_ONE)
	@Produces({ MediaType.APPLICATION_XML })
	Response getOne(@PathParam(PARAMETER_IDENTIFIER) String identifier,@QueryParam(PARAMETER_TYPE) String type);
	
	/* Update */
	/* Using partial */
	@POST
	@Path(PATH_UPDATE_ONE)
	@Consumes(MediaType.APPLICATION_XML)
	Response updateOne(RoleDto entity,@QueryParam(PARAMETER_FIELDS) String fields);
	
	@POST
	@Path(PATH_UPDATE_MANY)
	@Consumes(MediaType.APPLICATION_XML)
	Response updateMany(Collection<RoleDto> entities,@QueryParam(PARAMETER_FIELDS) String fields);
	
	/* Delete */
	@DELETE
	@Path(PATH_DELETE_ONE)
	@Produces(MediaType.APPLICATION_XML)
	Response deleteOne(@PathParam(PARAMETER_IDENTIFIER) String identifier,@QueryParam(PARAMETER_TYPE) String type);
	
	@DELETE
	@Path(PATH_DELETE_MANY)
	@Produces(MediaType.APPLICATION_XML)
	Response deleteMany();
	
	@DELETE
	@Path(PATH_DELETE_ALL)
	@Produces(MediaType.APPLICATION_XML)
	Response deleteAll();
	
	/* Count */
	@GET
	@Path(PATH_GET_COUNT)
	@Produces(MediaType.TEXT_PLAIN)
	Response count();
}
