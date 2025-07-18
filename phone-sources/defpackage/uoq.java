package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uoq {
    public final uiz a;
    public final nvc b;
    private final uos c;
    private final unj d;
    private final unj e;
    private final unn f;

    public uoq(uiz uizVar, uos uosVar, nvc nvcVar, unj unjVar, unj unjVar2, unn unnVar) {
        this.a = uizVar;
        this.c = uosVar;
        this.b = nvcVar;
        this.d = unjVar;
        this.e = unjVar2;
        this.f = unnVar;
    }

    public static final onz b(onz onzVar) {
        return onzVar.a(new fba(12), new nuz(6));
    }

    private final String c() {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(this.a.f().getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    public final onz a(String str, String str2, Bundle bundle) {
        int iB;
        try {
            bundle.putString("scope", str2);
            bundle.putString("sender", str);
            bundle.putString("subtype", str);
            bundle.putString("gmp_app_id", this.a.d().b);
            uos uosVar = this.c;
            bundle.putString("gmsv", Integer.toString(uosVar.a()));
            bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
            bundle.putString("app_ver", uosVar.c());
            bundle.putString("app_ver_name", uosVar.d());
            bundle.putString("firebase-app-name-hash", c());
            try {
                String str3 = ((unr) osk.s(this.f.j())).a;
                if (TextUtils.isEmpty(str3)) {
                    Log.w("FirebaseMessaging", "FIS auth token is empty");
                } else {
                    bundle.putString("Goog-Firebase-Installations-Auth", str3);
                }
            } catch (InterruptedException | ExecutionException e) {
                Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            }
            bundle.putString("appid", (String) osk.s(this.f.a()));
            bundle.putString("cliv", "fcm-24.1.2_1p");
            umw umwVar = (umw) this.e.a();
            upt uptVar = (upt) this.d.a();
            if (umwVar != null && uptVar != null && (iB = umwVar.b()) != 1) {
                bundle.putString("Firebase-Client-Log-Type", Integer.toString(uiv.h(iB)));
                bundle.putString("Firebase-Client", uptVar.a());
            }
            return this.b.b(bundle);
        } catch (InterruptedException | ExecutionException e2) {
            return osk.q(e2);
        }
    }
}
