package plugin.copyclipboard;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;
import android.content.Context;
import android.content.ClipboardManager;
import android.content.ClipData;

public class CopyClipboard extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {
      ClipboardManager clipboard = (ClipboardManager) cordova.getActivity().getSystemService(Context.CLIPBOARD_SERVICE);
        if (action.equals("copy")) {
            String str = data.getString(0);
            ClipData clip = ClipData.newPlainText("Text", str);
            clipboard.setPrimaryClip(clip);
            callbackContext.success(str);
            return true;
        } else {
            return false;
        }
    }
}
