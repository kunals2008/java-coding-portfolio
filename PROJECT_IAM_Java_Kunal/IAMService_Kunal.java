//Kunal: This class contains the main IAM operations.
//Kunal: HashMaps store users and roles while the program is running.

import java.util.HashMap;
import java.util.Map;

public class IAMService_Kunal
 {
    private final Map<String, Identity_Kunal> users = new HashMap<>();
    private final Map<String, Role_Kunal> roles = new HashMap<>();

    // Kunal: Separate action classes use this method to find a user.
public Identity_Kunal findUser(String username) 
{
	return users.get(username);
}

    // Kunal: First check if the user already exists before creating one.
    public void createUser(String username, String email) 
	{
        if (username.isEmpty() || email.isEmpty())
			{
            System.out.println("Username and email are required.");
			} else if (users.containsKey(username))
				{
            System.out.println("User already exists.");
        } else 
	{
		
		
		users.put(username, new Identity_Kunal(username, email));
		System.out.println("User created: " + username);
	}
    }

    // Kunal: The update class calls this method to change an email.
    public void updateUser(String username, String newEmail)
	{
        Identity_Kunal user = users.get(username);
        if (user == null) 
		{
            
			
			System.out.println("User not found.");
        } else if (newEmail.isEmpty()) 
		{
            System.out.println("Email cannot be empty.");
        } else 
		{
            user.setEmail(newEmail);
            System.out.println("User updated successfully.");
        }
    }

    // Kunal: Removing a user also removes their role assignments from memory.
    public void deleteUser(String username) 
	{
        if (users.remove(username) == null) 
		{
            System.out.println("User not found.");
        } 
		else 
		{
        System.out.println("User deleted successfully.");
        }
    }

    public void createRole(String name)
	{
        if (name.isEmpty()) 
		{
            System.out.println("Role_Kunal name is required.");
        } else if (roles.containsKey(name)) 
			{
				System.out.println("Role_Kunal already exists.");
        } else 
		{
				roles.put(name, new Role_Kunal(name));
            System.out.println("Role_Kunal created: " + name);
        }
    }

    public void addEntitlement(String roleName, String entitlement)
	{
        Role_Kunal role = roles.get(roleName);
        if (role == null || entitlement.isEmpty()) 
		{
				System.out.println("Role_Kunal not found or entitlement is empty.");
            return;
        }
        role.addEntitlement(entitlement);
        System.out.println("Entitlement added to role.");
    }

    // Kunal: Disabled users should not receive new roles.
    public void assignRole(String username, String roleName)
	{
        Identity_Kunal user = users.get(username);
        if (user == null || !roles.containsKey(roleName))
			{
            System.out.println("User or role not found.");
        } 
		else if (!user.isActive()) 
		{
				System.out.println("Cannot assign a role to a disabled user.");
        } 
		else 
		{
				user.addRole(roleName);
            System.out.println("Role_Kunal assigned.");
        }
    }

    public void revokeRole(String username, String roleName) 
	{
        Identity_Kunal user = users.get(username);
        if (user == null)
			{
            System.out.println("User not found.");
        }
	else if (!user.getRoles().contains(roleName))
		{
		System.out.println("User does not have this role.");
	}
		else
			{
            user.removeRole(roleName);
            System.out.println("Role_Kunal revoked.");
        }
    }

    // Kunal: Disabling keeps the user record so I can enable it again.
    public void setUserActive(String username, boolean active) 
	{
        Identity_Kunal user = users.get(username);
        if (user == null)
			{
            System.out.println("User not found.");
			} else 
		{
            user.setActive(active);
            System.out.println(active ? "User enabled." : "User disabled.");
        }
    }

    public void listUsers() 
	{
        if (users.isEmpty())
			{
            System.out.println("No users found.");
            return;
        }
			for (Identity_Kunal user : users.values()) 
		{
            System.out.println(user.getUsername() + " | " + user.getEmail()
                    + " | " + (user.isActive() ? "Active" : "Disabled")
                    + " | Roles: " + user.getRoles());
        }
    }

    public void showAccess(String username) {
        Identity_Kunal user = users.get(username);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }
        System.out.println("User: " + username + " (" + (user.isActive() ? "Active" : "Disabled") + ")");
        for (String roleName : user.getRoles()) 
	{
		Role_Kunal role = roles.get(roleName);
		if (role != null) {
			System.out.println("Role_Kunal: " + roleName + " | Entitlements: " + role.getEntitlements());
		}
	}
        if (!user.isActive())
			{
            System.out.println("Note: disabled users retain role records in this demo.");
        }
		}
}
