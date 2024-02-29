package endpoints;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import payloads.Order;

public class StoreEndpoints {

	public static Response placeAnOrderForPet(Order payload) {

		return given().accept(ContentType.JSON).contentType(ContentType.JSON).body(payload)

				.when().post(StoreRoutes.place_order_url);

	}

	public static Response deletePurchaseOrderByID(long orderId) {

		return given().pathParam("orderId", orderId).when().delete(StoreRoutes.delete_purchase_order_id_url);
	}

	public static Response findPurchaseOrderByID(long orderId) {

		return given().pathParam("orderId", orderId).when().get(StoreRoutes.find_purchase_order_id_url);
	}

	public static Response getPetInventoriesByStatus() {

		return given().when().get(StoreRoutes.get_pet_inventories_by_status_url);
	}

}
