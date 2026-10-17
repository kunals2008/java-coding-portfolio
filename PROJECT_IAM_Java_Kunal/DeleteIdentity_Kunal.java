// Kunal : This  class handles deleting a user from the project.
public class DeleteIdentity_Kunal {
    public void delete(IAMService_Kunal iam, String username)
	{
        // Kunal: The service removes the user from    the HashMap.
		
        iam.deleteUser(username);
    }
}
