package pets;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import endpoints.PetEndpoints;
import io.restassured.response.Response;
import payloads.Category;
import payloads.Pets;
import payloads.Tag;
import utils.BaseClass;

@Listeners(utils.ListenersImplementation.class)
public class PetsTest extends BaseClass {
	
	@Test(priority = 1)
	public void addPetTest() {

		Response response = PetEndpoints.addAPet(pets);

		response.then().statusCode(200).log().all();
		System.out.println("================Pets added==================");

	}

	
	@Test(priority = 2)
	public void uploadPetImageTest() {
		PetEndpoints.uploadPetsImage(pets.getId(), "upload by : Akash", "./src/test/resources/data/731_java.jpg")
		.then().statusCode(200).log().all();
		System.out.println("================Pets image uploaded==================");

	}
	
	@Test(priority = 3)
	public void findPetByStatusTest() {

		PetEndpoints.findPetsByStatus().then().statusCode(200).log().all();
		System.out.println("================Pets found by status==================");

	}
	
	@Test(priority = 4)
	public void updatePetTest() {
		PetEndpoints.updateAPet(pets).then().statusCode(200).log().all();
		System.out.println("================Pets updated==================");

	}
	
	@Test(priority = 5)
	public void findPetByIdTest() {
		PetEndpoints.findPetsById(pets.getId()).then().statusCode(200).log().all();
		System.out.println("================Pets found by ID==================");

	}
	
	@Test(priority = 6)
	public void findPetWithFormDataTest() {
		pets.setName(fake.name().username());
		PetEndpoints.updatePetWithFormData(pets.getId(),pets.getName(), "sold").then().statusCode(200).log().all();
		System.out.println("================Pets found with formdata==================");

	}

	@Test(priority = 7)
	public void deletePetTest() {
		PetEndpoints.deleteAPet(pets.getId()).then().statusCode(200).log().all();
		System.out.println("================Pets deleted==================");

	}
}
