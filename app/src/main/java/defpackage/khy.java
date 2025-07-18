package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.SignInRequest;
import com.google.android.gms.signin.internal.SignInResponse;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public class khy extends lts implements ket, keu {
    public static final kdy a = ltp.a;
    public final Context b;
    public final Handler c;
    public final kdy d;
    public final Set e;
    public final kjd f;
    public kgt g;
    public ltx h;

    public khy(Context context, Handler handler, kjd kjdVar, kdy kdyVar) {
        this.b = context;
        this.c = handler;
        this.f = kjdVar;
        this.e = kjdVar.b;
        this.d = kdyVar;
    }

    @Override // defpackage.kgd
    public final void a(int i) {
        kgt kgtVar = this.g;
        kgq kgqVar = (kgq) kgtVar.e.l.get(kgtVar.b);
        if (kgqVar != null) {
            if (kgqVar.h) {
                kgqVar.l(new ConnectionResult(1, 17, null, null));
            } else {
                kgqVar.a(i);
            }
        }
    }

    @Override // defpackage.kgd
    public final void b() throws JSONException, NumberFormatException {
        GoogleSignInAccount googleSignInAccount;
        ltx ltxVar = this.h;
        try {
            Account account = ltxVar.t.a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            if ("<<default account>>".equals(account.name)) {
                Context context = ltxVar.b;
                jyj.a.lock();
                try {
                    if (jyj.b == null) {
                        jyj.b = new jyj(context.getApplicationContext());
                    }
                    jyj jyjVar = jyj.b;
                    jyj.a.unlock();
                    String strA = jyjVar.a("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(strA)) {
                        String strA2 = jyjVar.a("googleSignInAccount:" + strA);
                        if (strA2 != null) {
                            try {
                                if (!TextUtils.isEmpty(strA2)) {
                                    JSONObject jSONObject = new JSONObject(strA2);
                                    String strOptString = jSONObject.optString("photoUrl");
                                    Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
                                    long j = Long.parseLong(jSONObject.getString("expirationTime"));
                                    HashSet hashSet = new HashSet();
                                    JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
                                    int i = 0;
                                    for (int length = jSONArray.length(); i < length; length = length) {
                                        hashSet.add(new Scope(1, jSONArray.getString(i)));
                                        i++;
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
                                    kkk.h(string);
                                    googleSignInAccount = new GoogleSignInAccount(strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
                                    googleSignInAccount.f = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
                                }
                            } catch (JSONException unused) {
                            }
                        }
                    }
                    googleSignInAccount = null;
                } catch (Throwable th) {
                    jyj.a.unlock();
                    throw th;
                }
            } else {
                googleSignInAccount = null;
            }
            Integer num = ltxVar.u;
            kkk.k(num);
            ResolveAccountRequest resolveAccountRequest = new ResolveAccountRequest(2, account, num.intValue(), googleSignInAccount);
            ltv ltvVar = (ltv) ltxVar.v();
            SignInRequest signInRequest = new SignInRequest(1, resolveAccountRequest);
            Parcel parcelA = ltvVar.a();
            erv.b(parcelA, signInRequest);
            erv.c(parcelA, this);
            ltvVar.J(12, parcelA);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                c(new SignInResponse(1, new ConnectionResult(1, 8, null, null), null));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // defpackage.lts, defpackage.ltu
    public final void c(SignInResponse signInResponse) {
        this.c.post(new khx(this, signInResponse));
    }

    @Override // defpackage.khm
    public final void i(ConnectionResult connectionResult) {
        this.g.b(connectionResult);
    }
}
