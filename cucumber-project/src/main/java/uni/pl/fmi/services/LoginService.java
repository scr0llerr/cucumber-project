package uni.pl.fmi.services;

import java.util.ArrayList;
import java.util.List;

import uni.pl.fmi.User;

public class LoginService {

	public static String login(String username, String password, boolean emptyGarage) {
		
		if(emptyGarage == true) {
			return "Потребителят е с пълен гараж";
		}
		
		List<User> users = getUsers();
		final boolean isUserMatch = users.stream().anyMatch
				(user -> username.equals(user.getUsername()) && password.equals(user.getPassword())
						&& emptyGarage == user.getEmptyGarage());
		return isUserMatch ? "Потребителят е с пълен гараж" :
				"Потребителят има място в гаража или няма такъв";
	}
	
	private static List<User> getUsers(){
		User user = new User();
		user.setPassword("Pass123");
		user.setUsername("Ivan");
		user.setEmptyGarage(true);
		final List<User> result = new ArrayList<>();
		result.add(user);
		return result;
	}

}
