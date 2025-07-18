package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kld {
    private final String a = "Auth";
    private final String b;

    public kld(String str) {
        this.b = str;
        for (int i = 2; i <= 7 && !Log.isLoggable(this.a, i); i++) {
        }
    }

    public final void a(String str, Throwable th) {
        Log.e(this.a, this.b.concat(str), th);
    }

    public final void b(String str) {
        Log.e(this.a, this.b.concat(str));
    }

    public final void c(String str) {
        Log.w(this.a, this.b.concat(str));
    }
}
