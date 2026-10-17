// Kunal:I use this class to keep each user details andassigned roles.

import java.util.HashSet;
import java.util.Set;

public class Identity_Kunal {
    private final String username;
	
	
    private String email;
    private boolean active = true;
	
    private final Set<String> roles = new HashSet<>();

    public Identity_Kunal(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
		return username; 
		}
    public String getEmail() { 
	return email;
	}
    public void setEmail(String email) {
		this.email = email; 
		}
		
    public boolean isActive() { 
	return active; 
	}
    public void setActive(boolean active) { 
	this.active = active; 
	}
    public Set<String> getRoles() { 
	return new HashSet<>(roles); 
	}
    public void addRole(String roleName) {
		roles.add(roleName); 
		}
    public void removeRole(String roleName) {
		roles.remove(roleName);
		}
}
