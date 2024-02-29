package routes;



public class StoreRoutes {
	
	public static String base_url = "https://petstore.swagger.io/v2";

	public static String place_order_url = base_url+"/store/order";
	public static String find_purchase_order_id_url = base_url+"/store/order/{orderId}";
	public static String delete_purchase_order_id_url = base_url+"/store/order/{orderId}";
	public static String get_pet_inventories_by_status_url = base_url+"/store/inventory";

}
