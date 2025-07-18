package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qjt implements qjq {
    private static final tvn a = tvn.n("GnpSdk");
    private final Context b;
    private final qei c;
    private final ntp d;

    public qjt(Context context, qei qeiVar, ntp ntpVar) {
        qeiVar.getClass();
        ntpVar.getClass();
        this.b = context;
        this.c = qeiVar;
        this.d = ntpVar;
    }

    private final SharedPreferences d() {
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("com.google.android.libraries.notifications.GCM", 0);
        sharedPreferences.getClass();
        return sharedPreferences;
    }

    private final FirebaseInstanceId e() {
        FirebaseInstanceId firebaseInstanceId = FirebaseInstanceId.getInstance(qiw.a(this.b, this.d, this.c));
        firebaseInstanceId.getClass();
        return firebaseInstanceId;
    }

    private final synchronized void f(String str) {
        d().edit().putString("reg_id", str).apply();
    }

    @Override // defpackage.qjq
    public final synchronized qdl a() {
        sjl.b();
        String str = this.c.b;
        if (str == null) {
            throw new IllegalArgumentException("Project ID must not be null when trying to reset registration token");
        }
        try {
            FirebaseInstanceId firebaseInstanceIdE = e();
            FirebaseInstanceId.j(firebaseInstanceIdE.c);
            if (Looper.getMainLooper() == Looper.myLooper()) {
                throw new IOException("MAIN_THREAD");
            }
            String strI = FirebaseInstanceId.i("");
            String strE = firebaseInstanceIdE.e();
            unc uncVar = firebaseInstanceIdE.e;
            Bundle bundle = new Bundle();
            bundle.putString("delete", "1");
            firebaseInstanceIdE.d(unc.b(uncVar.a(strE, str, strI, bundle)));
            FirebaseInstanceId.h.h(firebaseInstanceIdE.f(), str, strI);
            f(null);
            try {
                c();
            } catch (qjr e) {
                ((tvk) ((tvk) a.g()).i(e)).s("Exception thrown when trying to get token after deletion.");
                return new qjs(e, 65, true);
            }
        } catch (Throwable th) {
            ((tvk) ((tvk) a.g()).i(th)).s("Exception thrown when trying to delete token.");
            return new qjs(th, 64, false);
        }
        return new qdn(ygi.a);
    }

    @Override // defpackage.qjq
    public final synchronized String b() {
        return d().getString("reg_id", null);
    }

    @Override // defpackage.qjq
    public final synchronized String c() {
        String strH;
        sjl.b();
        String str = this.c.b;
        if (str == null) {
            throw new IllegalArgumentException("Project ID must not be null when trying to get registration token");
        }
        try {
            strH = e().h(str, "");
            if (strH == null || strH.length() == 0) {
                throw new qjr();
            }
            if (!yks.e(strH, b())) {
                a.l().s("New registration ID doesn't match the previously stored one.");
                f(strH);
            }
        } catch (Throwable th) {
            if (!(th instanceof IOException) && !(th instanceof AssertionError) && !(th instanceof NullPointerException)) {
                throw th;
            }
            ((tvk) ((tvk) a.g()).i(th)).s("Exception during register with IID.");
            throw new qjr(th);
        }
        return strH;
    }
}
