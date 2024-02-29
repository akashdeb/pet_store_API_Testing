package store;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import endpoints.StoreEndpoints;
import io.restassured.response.Response;
import utils.BaseClass;
@Listeners(utils.ListenersImplementation.class)

public class StoreTest extends BaseClass {

	@Test(priority = 8)
	public void placeOrderTest() {

		Response response = StoreEndpoints.placeAnOrderForPet(order);

		response.then().statusCode(200).log().all();
		System.out.println("================Order placed==================");


	}
	
	@Test(priority = 9)
	public void findPurchaseOrderTest() {
		
		Response response = StoreEndpoints.findPurchaseOrderByID(order.getPetId());
		
		response.then().statusCode(200).log().all();
		System.out.println("================Purchase order found==================");

		
	}
	
	@Test(priority = 10)
	public void readPetInventoriesTest() {
		
		Response response = StoreEndpoints.getPetInventoriesByStatus();
		
		response.then().statusCode(200).log().all();
		System.out.println("================Pets Inventories Read==================");

	}
	
	@Test(priority = 11)
	public void deletePurchaseOrderTest() {
		
		Response response = StoreEndpoints.deletePurchaseOrderByID(order.getPetId());
		
		response.then().statusCode(200).log().all();
		System.out.println("================Purchase order deleted==================");

		
	}
	
	

}
