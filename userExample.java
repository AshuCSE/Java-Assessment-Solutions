
@Path(“/”)
@PermitAll
public class userExample {
@DELETE
@Path(“users”)
@Produces(“text/plain”)
@RolesAllowed({“Admin”, “Manager”})
public String deleteAllUsers() {
return userService.deleteAllUsers();
}
@GET
@Path(“users”)
@Produces(“text/plain”)
public String getAllUsers() {
return userService.getAllUsers();
}
}