package user;

import org.apache.logging.log4j.core.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import endpoints.UserEndpoints;
import io.restassured.response.Response;
import utils.BaseClass;
@Listeners(utils.ListenersImplementation.class)

public class UserTest extends BaseClass{

	@Test(priority = 12)
	public void createUserTest() {
		Response response = UserEndpoints.createUser(createUser);
		response.then().statusCode(200)
		.log().all();
		logger.info("================User added==================");
		System.out.println("================User added==================");

	}
	
	@Test(priority = 13)
	public void loginUserTest() {
		Response response = UserEndpoints.loginUser(createUser.getUsername(), createUser.getPassword());
		
		response.then().statusCode(200)
		.log().all();
		logger.info("================User Logged in==================");
		System.out.println("================User Logged in==================");

	}
	
	
	@Test(priority = 14)
	public void createArrayOfUsersTest() {
		Response response = UserEndpoints.createArrayOfUsers(list);
		response.then().statusCode(200)
		.log().all();
		logger.info("================User array added==================");
		System.out.println("================User array added==================");

	}
	
	@Test(priority = 15)
	public void createListOfUsersTest() {
		Response response = UserEndpoints.createListOfUsers(list);
		response.then().statusCode(200)
		.log().all();
		logger.info("================Users List added==================");
		System.out.println("================Users List added==================");

	}
	
	@Test(priority = 16)
	public void readUserTest() {
		
		Response response = UserEndpoints.readUser(createUser.getUsername());
		
		response.then().statusCode(200)
		.log().all();
		logger.info("================Users read==================");
		System.out.println("================Users read==================");

	}
	
	@Test(priority = 17)
	public void updateUserTest() {
		Response response= UserEndpoints.updateUser(createUser, createUser.getUsername());
		
		response.then().statusCode(200)
		.log().all();
		logger.info("================User updated==================");
		System.out.println("================User updated==================");

	}
	
	@Test(priority = 18)
	public void logoutUserTest() {
		Response response = UserEndpoints.logoutUser();
		
		response.then().statusCode(200)
		.log().all();
		logger.info("================User logout==================");
		System.out.println("================User logout==================");

	}
	
	@Test(priority = 19)
	public void deleteUserTest() {
		Response response = UserEndpoints.deleteUser(createUser.getUsername());
		
		response.then().statusCode(200)
		.log().all();
		logger.info("================User deleted==================");
		System.out.println("================User deleted==================");

	}
	
	
	


}
