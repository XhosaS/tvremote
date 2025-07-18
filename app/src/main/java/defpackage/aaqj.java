package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aaqj {
    final SharedPreferences a;

    public aaqj(Context context) {
        this.a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || d()) {
                return;
            }
            Log.i("FirebaseMessaging", "App restored, clearing state");
            b();
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: ".concat(String.valueOf(e.getMessage())));
            }
        }
    }

    private final String e(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    public final synchronized aaqi a(String str, String str2) {
        aaqi aaqiVar;
        SharedPreferences sharedPreferences = this.a;
        String strE = e(str, str2);
        aaqiVar = null;
        String string = sharedPreferences.getString(strE, null);
        long j = aaqi.a;
        if (!TextUtils.isEmpty(string)) {
            if (string.startsWith("{")) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    aaqiVar = new aaqi(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
                } catch (JSONException e) {
                    Log.w("FirebaseMessaging", "Failed to parse token: ".concat(e.toString()));
                }
            } else {
                aaqiVar = new aaqi(string, null, 0L);
            }
        }
        return aaqiVar;
    }

    public final synchronized void b() {
        this.a.edit().clear().commit();
    }

    public final synchronized void c(String str, String str2, String str3, String str4) {
        String string;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = aaqi.a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str3);
            jSONObject.put("appVersion", str4);
            jSONObject.put("timestamp", jCurrentTimeMillis);
            string = jSONObject.toString();
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to encode token: ".concat(e.toString()));
            string = null;
        }
        if (string == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.putString(e(str, str2), string);
        editorEdit.commit();
    }

    public final synchronized boolean d() {
        return this.a.getAll().isEmpty();
    }
}
