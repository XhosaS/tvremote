package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aapv {
    public static String a(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public static boolean b(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(j("gcm.n.e")));
    }

    public static final Bundle c(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public static final Integer d(String str, Bundle bundle) {
        String strG = g(str, bundle);
        if (TextUtils.isEmpty(strG)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strG));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + a(str) + "(" + strG + ") into an int");
            return null;
        }
    }

    public static final String e(Resources resources, String str, String str2, Bundle bundle) {
        String[] strArr;
        String strG = g(str2.concat("_loc_key"), bundle);
        if (TextUtils.isEmpty(strG)) {
            return null;
        }
        int identifier = resources.getIdentifier(strG, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", a(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray jSONArrayH = h(str2.concat("_loc_args"), bundle);
        if (jSONArrayH == null) {
            strArr = null;
        } else {
            int length = jSONArrayH.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = jSONArrayH.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + a(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e);
            return null;
        }
    }

    public static final String f(Resources resources, String str, String str2, Bundle bundle) {
        String strG = g(str2, bundle);
        return !TextUtils.isEmpty(strG) ? strG : e(resources, str, str2, bundle);
    }

    public static final String g(String str, Bundle bundle) {
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strJ = j(str);
            if (bundle.containsKey(strJ)) {
                str = strJ;
            }
        }
        return bundle.getString(str);
    }

    public static final JSONArray h(String str, Bundle bundle) {
        String strG = g(str, bundle);
        if (TextUtils.isEmpty(strG)) {
            return null;
        }
        try {
            return new JSONArray(strG);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + a(str) + ": " + strG + ", falling back to default");
            return null;
        }
    }

    public static final boolean i(String str, Bundle bundle) {
        String strG = g(str, bundle);
        return "1".equals(strG) || Boolean.parseBoolean(strG);
    }

    private static String j(String str) {
        return !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
    }
}
