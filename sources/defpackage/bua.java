package defpackage;

import android.os.Binder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bua extends Binder {
    public Runnable a;

    public bua(Runnable runnable) {
        this.a = runnable;
    }

    public final void a() {
        this.a = null;
    }
}
