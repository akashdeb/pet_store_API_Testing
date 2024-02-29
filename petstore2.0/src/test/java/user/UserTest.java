package user;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import endpoints.UserEndpoints;
import io.restassured.response.Response;
import payloads.CreateArrayOfUsers;
import payloads.CreateUser;
import utils.BaseClass;
@Listeners(utils.ListenersImplementation.class)

public class UserTest extends BaseClass{

	@Test(priority = 12)
	public void createUserTest() {
		Response response = UserEndpoints.createUser(createUser);
		response.then().statusCode(200)
		.log().all();
		System.out.println("================User added==================");

	}
	
	@Test(priority = 13)
	public void loginUserTest() {
		Response response = UserEndpoints.loginUser(createUser.getUsername(), createUser.getPassword());
		
		response.then().statusCode(200)
		.log().all();
		System.out.println("================User Logged in==================");

	}
	
	
	@Test(priority = 14)
	public void createArrayOfUsersTest() {
		Response response = UserEndpoints.createArrayOfUsers(list);
		response.then().statusCode(200)
		.log().all();
		System.out.println("================User array added==================");

	}
	
	@Test(priority = 15)
	public void createListOfUsersTest() {
		Response response = UserEndpoints.createListOfUsers(list);
		response.then().statusCode(200)
		.log().all();
		System.out.println("================Users List added==================");

	}
	
	@Test(priority = 16)
	public void readUserTest() {
		
		Response response = UserEndpoints.readUser(createUser.getUsername());
		
		response.then().statusCode(200)
		.log().all();
		System.out.println("================Users read==================");

	}
	
	@Test(priority = 17)
	public void updateUserTest() {
		Response response= UserEndpoints.updateUser(createUser, createUser.getUsername());
		
		response.then().statusCode(200)
		.log().all();
		System.out.println("================User updated==================");

	}
	
	@Test(priority = 18)
	public void logoutUserTest() {
		Response response = UserEndpoints.logoutUser();
		
		response.then().statusCode(200)
		.log().all();
		System.out.println("================User logout==================");

	}
	
	@Test(priority = 19)
	public void deleteUserTest() {
		Response response = UserEndpoints.deleteUser(createUser.getUsername());
		
		response.then().statusCode(200)
		.log().all();
		System.out.println("================User deleted==================");

	}
	
	
	


}
