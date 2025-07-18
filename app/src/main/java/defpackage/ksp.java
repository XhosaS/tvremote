package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ksp {
    private static volatile ksp g;
    public final String a = "FA";
    protected final ExecutorService b = kor.a.a(1, new ksd());
    public final kqv c = new kqv(this);
    public int d;
    public boolean e;
    public volatile kqz f;

    protected ksp(Context context, Bundle bundle) throws ClassNotFoundException {
        new ArrayList();
        try {
            if (ley.b(context, lbc.a(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, getClass().getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.e = true;
                    Log.w(this.a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        c(new krr(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new kso(this));
        }
    }

    public static ksp a(Context context, Bundle bundle) {
        kkk.k(context);
        if (g == null) {
            synchronized (ksp.class) {
                if (g == null) {
                    g = new ksp(context, bundle);
                }
            }
        }
        return g;
    }

    public final void b(Exception exc, boolean z, boolean z2) {
        this.e |= z;
        if (z) {
            Log.w(this.a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            c(new ksc(this, exc));
        }
        Log.w(this.a, "Error with data collection. Data lost.", exc);
    }

    public final void c(ksg ksgVar) {
        this.b.execute(ksgVar);
    }

    public final void d(String str, String str2, Bundle bundle) {
        c(new ksf(this, str, str2, bundle));
    }
}
