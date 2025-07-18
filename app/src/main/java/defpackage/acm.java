package defpackage;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class acm {
    public static Handler d() {
        return new Handler(Looper.getMainLooper());
    }

    public abstract void a(Typeface typeface);

    public final void b() {
        d().post(new Runnable() { // from class: acl
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    public final void c(final Typeface typeface) {
        d().post(new Runnable() { // from class: ack
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a(typeface);
            }
        });
    }
}
