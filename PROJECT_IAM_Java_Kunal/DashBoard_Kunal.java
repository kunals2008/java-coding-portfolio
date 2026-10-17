// Kunal : 
//This is the starting point of my IAM project.
// The menu lets me test each user and role operation.

import java.util.Scanner;


public class DashBoard_Kunal
 {
		public static void main(String[] args) 
	{
        Scanner input = new Scanner(System.in);
        IAMService_Kunal iam = new IAMService_Kunal();
        // Each user action has its own class now.
        UpdateIdentity_Kunal updater = new UpdateIdentity_Kunal();
        DisableIdentity_Kunal disabler = new DisableIdentity_Kunal();
		
        DeleteIdentity_Kunal deleter = new DeleteIdentity_Kunal();

        while (true) {
            System.out.println("\n==************ = Identity and Access Management == ******=");
			
            System.out.println("1.Create user");
             System.out.println("2.Create role");
            System.out.println("3.Add entitlement to role");
			
            System.out.println("4. Assign role to user");
            System.out.println("5. Revoke role from user");
             System.out.println("6. Disable user");
			
			
            System.out.println("7. Enable user");
			
             System.out.println("8. List users");
			
            System.out.println("9. View user access");
            System.out.println("10.  Update user email");
            System.out.println("11. Delete user");
			
            System.out.println("0.  Exit");
            System.out.print("Choose an option: ");

            String choice = input.nextLine().trim();
            String username;
            String role;
            switch (choice) 
			{
                case "1":
						System.out.print("Username: ");
						 username = input.nextLine().trim();
						  System.out.print("Email: ");
					iam.createUser(username, input.nextLine().trim());
						break;
                case "2":
                    System.out.print("Role_Kunal name: ");
                    
					iam.createRole(input.nextLine().trim());
                    break;
                case "3":
                    System.out.print("Role_Kunal name: ");
                    
					role = input.nextLine().trim();
                    System.out.print("Entitlement: ");
                    iam.addEntitlement(role, input.nextLine().trim());
                    break;
                case "4":
                case "5":
						System.out.print("Username: ");
						username = input.nextLine().trim();
                    System.out.print("Role_Kunal name: ");
                    role = input.nextLine().trim();
                    if (choice.equals("4")) iam.assignRole(username, role);
                    else iam.revokeRole(username, role);
                    break;
                case "6":
                case "7":
                    System.out.print("Username: ");
                    username = input.nextLine().trim();
						if (choice.equals("6")) 
							disabler.disable(iam, username);
						else
						iam.setUserActive(username, true);
                    break;
                case "8":
                    iam.listUsers();
                    break;
                case "9":
                    System.out.print("Username: ");
						iam.showAccess(input.nextLine().trim());
                    break;
                case "10":
                     System.out.print("Username to update: ");
                    username = input.nextLine().trim();
                     System.out.print("New email: ");
                    updater.update(iam, username, input.nextLine().trim());
                    break;
                case "11":
                    System.out.print("Username to delete: ");
					
                    username = input.nextLine().trim();
                    System.out.print("Type YES to confirm deletion: ");
                    if (input.nextLine().trim().equals("YES"))
						{
                        deleter.delete(iam, username);
                    } 
					else 
					{
                        System.out.println("Deletion cancelled.");
                    }
                    break;
                case "0":
                    input.close();
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
 

	}
}
