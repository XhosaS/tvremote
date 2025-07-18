package defpackage;

import android.os.Binder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btw extends Binder {
    public Runnable a;
    public int b = 1;

    public final synchronized void a() {
        this.b = 3;
        this.a = null;
    }
}
