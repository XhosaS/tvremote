package defpackage;

import android.support.v7.widget.Toolbar;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ry implements Runnable {
    final /* synthetic */ Toolbar a;

    public ry(Toolbar toolbar) {
        this.a = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.v();
    }
}
