package payloads;

import java.util.List;

public class CreateArrayOfUsers {
	
	private List<CreateUser> arr;

	
	public CreateArrayOfUsers(List<CreateUser> arr) {
		super();
		this.arr = arr;
	}

	public List<CreateUser> getArr() {
		return arr;
	}

	public void setArr(List<CreateUser> arr) {
		this.arr = arr;
	}

	
	  @Override
	    public String toString() {
	        StringBuilder result = new StringBuilder("[");
	        
	        for (CreateUser user : arr) {
	            result.append(user.toString()).append(",");
	        }
	        
	        // Remove the trailing comma if there are elements
	        if (!arr.isEmpty()) {
	            result.deleteCharAt(result.length() - 1);
	        }
	        
	        result.append("]");
	        
	        return result.toString();
	    }
	
	
}
