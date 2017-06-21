package plugin.copy.clipboard;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class CopyClipboard extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {
      String name = data.getString(0);
      String message = "Hello, World !!! " + "Hello, " + name;
      callbackContext.success(message);
      return true;
    }
}
