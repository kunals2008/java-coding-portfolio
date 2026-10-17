// Kunal: This class handles disabling a user.
public class DisableIdentity_Kunal {
	
    public void disable(IAMService_Kunal iam, String username) 
	{
        // Kunal: Keep thee user in the system but mark them disabled.
   iam.setUserActive(username, false);
    }
}
