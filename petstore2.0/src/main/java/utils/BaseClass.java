package utils;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.github.javafaker.Faker;

import payloads.Category;
import payloads.CreateArrayOfUsers;
import payloads.CreateUser;
import payloads.Order;
import payloads.Pets;
import payloads.Tag;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;

public class BaseClass {
	public CreateUser createUser;
	public CreateArrayOfUsers createArrayOfUsers;
	public List list;
	public Faker fake;
	public Category category;
	public Tag tag;
	public Pets pets;
	public Order order;
	
	@BeforeSuite
	public void bs() {
		baseURI="https://petstore.swagger.io/v2/";
		
	}
	
	@BeforeClass
	public void bc() {
		fake = new Faker();
		category = new Category(fake.idNumber().hashCode(), fake.name().firstName());
		tag = new Tag(fake.idNumber().hashCode(), fake.name().firstName());
		order = new Order(fake.idNumber().hashCode(), fake.idNumber().hashCode(), 5, fake.date().birthday(),
				"placed", true);
		List<String> listURL = new ArrayList();
		List<Tag> listTag = new ArrayList();

		listURL.add(
				"https://www.google.com/search?q=dog+photo&oq=dog+pho&gs_lcrp=EgZjaHJvbWUqCggAEAAYsQMYgAQyCggAEAAYsQMYgAQyBggBEEUYOTIHCAIQABiABDIHCAMQABiABDIHCAQQABiABDIHCAUQABiABDIHCAYQABiABDIKCAcQABixAxiABDIHCAgQABiABDIHCAkQABiABNIBCDU3OTVqMGo3qAIAsAIA&sourceid=chrome&ie=UTF-8#vhid=hluxPG6aiVLRrM&vssid=l");
		listTag.add(tag);
		pets = new Pets(fake.idNumber().hashCode(), category, fake.name().firstName(), listURL, listTag, "available");
	
		createUser=new CreateUser(fake.idNumber().hashCode(), fake.name().username(), fake.name().firstName(), fake.name().lastName(), fake.internet().emailAddress(), fake.internet().password(), fake.phoneNumber().cellPhone(), 0);
		list=new ArrayList<CreateUser>();
		list.add(createUser);
	}

}
