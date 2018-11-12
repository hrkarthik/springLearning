package hello;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import org.bson.Document;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MongoController {
	
	@RequestMapping(value = "/getAllGoals", method = RequestMethod.GET)
	public String getAllGoals() {
		MongoDatabase database = Application.mongo.getDatabase("goal");
		MongoCollection<Document> collection = database.getCollection("goals");
		FindIterable<Document> result = collection.find();		
		return result.toString();
	}
}
