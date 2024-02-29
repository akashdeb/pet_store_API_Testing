package routes;

public class UserRoutes {

	public static String base_url = "https://petstore.swagger.io/v2/";

	// user module
	public static String post_url = base_url + "user";
	public static String get_url = base_url + "user/{username}";
	public static String update_url = base_url + "user/{username}";
	public static String delete_url = base_url + "user/{username}";
	public static String login_user_url = base_url + "user/login";
	public static String logout_user_url = base_url + "user/logout";

	//array of users
	public static String post_url_array_of_Users = base_url + "user/createWithArray";
	public static String post_url_list_of_Users = base_url + "/user/createWithList";


}
