package wcom.in28minutes;
public class UserValidationService {
	public boolean isUserValid(String name,String password) {
		if(name == null || password == null) {
			return false;
		}
		if(name.equals("in28Minutes") && password.equals("dummy")) {
			return true;
		}
		return false;
	}
}
