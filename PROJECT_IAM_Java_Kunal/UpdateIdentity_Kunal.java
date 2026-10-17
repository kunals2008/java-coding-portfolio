//I made a separate class for updating a user's email.
public class UpdateIdentity_Kunal
 {
    public void update(IAMService_Kunal iam, String username, String email)
	{
        //The service checks if the user exists before updating.
        iam.updateUser(username, email);
    }
}
