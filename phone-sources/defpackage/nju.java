package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nju {
    private static final Lock c = new ReentrantLock();
    private static nju d;
    public final Lock a = new ReentrantLock();
    public final SharedPreferences b;

    public nju(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static nju c(Context context) {
        ocv.aF(context);
        Lock lock = c;
        lock.lock();
        try {
            if (d == null) {
                d = new nju(context.getApplicationContext());
            }
            nju njuVar = d;
            lock.unlock();
            return njuVar;
        } catch (Throwable th) {
            c.unlock();
            throw th;
        }
    }

    public final GoogleSignInAccount a() {
        String strD;
        String strD2 = d("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strD2) && (strD = d(e("googleSignInAccount", strD2))) != null) {
            try {
                if (TextUtils.isEmpty(strD)) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(strD);
                String strOptString = jSONObject.optString("photoUrl");
                Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
                long j = Long.parseLong(jSONObject.getString("expirationTime"));
                HashSet hashSet = new HashSet();
                JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    hashSet.add(new Scope(jSONArray.getString(i)));
                }
                String strOptString2 = jSONObject.optString("id");
                String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
                String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
                String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
                String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
                String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
                Long lValueOf = Long.valueOf(j);
                String string = jSONObject.getString("obfuscatedIdentifier");
                lValueOf.getClass();
                ocv.aD(string);
                GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
                googleSignInAccount.f = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
                return googleSignInAccount;
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final GoogleSignInOptions b() {
        String strD;
        String strD2 = d("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strD2) && (strD = d(e("googleSignInOptions", strD2))) != null) {
            try {
                Scope scope = GoogleSignInOptions.a;
                if (TextUtils.isEmpty(strD)) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(strD);
                HashSet hashSet = new HashSet();
                JSONArray jSONArray = jSONObject.getJSONArray("scopes");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    hashSet.add(new Scope(jSONArray.getString(i)));
                }
                String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
                return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final String d(String str) {
        this.a.lock();
        try {
            return this.b.getString(str, null);
        } finally {
            this.a.unlock();
        }
    }

    public final String e(String str, String str2) {
        return a.cq(str2, str, ":");
    }

    protected final void f(String str, String str2) {
        this.a.lock();
        try {
            this.b.edit().putString(str, str2).apply();
        } finally {
            this.a.unlock();
        }
    }
}
