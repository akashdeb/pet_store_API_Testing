package endpoints;

import static io.restassured.RestAssured.given;

import java.util.List;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import payloads.CreateUser;
import routes.UserRoutes;

public class UserEndpoints {

	public static Response createUser(CreateUser payload) {

		return given().contentType(ContentType.JSON).accept(ContentType.JSON).body(payload).when()
				.post(UserRoutes.post_url);

	}

	public static Response readUser(String username) {
		return given().pathParam("username", username).when().get(UserRoutes.get_url);

	}

	public static Response updateUser(CreateUser payload, String username) {

		return given().contentType(ContentType.JSON).accept(ContentType.JSON).pathParam("username", username)
				.body(payload).when().put(UserRoutes.update_url);

	}

	public static Response deleteUser(String username) {
		return given().pathParam("username", username).when().delete(UserRoutes.get_url);

	}

	public static Response createArrayOfUsers(List list) {

		return given().contentType(ContentType.JSON).accept(ContentType.JSON).body(list)

				.when().post(UserRoutes.post_url_array_of_Users);

	}

	public static Response createListOfUsers(List list) {

		return given().contentType(ContentType.JSON).accept(ContentType.JSON).body(list)

				.when().post(UserRoutes.post_url_array_of_Users);

	}

	public static Response loginUser(String username, String password) {
		return given().auth().basic(username, password)

				.when().get(UserRoutes.login_user_url);

	}

	public static Response logoutUser() {
		return given().when().get(UserRoutes.logout_user_url);

	}

}
