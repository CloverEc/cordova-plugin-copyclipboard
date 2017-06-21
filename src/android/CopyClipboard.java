package plugin.copyclipboard;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class CopyClipboard extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {
      if (action.equals("coolMethod")) {
        String name = data.getString(0);
        String message = "Hello, World !!! " + "Hello, " + name;
        callbackContext.success(message);
        return true;
      } else {
        return false;
      }
    }
}
