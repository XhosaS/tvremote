package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aapq {
    public final aahf a;
    public final kcp b;
    private final aapu c;
    private final aamy d;
    private final aamy e;
    private final aang f;

    public aapq(aahf aahfVar, aapu aapuVar, aamy aamyVar, aamy aamyVar2, aang aangVar) {
        aahfVar.d();
        kcp kcpVar = new kcp(aahfVar.c);
        this.a = aahfVar;
        this.c = aapuVar;
        this.b = kcpVar;
        this.d = aamyVar;
        this.e = aamyVar2;
        this.f = aangVar;
    }

    private final String c() {
        aahf aahfVar = this.a;
        aahfVar.d();
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(aahfVar.d.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    public final lvf a(lvf lvfVar) {
        return lvfVar.a(new Executor() { // from class: aapo
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        }, new luj() { // from class: aapp
            @Override // defpackage.luj
            public final Object a(lvf lvfVar2) throws IOException {
                Bundle bundle = (Bundle) lvfVar2.f(IOException.class);
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null) {
                    return string;
                }
                String string2 = bundle.getString("unregistered");
                if (string2 != null) {
                    return string2;
                }
                String string3 = bundle.getString("error");
                if ("RST".equals(string3)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string3 != null) {
                    throw new IOException(string3);
                }
                Log.w("FirebaseMessaging", "Unexpected response: ".concat(bundle.toString()), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        });
    }

    public final lvf b(String str, String str2, Bundle bundle) {
        int iB;
        try {
            bundle.putString("scope", str2);
            bundle.putString("sender", str);
            bundle.putString("subtype", str);
            aahf aahfVar = this.a;
            aahfVar.d();
            bundle.putString("gmp_app_id", aahfVar.e.b);
            aapu aapuVar = this.c;
            bundle.putString("gmsv", Integer.toString(aapuVar.a()));
            bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
            bundle.putString("app_ver", aapuVar.c());
            bundle.putString("app_ver_name", aapuVar.d());
            bundle.putString("firebase-app-name-hash", c());
            try {
                String strC = ((aanl) lvq.d(this.f.k())).c();
                if (TextUtils.isEmpty(strC)) {
                    Log.w("FirebaseMessaging", "FIS auth token is empty");
                } else {
                    bundle.putString("Goog-Firebase-Installations-Auth", strC);
                }
            } catch (InterruptedException | ExecutionException e) {
                Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            }
            bundle.putString("appid", (String) lvq.d(this.f.a()));
            bundle.putString("cliv", "fcm-24.1.2_1p");
            aalx aalxVar = (aalx) this.e.a();
            aaro aaroVar = (aaro) this.d.a();
            if (aalxVar != null && aaroVar != null && (iB = aalxVar.b()) != 1) {
                bundle.putString("Firebase-Client-Log-Type", Integer.toString(iB - 1));
                bundle.putString("Firebase-Client", aaroVar.a());
            }
            return this.b.b(bundle);
        } catch (InterruptedException | ExecutionException e2) {
            return lvq.b(e2);
        }
    }
}
