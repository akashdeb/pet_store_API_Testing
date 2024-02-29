package endpoints;

import static io.restassured.RestAssured.given;

import java.io.File;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import payloads.Pets;
import routes.PetsRoutes;

public class PetEndpoints {

	public static Response addAPet(Pets payload) {

		return given().accept(ContentType.JSON).contentType(ContentType.JSON).body(payload)

				.when().post(PetsRoutes.add_pet_url);
	}

	public static Response uploadPetsImage(long petId, String metaData, String filePath) {
		return given().pathParam("petId", petId).multiPart("additionalMetadata", metaData)
				.multiPart("file", new File(filePath))

				.when().post(PetsRoutes.upload_pet_image_url);
	}

	public static Response updateAPet(Pets payload) {

		return given().accept(ContentType.JSON).contentType(ContentType.JSON).body(payload)

				.when().put(PetsRoutes.update_pet_url);
	}

	public static Response findPetsByStatus() {
		return given().when().get(PetsRoutes.find_pet_by_status_url);
	}

	public static Response findPetsById(long petId) {
		return given().pathParam("petId", petId).when().get(PetsRoutes.find_pet_by_id_url);
	}

	public static Response updatePetWithFormData(long petId, String updatedName, String updatedStatus) {

		return given().pathParam("petId", petId).formParam("name", updatedName).formParam("status", updatedStatus)
				.when().post(PetsRoutes.update_pet_by_formData_url);
	}
	
	public static Response deleteAPet(long petId) {
		
		return given().pathParam("petId", petId).when().delete(PetsRoutes.delete_pet_by_id_url);
	}
}
