// A role is a group of permissions (entitlements).

import java.util.HashSet;
import java.util.Set;

public class Role_Kunal {
    private final String name;
    private final Set<String> entitlements = new HashSet<>();

    public Role_Kunal(String name) 
	{ 
	this.name = name; 
	}
    public String getName() 
	{ return name; 
	
	}
    public void addEntitlement(String entitlement) 
	{ 
	entitlements.add(entitlement); 
	}
    public Set<String> getEntitlements() 
	{ 
	return new HashSet<>(entitlements); 
	}
	
}
