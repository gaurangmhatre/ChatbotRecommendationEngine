import org.apache.mahout.cf.taste.recommender.ItemBasedRecommender;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@EnableAutoConfiguration
public class RecommendationClient {

    ItemBasedRecommendation itemBasedRecommender = null;
    static DBHelper dbhelper = new DBHelper();

    RecommendationClient() throws Exception {
        itemBasedRecommender= new ItemBasedRecommendation();
        itemBasedRecommender.setupProcess();
    }

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    // http://localhost:8090/getItemBasedRecommendations?userId=200&numberOfRecommendation=6
    @RequestMapping("/getItemBasedRecommendations")
    @ResponseBody
    ResponseEntity<Object> getItemBasedRecommendations(@RequestParam(value="userId", defaultValue="200") String userId, @RequestParam(value="numberOfRecommendation", defaultValue="5") String numberOfRecommendation )throws Exception{
       return itemBasedRecommender.getItemBasedRecommendations(userId,numberOfRecommendation);
    }

    // http://localhost:8090/updateUserData     body: {"userId": "200","itemId": "9","ratings": "5"}
    @RequestMapping(value = "/updateUserData", method = RequestMethod.POST)
    public ResponseEntity< String > persistPerson(@RequestBody UserItemModel user) throws Exception {
       return itemBasedRecommender.persistPerson(user);
    }


    public static void main(String[] args) {

        SpringApplication.run(RecommendationClient.class, args);

    }
}
