package interview.Collections;

import java.util.HashMap;
import java.util.Map;

public class HashCodePrac {

    public static void main(String[] args) {
        
        Map<User,User> userHashMap = new HashMap<User,User>();

        User user1 = new User(1L,"teja","Reddy");
        User user2 = new User(3L,"Vinod","Reddy");
        User user3 = new User(4L,"paravthi","Devo");

        userHashMap.put(user1, user1);
        userHashMap.put(user2, user2);
        userHashMap.put(user3, user3);

    }
    
}
