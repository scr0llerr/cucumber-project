package uni.pl.fmi.models;

import uni.pl.fmi.services.LoginService;

public class LoginPageModel {

	private String username;
	private String password;
	private String message;
	private boolean emptyGarage;

	public void navigatetoLoginScreen() {
		System.out.println("Навигирано е до страницата за вход в системата");
		
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public void setEmptyGarage(boolean emptyGarage) {
		this.emptyGarage = emptyGarage;
	}

	public void clickLoginButton() {
		message = LoginService.login(username, password, emptyGarage);
	}

	public String GetLoginMessage() {
		// TODO Auto-generated method stub
		return message;
	}

}
