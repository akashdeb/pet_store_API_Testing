package endpoints;

public class PetsRoutes {
	
	public static String base_url = "https://petstore.swagger.io/v2";

	public static String add_pet_url = base_url+"/pet";
	public static String upload_pet_image_url = base_url+"/pet/{petId}/uploadImage";
	public static String update_pet_url = base_url+"/pet";
	public static String find_pet_by_id_url = base_url+"/pet/{petId}";
	public static String find_pet_by_status_url = base_url+"/pet/findByStatus";
	public static String update_pet_by_formData_url = base_url+"/pet/{petId}";
	public static String delete_pet_by_id_url = base_url+"/pet/{petId}";

	
}
