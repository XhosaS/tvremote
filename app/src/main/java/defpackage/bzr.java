package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzr {
    public final Activity a;
    public final afe b;
    public byq c;

    public bzr(Activity activity, afe afeVar) {
        this.a = activity;
        this.b = afeVar;
    }

    public final void a(final byq byqVar) {
        this.c = byqVar;
        new Runnable() { // from class: bzq
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.accept(byqVar);
            }
        }.run();
    }
}
