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
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahp extends alq implements agc, agd {
    private static final qn h = aln.a;
    public final Context a;
    public final Handler b;
    public final Set c;
    public final aid d;
    public alt e;
    public ahe f;
    public final qn g;

    public ahp(Context context, Handler handler, aid aidVar) {
        qn qnVar = h;
        this.a = context;
        this.b = handler;
        this.d = aidVar;
        this.c = aidVar.b;
        this.g = qnVar;
    }

    @Override // defpackage.agx
    public final void a(int i) {
        ahe aheVar = this.f;
        ahc ahcVar = (ahc) aheVar.e.j.get(aheVar.b);
        if (ahcVar != null) {
            if (ahcVar.f) {
                ahcVar.l(new aeq(17));
            } else {
                ahcVar.a(i);
            }
        }
    }

    @Override // defpackage.agx
    public final void b() throws JSONException, NumberFormatException {
        GoogleSignInAccount googleSignInAccount;
        alt altVar = this.e;
        try {
            Account account = altVar.t.a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            if ("<<default account>>".equals(account.name)) {
                Context context = altVar.b;
                ade.a.lock();
                try {
                    if (ade.b == null) {
                        ade.b = new ade(context.getApplicationContext());
                    }
                    ade adeVar = ade.b;
                    ade.a.unlock();
                    String strA = adeVar.a("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(strA)) {
                        String strA2 = adeVar.a("googleSignInAccount:" + strA);
                        if (strA2 != null) {
                            try {
                                if (!TextUtils.isEmpty(strA2)) {
                                    JSONObject jSONObject = new JSONObject(strA2);
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
                                    qp.o(string);
                                    googleSignInAccount = new GoogleSignInAccount(strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
                                    googleSignInAccount.f = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
                                }
                            } catch (JSONException unused) {
                            }
                        }
                    }
                    googleSignInAccount = null;
                } catch (Throwable th) {
                    ade.a.unlock();
                    throw th;
                }
            } else {
                googleSignInAccount = null;
            }
            Integer num = altVar.u;
            qp.p(num);
            aja ajaVar = new aja(2, account, num.intValue(), googleSignInAccount);
            alr alrVar = (alr) altVar.t();
            alu aluVar = new alu(1, ajaVar);
            Parcel parcelC = alrVar.c();
            acl.c(parcelC, aluVar);
            parcelC.writeStrongBinder(this);
            alrVar.e(12, parcelC);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                c(new alv(1, new aeq(8, null), null));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // defpackage.alq
    public final void c(alv alvVar) {
        this.b.post(new bb(this, alvVar, 18, (short[]) null));
    }

    @Override // defpackage.ahl
    public final void i(aeq aeqVar) {
        this.f.b(aeqVar);
    }
}
