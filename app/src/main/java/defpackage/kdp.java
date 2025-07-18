package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kdp {
    public static final kdp a = new kdp(true, null, null);
    public final boolean b;
    final String c;
    public final Throwable d;

    public kdp(boolean z, String str, Throwable th) {
        this.b = z;
        this.c = str;
        this.d = th;
    }

    public String a() {
        return this.c;
    }

    public final void b() {
        if (this.b || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        Throwable th = this.d;
        if (th != null) {
            Log.d("GoogleCertificatesRslt", a(), th);
        } else {
            Log.d("GoogleCertificatesRslt", a());
        }
    }
}
