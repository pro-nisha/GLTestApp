package PageObjectModel;

import com.automation.steps.TestSteps;

import java.util.HashMap;
import java.util.Map;

public class BasePageObject extends TestSteps {

    Map<String, String> mapObj = new HashMap<>();

    public  void  init() {
        mapObj.put("","They are about triplets");

    }



}
